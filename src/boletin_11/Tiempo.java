
package boletin_11;
    
import java.time.*;
import javax.swing.JOptionPane;

public class Tiempo {
    public void tiempoTotal(){
        Instant inicio = Instant.now();
        JOptionPane.showInputDialog("ESCRIBE A SEGUINTE FRASE: \nA documentación é todo aquel conxunto \nde manuais impresos ou en formato dixital \nque explique unha aplicación informática. \nPREME ENTER PARA REMATAR");
        Instant fin = Instant.now();
        JOptionPane.showMessageDialog(null, "TARDACHES " +Duration.between(inicio, fin).getSeconds()+ " SEGUNDOS EN ESCRIBIR A FRASE");
    }
}
