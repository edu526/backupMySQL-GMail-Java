package DAO;

import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import Model.cCustomer;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImp implements CustomerDao{
    ConnectionDb conn;
    public CustomerDaoImp(){
         this.conn = FactoryConnectionDb.Open();
    }
    @Override
    public List<cCustomer> list(String q) {
        List<cCustomer> _list = new ArrayList<>();
        try
        {   StringBuilder query = new StringBuilder();
            query.append("select * from Customer where nameCustomer like '%").
                    append(q).append("%' ORDER BY nameCustomer DESC");
            ResultSet rs = conn.query(query.toString());
            while(rs.next()) {
                cCustomer p = new cCustomer();
                p.setIdCustomer(rs.getInt("idCustomer"));
                p.setNameCustomer(rs.getString("nameCustomer"));
                p.setLast_name(rs.getString("last_name"));
                p.setDni(rs.getString("dni"));
                p.setCell_phone(rs.getString("cell_phone"));
                p.setPhone(rs.getString("phone"));
                p.setBirthdate(rs.getDate("birthdate"));
                p.setEmail(rs.getString("email"));
                p.setSex(rs.getString("sex"));
                _list.add(p);
                
            }
        }
        catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return _list;
    }

    @Override
    public boolean insert(cCustomer p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("insert into Customer (nameCustomer,last_name,dni,"
                        + "cell_phone,phone,birthdate,email,sex) "
                        + "values (");
                sql.append("'"); sql.append(p.getNameCustomer());sql.append("',");
                sql.append("'"); sql.append(p.getLast_name());sql.append("',");
                sql.append("'"); sql.append(p.getDni());sql.append("',");
                sql.append("'"); sql.append(p.getCell_phone());sql.append("',");
                sql.append("'");sql.append(p.getPhone());sql.append("',");
                sql.append("'");sql.append(p.getBirthdate());sql.append("',");
                sql.append("'");sql.append(p.getEmail());sql.append("',");
                sql.append("'");sql.append(p.getSex());sql.append("')");                
                
                this.conn.execute(sql.toString()); 
            }catch(Exception e){
                 e.printStackTrace();
                 grabado = false;
            }
            finally{
                this.conn.close();
            }
        return grabado;
    }

    @Override
    public boolean update(cCustomer p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("update Customer set ").
                append("nameCustomer='").append(p.getNameCustomer()).append("',").
                append("last_name='").append(p.getLast_name()).append("',").
                append("dni='").append(p.getDni()).append("',").
                append("cell_phone='").append(p.getCell_phone()).append("',").
                append("phone='").append(p.getPhone()).append("',").
                append("birthdate='").append(p.getBirthdate()).append("',").
                append("email='").append(p.getEmail()).append("',").
                append("sex='").append(p.getSex()).append("' ").
                append("where idCliente=");sql.append(p.getIdCustomer());                 
                this.conn.execute(sql.toString()); 
            }catch(Exception e){
                 e.printStackTrace();
                 grabado = false;
            }
            finally{
                this.conn.close();
            }
        return grabado;
    }

    @Override
    public boolean delete(int idCustomer) {        
        boolean f = false;
        try
        {
            StringBuilder query = new StringBuilder();
            query.append("delete from Customer WHERE idCustomer=").
                    append(idCustomer);
            f = conn.execute(query.toString());
        }catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }
        return f;
    }

    @Override
    public cCustomer search(int idCustomer) {        
        cCustomer p = new cCustomer();
        StringBuilder sql = new StringBuilder();
        sql.append("select * from Customer where idCustomer=");
        sql.append(idCustomer);
        try{
             ResultSet rs = this.conn.query(sql.toString());
             while(rs.next()){
                p.setIdCustomer(rs.getInt("idCustomer"));
                p.setNameCustomer(rs.getString("nameCustomer"));
                p.setLast_name(rs.getString("last_name"));
                p.setDni(rs.getString("dni"));
                p.setCell_phone(rs.getString("cell_phone"));
                p.setPhone(rs.getString("phone"));
                p.setBirthdate(rs.getDate("birthdate"));
                p.setEmail(rs.getString("email"));
                p.setSex(rs.getString("sex"));        
             }
         }catch(Exception e){
             e.printStackTrace();
         }
        return p;
    }    

}