package DAO;

import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import Model.cUser;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UserDaoImp implements UserDao{
    ConnectionDb conn;
    public UserDaoImp(){
         this.conn = FactoryConnectionDb.Open();
    }
    
    @Override
    public List<cUser> list() {
        List<cUser> _list = new ArrayList<>();
        try
        {   
            StringBuilder query = new StringBuilder();
            query.append("SELECT * FROM User ORDER BY idUser DESC");
            ResultSet rs = conn.query(query.toString());
            while(rs.next()) {
                cUser p = new cUser();
                p.setIdUser(rs.getInt("idUser"));
                p.setUser(rs.getString("user"));
                p.setPass(rs.getString("pass"));
                p.setEmployee_idEmployee(rs.getInt("Employee_idEmployee"));
                _list.add(p);
            }
        }
        catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return _list;
    }

    @Override
    public boolean insert(cUser p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("insert into User (user,pass,Employee_idEmployee)"
                        + "values (");
                sql.append("'"); sql.append(p.getUser());sql.append("',");
                sql.append("'"); sql.append(p.getPass());sql.append("',");
                sql.append(p.getEmployee_idEmployee());sql.append(")");                
                
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
    public boolean update(cUser p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("update User set ").
                append("user='").append(p.getUser()).append("',").
                append("pass='").append(p.getPass()).append("'").
                append(" where idUser=");sql.append(p.getIdUser());                 
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
    public boolean delete(int Employee_idEmployee) {        
        boolean f = false;
        try
        {
            StringBuilder query = new StringBuilder();
            query.append("delete from User WHERE Employee_idEmployee=").
                    append(Employee_idEmployee);
            f = conn.execute(query.toString());
        }catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }
        return f;
    }

    @Override
    public cUser search(int Employee_idEmployee) {        
        cUser p = new cUser();
        StringBuilder sql = new StringBuilder();
        sql.append("select * from User where Employee_idEmployee=").append(Employee_idEmployee);
        try{
             ResultSet rs = this.conn.query(sql.toString());
             while(rs.next()){
                p.setIdUser(rs.getInt("idUser"));
                p.setUser(rs.getString("user"));
                p.setPass(rs.getString("pass"));
                p.setEmployee_idEmployee(rs.getInt("Employee_idEmployee"));              
             }
         }catch(Exception e){
             e.printStackTrace();
         }
        return p;
    }    

}