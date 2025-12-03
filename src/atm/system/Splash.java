package atm.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Thread t;
    Splash() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/splas1.png"));
        Image i2 = i1.getImage().getScaledInstance(1287, 783, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        setVisible(true);


        int x = 1100;
        for (int i = 2; i < 790; i += 4, x += 1) {
            setSize(1352, i);
            setLocation(800 - (1352 / 2), 30);
        try {
                Thread.sleep(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        t = new Thread(this);
        t.start();

        setVisible(true);
    }

    public void run() {
        try {
            Thread.sleep(1000);
            setVisible(false);


            new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}
