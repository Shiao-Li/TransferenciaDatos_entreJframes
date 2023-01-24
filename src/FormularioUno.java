import javax.swing.*;

public class FormularioUno {
    private JTextField Texto;
    private JTextField Numero;
    private JLabel Titulo;
    private JButton irAlFormulario2Button;
    private JButton abrirFormulario3Button;
    private JPanel Formulario1;

    public static void main(String[] args) {
        JFrame frame1 = new JFrame("Formulario 1");
        frame1.setContentPane(new FormularioUno().Formulario1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();
        frame1.setSize(300, 300);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
    }
}
