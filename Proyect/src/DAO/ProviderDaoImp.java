package DAO;

import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import Model.cProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProviderDaoImp implements ProviderDao{
    ConnectionDb conn;
    public ProviderDaoImp(){
         this.conn = FactoryConnectionDb.Open();
    }
    @Override
    public List<cProvider> list(String q) {
        List<cProvider> _list = new ArrayList<>();
        try
        {   StringBuilder query = new StringBuilder();
            query.append("select * from Provider where nameProvider like '%").
                    append(q).append("%' ORDER BY nameProvider DESC");
            ResultSet rs = conn.query(query.toString());
            while(rs.next()) {
                cProvider p = new cProvider();
                p.setIdProvider(rs.getInt("idProvider"));
                p.setNameProvider(rs.getString("nameProvider"));
                p.setAddres(rs.getString("addres"));
                p.setCell_phone(rs.getString("cell_phone"));
                p.setPhone(rs.getString("phone"));
                p.setDescription(rs.getString("description"));
                p.setEmail(rs.getString("email"));
                _list.add(p);
            }
        }
        catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return _list;
    }

    @Override
    public boolean insert(cProvider p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("insert into Provider (nameProvider,addres,cell_phone,"
                        + "phone,description,email) "
                        + "values (");
                sql.append("'"); sql.append(p.getNameProvider());sql.append("',");
                sql.append("'"); sql.append(p.getAddres());sql.append("',");
                sql.append("'"); sql.append(p.getCell_phone());sql.append("',");
                sql.append("'"); sql.append(p.getPhone());sql.append("',");
                sql.append("'"); sql.append(p.getDescription());sql.append("',");
                sql.append("'"); sql.append(p.getEmail());sql.append("')");                
                
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
    public boolean update(cProvider p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("update Provider set ").
                append("nameProvider='").append(p.getNameProvider()).append("',").
                append("addres='").append(p.getAddres()).append("',").
                append("cell_phone='").append(p.getCell_phone()).append("',").
                append("phone='").append(p.getPhone()).append("',").
                append("description='").append(p.getDescription()).append("',").
                append("email='").append(p.getEmail()).append("'").
                append(" where idProvider=");sql.append(p.getIdProvider());   
                
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
    public boolean delete(int idProvider) {        
        boolean f = false;
        try
        {
            StringBuilder query = new StringBuilder();
            query.append("delete from Provider WHERE idProvider=").
                    append(idProvider);
            f = conn.execute(query.toString());
        }catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }
        return f;
    }

    @Override
    public cProvider search(int idProvider) {        
        cProvider p = new cProvider();
        StringBuilder sql = new StringBuilder();
        sql.append("select * from Provider where idProvider=");
        sql.append(idProvider);
        try{
             ResultSet rs = this.conn.query(sql.toString());
             while(rs.next()){
                p.setIdProvider(rs.getInt("idProvider"));
                p.setNameProvider(rs.getString("nameProvider"));
                p.setAddres(rs.getString("addres"));
                p.setCell_phone(rs.getString("cell_phone"));
                p.setPhone(rs.getString("phone"));
                p.setDescription(rs.getString("description"));
                p.setEmail(rs.getString("email"));                   
             }
         }catch(Exception e){
             e.printStackTrace();
         }finally{
             this.conn.close();
         }
        return p;
    }    

}