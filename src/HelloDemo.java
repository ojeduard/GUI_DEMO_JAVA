import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloDemo extends JFrame{
    private JPanel panelMain;
    private JTextField txtName;
    private JButton btnClick;

    public HelloDemo() {
        btnClick.addActionListener(new ActionListener() { // Esto se genero automaticamente al agregar accion de listener
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick, "Hello " + txtName.getText() + ", welcome!"); // Esto lo agregue yo para
                // indicarle el mensaje que debe mostrar despues de btnClick o sea, dar click o ejecutar la accion de ese
                // atributo que le di el nombre en el HelloDemo como btnClick que seria el boton de "click me"
            }
        });
    }

    public static void main(String[] args) {
        HelloDemo h = new HelloDemo(); // EL nombre que le di al objeto UI
        h.setContentPane(h.panelMain); // EL nombre que le puse al Panel
        h.setTitle("Hello");
        h.setBounds(400, 200, 400, 200); // Tamano de venta pero hasta con ejes
        //h.setSize(500, 400); // El tamano que le quiero dar a la ventana pero solo altura y anchura
        h.setVisible(true); // Para que sea visible la ventana
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
