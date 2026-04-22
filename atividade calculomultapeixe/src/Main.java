import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;
public class Main {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o peso total de peixes"));
        double excesso = 0;
        double multa = 0;
        if (peso > 50) {
            excesso = (peso - 50);
            multa = (excesso * 4);
            JOptionPane.showMessageDialog(null,"excesso"+excesso );
            JOptionPane.showMessageDialog(null,"Multa a pagar"+multa);
        }else
            JOptionPane.showMessageDialog(null,"peso no limite, sem multa");



}
}
