package DAO;

import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import Model.cCategory;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImp implements CategoryDao{
    ConnectionDb conn;
    public CategoryDaoImp(){
         this.conn = FactoryConnectionDb.Open();
    }
    @Override
    public List<cCategory> list(String q) {
        List<cCategory> _list = new ArrayList<>();
        try
        {   StringBuilder query = new StringBuilder();
            query.append("select * from Category where nameCategory like '%").
                    append(q).append("%' ORDER BY nameCategory DESC");
            ResultSet rs = conn.query(query.toString());
            while(rs.next()) {
                cCategory p = new cCategory();
                p.setIdCategory(rs.getInt("idCategory"));
                p.setNameCategory(rs.getString("nameCategory"));
                p.setDescription(rs.getString("description"));
                _list.add(p);
            }
        }
        catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return _list;
    }

    @Override
    public boolean insert(cCategory p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("insert into Category (nameCategory,description)"
                        + "values (");
                sql.append("'"); sql.append(p.getNameCategory());sql.append("',");
                sql.append("'"); sql.append(p.getDescription());sql.append("')");                
                
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
    public boolean update(cCategory p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("update category set ").
                append("nameCategory='").append(p.getNameCategory()).append("',").
                append("description='").append(p.getDescription()).append("'").
                append(" where idCategoria=");sql.append(p.getIdCategory());                 
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
    public boolean delete(int idCategory) {        
        boolean f = false;
        try
        {
            StringBuilder query = new StringBuilder();
            query.append("delete from Category WHERE idCategory=").
                    append(idCategory);
            f = conn.execute(query.toString());
        }catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }
        return f;
    }

    @Override
    public cCategory search(int idCategory) {        
        cCategory p = new cCategory();
        StringBuilder sql = new StringBuilder();
        sql.append("select * from Category where idCategory=");
        sql.append(idCategory);
        try{
             ResultSet rs = this.conn.query(sql.toString());
             while(rs.next()){
                p.setIdCategory(rs.getInt("idCategory"));
                p.setNameCategory(rs.getString("nameCategory"));
                p.setDescription(rs.getString("description"));           
             }
         }catch(Exception e){
             e.printStackTrace();
         }finally{
             this.conn.close();
         }
        return p;
    }    

}