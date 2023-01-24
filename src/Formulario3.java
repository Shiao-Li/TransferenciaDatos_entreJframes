import javax.swing.*;

public class Formulario3 {
    private JTextField texto3;
    private JTextField numero3;
    private JButton irAlFormulario2Button;
    private JButton abrirFormulario1Button;
    private JLabel titulo3;
    private JPanel panel3;


    public static void main(String[] arg){
        JFrame frame = new JFrame("Frame 3");
        frame.setContentPane(new Formulario3().panel3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
