import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario2 extends JFrame {

    private JTextField numero2;
    private JTextField textField1;
    private JButton irAlFormulario1Button;
    private JButton abrirFormulario3Button;
    public JPanel panel2;
    private JLabel texto2;

public Formulario2() {
    irAlFormulario1Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame1 = new JFrame("Frame 1");
            frame1.setContentPane(new Formulario1().panel1);
            frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            frame1.pack();
            frame1.setSize(300, 300);
            frame1.setLocationRelativeTo(null);
            frame1.setVisible(true);
        }
    });
    abrirFormulario3Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            JFrame frame3 = new JFrame("Frame 3");
            frame3.setContentPane(new Formulario3().panel3);
            frame3.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            frame3.pack();
            frame3.setSize(300, 300);
            frame3.setLocationRelativeTo(null);
            frame3.setVisible(true);
        }
    });
}
}
