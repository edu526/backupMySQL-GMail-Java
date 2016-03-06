package DAO;

import Factory.ConnectionDb;
import Factory.FactoryConnectionDb;
import Model.cPosition;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PositionDaoImp implements PositionDao{
    ConnectionDb conn;
    public PositionDaoImp(){
         this.conn = FactoryConnectionDb.Open();
    }
    @Override
    public List<cPosition> list(String q) {
        List<cPosition> _list = new ArrayList<>();
        try
        {   StringBuilder query = new StringBuilder();
            query.append("select * from Position where namePosition like '%").
                    append(q).append("%' ORDER BY namePosition DESC");
            ResultSet rs = conn.query(query.toString());
            while(rs.next()) {
                cPosition p = new cPosition();
                p.setIdPosition(rs.getInt("idPosition"));
                p.setNamePosition(rs.getString("namePosition"));
                p.setDescription(rs.getString("description"));
                p.setSalary(rs.getDouble("salary"));
                _list.add(p);
            }
        }
        catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return _list;
    }

    @Override
    public boolean insert(cPosition p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("insert into Position (namePosition,description,salary) "
                        + "values (");
                sql.append("'"); sql.append(p.getNamePosition());sql.append("','");
                sql.append(p.getDescription());sql.append("',"); 
                sql.append(p.getSalary());sql.append(")");                
                
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
    public boolean update(cPosition p) {        
        boolean grabado = false;
            try{
                StringBuilder sql = new StringBuilder();
                sql.append("update Position set ").
                append("namePosition='").append(p.getNamePosition()).append("',").
                append("description='").append(p.getDescription()).append("',").
                append("salary=").append(p.getSalary()).append("").
                append(" where idPosition=");sql.append(p.getIdPosition());  
                
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
    public boolean delete(int idPosition) {        
        boolean f = false;
        try
        {
            StringBuilder query = new StringBuilder();
            query.append("delete from Position WHERE idPosition=").
                    append(idPosition);
            f = conn.execute(query.toString());
        }catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }
        return f;
    }

    @Override
    public cPosition search(int idPosition) {        
        cPosition p = new cPosition();
        StringBuilder sql = new StringBuilder();
        sql.append("select * from Position where idPosition=");
        sql.append(idPosition);
        try{
             ResultSet rs = this.conn.query(sql.toString());
             while(rs.next()){
                p.setIdPosition(rs.getInt("idPosition"));
                p.setNamePosition(rs.getString("namePosition"));
                p.setDescription(rs.getString("description"));
                p.setSalary(rs.getDouble("salary"));           
             }
         }catch(Exception e){
             e.printStackTrace();
         }finally{
             this.conn.close();
         }
        return p;
    }    

}