import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario2 extends JFrame {

    public JTextField numero2;
    public JTextField textField1;
    public JButton irAlFormulario1Button;
    private JButton abrirFormulario3Button;
    public JPanel panel2;
    private JLabel texto2;
    private String texto;
    private int numeros;

    public Formulario2() {
        irAlFormulario1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame1 = new JFrame("Frame 1");
                Formulario1 f1 = new Formulario1();

                f1.setDato0(textField1.getText(), Integer.parseInt(numero2.getText()));

                frame1.setContentPane(f1.panel1);
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
                JFrame frame3 = new JFrame("Frame 3");
                Formulario3 f3 = new Formulario3();

                f3.setDato2(textField1.getText(), Integer.parseInt(numero2.getText()));

                frame3.setContentPane(f3.panel3);
                frame3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame3.pack();
                frame3.setSize(300, 300);
                frame3.setLocationRelativeTo(null);
                frame3.setVisible(true);
                dispose();
            }
        });
    }
    public void setDato1(String texto, int numeros){
        this.texto=texto;
        this.numeros=numeros;

        textField1.setText(texto);
        numero2.setText(String.valueOf(numeros));
    }
}
