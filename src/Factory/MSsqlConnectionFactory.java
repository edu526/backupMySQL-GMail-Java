package Factory;

import java.sql.Connection;
import java.sql.DriverManager;

public final class MSsqlConnectionFactory extends ConnectionDb{
    public MSsqlConnectionFactory(String[] params){
        this.params = params;
        this.Open();
    }
    @Override
    Connection Open() {
        try{
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");         
//            this.connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database="+this.params[0]
//                                                +";user="+this.params[1]+";password="+this.params[2]+";");
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost/"
                    +this.params[0],this.params[1],this.params[2]);

        }catch(Exception e){
            e.printStackTrace();
        }
        return this.connection;
    }    
}