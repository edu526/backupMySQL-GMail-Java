package Ejecucion;

import Presentacion.access;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class NewMain {

    public static void main(String[] args) throws IOException, InterruptedException {
        access nu=new access();
            if( new Control().comprobar() ){
                mysql_start();
                nu.show();
                nu.setVisible(true);
            }else{
                System.exit(0);
            }
    }
    
    static void mysql_start() throws IOException, InterruptedException{
        long va = 10;
       
            Runtime rt=Runtime.getRuntime();
            Process p =rt.exec("C:\\xampp\\mysql_start.bat");
            p.waitFor(va, TimeUnit.SECONDS);
       
    }
    public void mysql_stop() throws IOException, InterruptedException{
        long va = 10;
       
            Runtime rt=Runtime.getRuntime();
            Process p =rt.exec("C:\\xampp\\mysql_stop.bat");
            p.waitFor(va, TimeUnit.SECONDS);
       
    }
}
