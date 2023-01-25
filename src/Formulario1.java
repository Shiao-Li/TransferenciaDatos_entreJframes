import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario1 extends JFrame {
    public JTextField texto1;
    public JTextField Numeros1;
    private JButton irAlFormulario2Button;
    private JButton abrirElFormulario3Button;
    private JLabel Titulo1;
    public JPanel panel1;

    public Formulario1( ) {

        irAlFormulario2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame2 = new JFrame("Frame 2");
                frame2.setSize(300, 300);
                frame2.setContentPane(new Formulario2().panel2);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.pack();
                frame2.setLocationRelativeTo(null);
                frame2.setVisible(true);
                dispose();
            }
        });
        abrirElFormulario3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame3 = new JFrame("Frame 3");
                frame3.setContentPane(new Formulario3().panel3);
                frame3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame3.pack();
                frame3.setSize(300, 300);
                frame3.setLocationRelativeTo(null);
                frame3.setVisible(true);
                dispose();
            }
        });

    }

    public static void main(String[] arg) {


        JFrame frame1 = new JFrame("Frame 1");
        frame1.setContentPane(new Formulario1().panel1);
        frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame1.pack();
        frame1.setSize(300, 300);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
    }
}
