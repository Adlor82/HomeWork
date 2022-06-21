package homework8;

import javax.swing.*;
import java.awt.*;

public class WindowApp extends JFrame {

      public WindowApp() {
        setTitle("Генератор телефонных номеров");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 400, 300, 300);
        setResizable(false);

        add(new Panel(), BorderLayout.CENTER);

        setVisible(true);
    }

}
