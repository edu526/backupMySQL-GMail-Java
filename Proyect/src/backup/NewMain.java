package backup;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author DEXTER
 */
public class NewMain {
    public static void main(String[] args)  {
        long va = 10;
        try
        {
            Runtime rt=Runtime.getRuntime();
            Process p =rt.exec(System.getProperty("user.dir")+"\\src\\backup\\backup.bat");
            p.waitFor(va, TimeUnit.SECONDS);
            send();
            File file = new File(System.getProperty("user.dir")+"/src/backup/backup/");
            borrar_Directorio(file);
            
        }
        catch (IOException ioe )
        {
            ioe.getStackTrace();
        }
        catch (InterruptedException ie )
        {
        }

    }
    
    static void send (){
        Env_Email co = new Env_Email();

        String rutaArchivo="";
        String nombreArchivo="";
        String asunto="";
        String usuarioCorreo = "algoritmolibre@gmail.com";
        String password = "eduardo5265807";
        String destinatario = "algoritmolibre@gmail.com";
        String mensaje = "Copia de seguridad de Base de Datos";
        
                rutaArchivo =System.getProperty("user.dir")+"/src/backup/backup/proyect.sql" ;
                nombreArchivo = "proyect.sql";
                asunto = "Copia de seguridad de Base de Datos";
        
        File path = new File (rutaArchivo);
        if(co.comprobar())
        {
            Env_Email cen = new Env_Email(usuarioCorreo, password, rutaArchivo, nombreArchivo, destinatario, asunto, mensaje);
            cen.sendMail();
            if (cen.getRespuesta()){
                    path.delete();
                JOptionPane.showMessageDialog(null,"El email se mandó correctamente");
                
            }else
            JOptionPane.showMessageDialog(null,"El email no se mandó correctamente");
        }
        else
        JOptionPane.showMessageDialog(null, "No cuenta con conexcion a internet.\nVerifique su conexcion. "
            + "O comunicace con el tècnico");
    }
           
    static void borrar_Directorio(File directorio){
        //borrar ficheros internos
        File[] ficheros = directorio.listFiles();
        for(int x=0;x<ficheros.length;x++){
                 if (ficheros[x].isDirectory()) {
              borrar_Directorio(ficheros[x]);
            }
            ficheros[x].delete();
        }
        directorio.delete();
    }
}
