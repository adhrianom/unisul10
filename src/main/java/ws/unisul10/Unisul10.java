
package ws.unisul10;
import javax.swing.JOptionPane;
public class Unisul10 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
        int soma = num1 + num2;
        
        if (soma > 10) {
            JOptionPane.showMessageDialog(null, soma);
        }
        
    }
}
