import javax.swing.*;

public class FormularioUno {
    private JTextField textField1;
    private JTextField textField2;
    private JLabel Titutlo;
    private JButton button1;
    private JButton button2;
    private JPanel Formulario1;

    public static void main(String[] args) {
        JFrame frame1 = new JFrame("Formulario 1");
        frame1.setContentPane(new FormularioUno().Formulario1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        frame1.pack();
    }
}
