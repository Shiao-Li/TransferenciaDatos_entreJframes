import javax.swing.*;

public class formulario2 {

    private JTextField numero2;
    private JTextField textField1;
    private JButton irAlFormulario1Button;
    private JButton abrirFormulario3Button;
    private JPanel panel2;
    private JLabel texto2;

    public static void main(String[] arg){
        JFrame frame = new JFrame("x1");
        frame.setContentPane(new formulario2().panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
