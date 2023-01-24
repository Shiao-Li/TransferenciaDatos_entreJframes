import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario3 extends  JFrame{
    private JTextField texto3;
    private JTextField numero3;
    private JButton irAlFormulario2Button;
    private JButton abrirFormulario1Button;
    private JLabel titulo3;
    public JPanel panel3;


public Formulario3() {
    irAlFormulario2Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            JFrame frame2 = new JFrame("Frame 2");
            frame2.setSize(300, 300);
            frame2.setContentPane(new Formulario2().panel2);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.setLocationRelativeTo(null);
            frame2.setVisible(true);
            //frame2.pack();
        }
    });
    abrirFormulario1Button.addActionListener(new ActionListener() {
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
}
}
