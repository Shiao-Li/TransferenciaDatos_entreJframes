import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario1 extends JFrame { //Clase principal donde se implementa las acciones del los formularios
    public JTextField texto1;
    public JTextField Numeros1;
    public JButton irAlFormulario2Button;
    private JButton abrirElFormulario3Button;
    private JLabel Titulo1;
    public JPanel panel1;
    private String texto;
    private int numeros;


    public Formulario1( ) {

        irAlFormulario2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("Frame 2"); //Creaccion de un objeto que nos ayudara a utilizar las instancias del formulario 2
                Formulario2 f2 = new Formulario2();

                f2.setDato1(texto1.getText(), Integer.parseInt(Numeros1.getText()));

                frame2.setSize(300, 300);
                frame2.setContentPane(f2.panel2);
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
                JFrame frame3 = new JFrame("Frame 3"); // creacion de un objeto el cual nos ayudara a utilizar las instancias del formulario 3
                Formulario3 f3 = new Formulario3();

                f3.setDato2(texto1.getText(), Integer.parseInt(texto1.getText()));

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

    public static void main(String[] arg) {
        JFrame frame1 = new JFrame("Frame 1");
        Formulario1 f1 = new Formulario1();


        frame1.setContentPane(f1.panel1);
        frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame1.pack();
        frame1.setSize(300, 300);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
    }

    public void setDato0(String texto, int numeros){
        this.texto=texto;
        this.numeros=numeros;

        texto1.setText(texto);
        Numeros1.setText(String.valueOf(numeros));
    }
}
