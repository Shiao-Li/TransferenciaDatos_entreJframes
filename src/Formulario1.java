import javax.swing.*;

public class Formulario1 {
    private JTextField texto1;
    private JTextField Numeros1;
    private JButton irAlFormulario2Button;
    private JButton abrirElFormulario3Button;
    private JLabel Titulo1;
    private JPanel panel1;


    public static void main(String[] arg){
        JFrame frame = new JFrame("Frame 1");
        frame.setContentPane(new Formulario1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
