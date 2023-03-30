import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JTextField;


public class cuadroTexto extends JTextField implements FocusListener {

    @Override
    public void focusGained(FocusEvent e) {
        this.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 0, new Color(75,132,255)));
    }

    @Override
    public void focusLost(FocusEvent e) {
        this.setBorder(null);
    }


}
