package homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Panel extends JPanel {
    public Panel() {

        Font font = new Font("Arrial", Font.BOLD, 20);
        JButton jButton1 = new JButton("Сгенерировать номер");
        jButton1.setFont(font);
        jButton1.setBackground(Color.green);
        jButton1.setForeground(Color.red);
        TextField textField = new TextField("+7(999)0000000");
        textField.setFont(font);

        add(jButton1);
        add(textField);

        jButton1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               textField.setText(generateTelephoneNumber());
               }
           }
        );

        setVisible(true);

    }
    public String generateTelephoneNumber() {
        Random random = new Random();

        String telephoneNumber = "";
        telephoneNumber += "+7";
        telephoneNumber += "(999)";
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);

        return telephoneNumber;

    }

}
