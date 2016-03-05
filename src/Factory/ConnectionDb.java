package Factory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public abstract class ConnectionDb {
    protected String[] params;
    protected Connection connection;    
    abstract Connection Open();
    public ResultSet query(String sql){
       Statement st;
       ResultSet rs = null;
       try{
           st = connection.createStatement();
           rs = st.executeQuery(sql);           
       }catch(SQLException e){
           e.printStackTrace();
       }
       return rs;
    }
    public boolean execute(String sql){
        Statement st;
        boolean ok = true;
        try{
           st = connection.createStatement();
           st.executeUpdate(sql);           
       }catch(SQLException e){
           e.printStackTrace();
           ok = false;
       }
        return ok;
    }
    public boolean close(){
        boolean ok = true;
        try{
           connection.close();
       }catch(SQLException e){
           ok = false;
           e.printStackTrace();           
       }
        return ok;
    }
}