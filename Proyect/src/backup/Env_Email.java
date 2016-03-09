package backup;
    import java.net.Socket;
    import java.util.Properties;
    import javax.activation.DataHandler;
    import javax.activation.FileDataSource;
    import javax.mail.BodyPart;
    import javax.mail.Message;
    import javax.mail.Session;
    import javax.mail.Transport;
    import javax.mail.internet.InternetAddress;
    import javax.mail.internet.MimeBodyPart;
    import javax.mail.internet.MimeMessage;
    import javax.mail.internet.MimeMultipart;
public class Env_Email { String usuarioCorreo;
    String password;
    boolean resp;
    String rutaArchivo;
    String nombreArchivo;
    String destinatario;
    String asunto;
    String mensaje;
    public Env_Email(String usuarioCorreo, String password, String rutaArchivo, String nombreArchivo, String destinatario, String asunto,String mensaje) {
        this.usuarioCorreo = usuarioCorreo;
        this.password = password;
        this.rutaArchivo = rutaArchivo;
        this.nombreArchivo = nombreArchivo;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }
    public Env_Email(String usuarioCorre,String password,String destinatario,String mensaje){
        this(usuarioCorre,password,"","",destinatario,"",mensaje);
    }
    public Env_Email(String usuarioCorre,String password,String destinatario,String asunto,String mensaje){
        this(usuarioCorre,password,"","",destinatario,asunto,mensaje);
    }    
    public void sendMail(){
        try
        {
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", usuarioCorreo);
            props.setProperty("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(props, null);
            BodyPart texto = new MimeBodyPart();
            texto.setText(mensaje);
            BodyPart adjunto = new MimeBodyPart();
            if (!rutaArchivo.equals("")){
                 adjunto.setDataHandler(
                    new DataHandler(new FileDataSource(rutaArchivo)));
                adjunto.setFileName(nombreArchivo);                
            }
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            if (!rutaArchivo.equals("")){
                multiParte.addBodyPart(adjunto);
            }
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(usuarioCorreo));
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress(destinatario));
                message.setSubject(asunto);
            message.setContent(multiParte);
            Transport t = session.getTransport("smtp");
            t.connect(usuarioCorreo, password);
            t.sendMessage(message, message.getAllRecipients());
            t.close();
            setrespuesta(true);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            setrespuesta(false);
        }
    }
    public boolean comprobar() {
        String dirWeb = "www.google.com";
        int puerto = 80;
        
        try{
            Socket s = new Socket(dirWeb, puerto);
            if(s.isConnected()){
                System.out.println("Conexión establecida con "
                    + "la dirección: " + dirWeb + " a travéz "
                    + "del puerto: " + puerto);
                return true;
        }
        }catch(Exception e){
        System.err.println("No se pudo establecer conexión con: " + dirWeb + " a travez del puerto: " + puerto);
            return false;
        }
        return false;
    }
    public Env_Email(){    }
    
    public void setrespuesta(boolean resp){
        this.resp=resp;
    }
    public boolean getRespuesta(){
        return resp;
    }
}