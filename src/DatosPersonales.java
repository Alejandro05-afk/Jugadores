import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DatosPersonales extends JFrame{
    private JTable table1;
    private JTextField textFieldNombre;
    private JTextField textFieldApellidos;
    private JTextField textFieldEdad;
    private JTextField textFieldEstatura;
    private JTextField textFieldEquipo;
    private JButton agregarButton;
    private JButton limpiarButton;
    private JButton mostrarButton;
    private JPanel DatosPersonales;

    public DatosPersonales(){
        setTitle("Login");
        setContentPane(DatosPersonales);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        String nombre = textFieldNombre.getText();
        String apellidos = textFieldApellidos.getText();
        int edad = Integer.parseInt(textFieldEdad.getText());
        String estatura = textFieldEstatura.getText();
        String equipo = textFieldEquipo.getText();

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
