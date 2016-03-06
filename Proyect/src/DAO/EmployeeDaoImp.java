package DAO;

import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import Model.cEmployee;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImp implements EmployeeDao{
    ConnectionDb conn;
    public EmployeeDaoImp(){
         this.conn = FactoryConnectionDb.Open();
    }
    @Override
    public List<cEmployee> list(String q) {
        List<cEmployee> _list = new ArrayList<>();
        try
        {   StringBuilder query = new StringBuilder();
            query.append("select * from Employee where nameEmployee like '%").
                    append(q).append("%' ORDER BY nameEmployee DESC");
            ResultSet rs = conn.query(query.toString());
            while(rs.next()) {
                cEmployee p = new cEmployee();
                p.setIdEmployee(rs.getInt("idEmployee"));
                p.setNameEmployee(rs.getString("nameEmployee"));
                p.setLast_name(rs.getString("last_name"));
                p.setDni(rs.getString("dni"));
                p.setCell_phone(rs.getString("cell_phone"));
                p.setPhone(rs.getString("phone"));
                p.setBirthdate(rs.getDate("birthdate"));
                p.setEmail(rs.getString("email"));
                p.setSex(rs.getString("sex"));
                p.setPosition_idPosition(rs.getInt("Position_idPosition"));                
                _list.add(p);
                
            }
        }
        catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return _list;
    }

    @Override
    public boolean insert(cEmployee p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("insert into Customer (nameCustomer,last_name,dni,"
                        + "cell_phone,phone,birthdate,email,sex,Position_idPosition) "
                        + "values (");
                sql.append("'"); sql.append(p.getNameEmployee());sql.append("',");
                sql.append("'"); sql.append(p.getLast_name());sql.append("',");
                sql.append("'"); sql.append(p.getDni());sql.append("',");
                sql.append("'"); sql.append(p.getCell_phone());sql.append("',");
                sql.append("'");sql.append(p.getPhone());sql.append("',");
                sql.append("'");sql.append(p.getBirthdate());sql.append("',");
                sql.append("'");sql.append(p.getEmail());sql.append("',");
                sql.append("'");sql.append(p.getSex());sql.append("',");
                sql.append(p.getPosition_idPosition());sql.append(")");                
                
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
    public boolean update(cEmployee p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("update Customer set ").
                append("nameCustomer='").append(p.getNameEmployee()).append("',").
                append("last_name='").append(p.getLast_name()).append("',").
                append("dni='").append(p.getDni()).append("',").
                append("cell_phone='").append(p.getCell_phone()).append("',").
                append("phone='").append(p.getPhone()).append("',").
                append("birthdate='").append(p.getBirthdate()).append("',").
                append("email='").append(p.getEmail()).append("',").
                append("sex='").append(p.getSex()).append("', ").
                append("Position_idPosition=").append(p.getPosition_idPosition()).append(" ").
                append("where idEmployee=");sql.append(p.getIdEmployee());                 
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
    public boolean delete(int idEmployee) {        
        boolean f = false;
        try
        {
            StringBuilder query = new StringBuilder();
            query.append("delete from Employee WHERE idEmployee=").
                    append(idEmployee);
            f = conn.execute(query.toString());
        }catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }
        return f;
    }

    @Override
    public cEmployee search(int idEmployee) {        
        cEmployee p = new cEmployee();
        StringBuilder sql = new StringBuilder();
        sql.append("select * from Employee where idEmployee=");
        sql.append(idEmployee);
        try{
             ResultSet rs = this.conn.query(sql.toString());
             while(rs.next()){
                p.setIdEmployee(rs.getInt("idEmployee"));
                p.setNameEmployee(rs.getString("nameEmployee"));
                p.setLast_name(rs.getString("last_name"));
                p.setDni(rs.getString("dni"));
                p.setCell_phone(rs.getString("cell_phone"));
                p.setPhone(rs.getString("phone"));
                p.setBirthdate(rs.getDate("birthdate"));
                p.setEmail(rs.getString("email"));
                p.setSex(rs.getString("sex"));       
                p.setPosition_idPosition(rs.getInt("Position_idPosition"));
             }
         }catch(Exception e){
             e.printStackTrace();
         }
        return p;
    }    

}