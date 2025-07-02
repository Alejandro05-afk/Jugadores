import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField textUsuario;
    private JPasswordField passwordField1;
    private JComboBox comboPerfil;
    private JButton accesoButton;
    private JPanel Login;
    private JPanel nuevo;

    public Login() {
        setTitle("Login");
        setContentPane(Login);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = textUsuario.getText();
                String contrasenia = String.valueOf(passwordField1.getPassword());
                String rol = (String) comboPerfil.getSelectedItem();

                if (usuario.isEmpty() || contrasenia.isEmpty()){
                    JOptionPane.showMessageDialog(null,"LOS CAMPOS ESTAN VACIOS");
                }

                if (rol.equals("Administrador") && usuario.equals("Admin") && contrasenia.equals("1234")){
                    new Bienvenido();
                    setVisible(true);
                    dispose();
                }
                if (rol.equals("Jugador") && usuario.equals("Jug") && contrasenia.equals("123")){
                    new DatosPersonales();
                    setVisible(true);
                    dispose();
                }
                if (!usuario.equals("Jug") || !contrasenia.equals("123") || !usuario.equals("Admin") || !contrasenia.equals("1234")){
                    JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos");
                }
            }
        });
    }

}
