import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario3 extends JFrame {
    public JTextField texto3;
    public JTextField numero3;
    private JButton irAlFormulario2Button;
    private JButton abrirFormulario1Button;
    private JLabel titulo3;
    public JPanel panel3;

    private String texto;
    private int numeros;


    public Formulario3() {

        irAlFormulario2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("Frame 2");
                Formulario2 f2 = new Formulario2();

                f2.setDato1(texto3.getText(), Integer.parseInt(numero3.getText()));

                frame2.setSize(300, 300);
                frame2.setContentPane(f2.panel2);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.pack();
                frame2.setLocationRelativeTo(null);
                frame2.setVisible(true);
                dispose();
            }
        });
        abrirFormulario1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame1 = new JFrame("Frame 1");
                Formulario1 f1 = new Formulario1();

                f1.setDato0(texto3.getText(), Integer.parseInt(numero3.getText()));

                frame1.setContentPane(f1.panel1);
                frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame1.pack();
                frame1.setSize(300, 300);
                frame1.setLocationRelativeTo(null);
                frame1.setVisible(true);
            }
        });
    }
    public void setDato2(String texto, int numeros){
        this.texto=texto;
        this.numeros=numeros;

        texto3.setText(texto);
        numero3.setText(String.valueOf(numeros));
    }

}
