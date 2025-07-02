import javax.swing.*;

public class Bienvenido extends JFrame {
    private JPanel Bienvenidos;

    public Bienvenido(){
        setTitle("Bienvenidos");
        setContentPane(Bienvenidos);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
