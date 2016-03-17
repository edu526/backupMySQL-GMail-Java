package Factory;

public class FactoryConnectionDb {
 public static String[] configMSsql={"proyect","root","root"};
 public static String Mensaje = "Control de Ventas";
 public static String user = "";
 public static int idUser ;
 public static String pass = "";
 public static int idEmployee ;
 public static int idCargo;
 public static ConnectionDb Open(){
     return new MSsqlConnectionFactory(configMSsql);
 }
}