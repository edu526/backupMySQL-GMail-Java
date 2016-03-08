
package Presentacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

public class validarEmail extends InputVerifier{
public final static int Email=1;
private Pattern pat;
private Matcher mat;
private static final String emailpat="^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z](2,4)$";

    @Override
    public boolean verify(JComponent input) {
        JTextComponent cmp=(JTextComponent)input;
        String texto=cmp.getText();
       
                if (esvalido(texto)){
                return true;
                }
        JOptionPane.showMessageDialog(null, "Email no valido");
return true;
    }
    private boolean esvalido(String String ){
   
            pat=Pattern.compile(emailpat);
            mat=pat.matcher(String);
            return mat.matches();
        
    }
}
