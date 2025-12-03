package atm.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;

    JButton button1, button2, button3;

    Login() {
        super("Bank Management System");
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Algerian", Font.BOLD, 60));
        label1.setBounds(370, 288, 603, 81);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Baskerville Old Face", Font.BOLD, 38));
        label2.setForeground(Color.WHITE);
        label2.setBounds(78, 384, 233, 59);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(370, 381, 388, 62);
        textField2.setFont(new Font("Algerian", Font.BOLD, 32));
        add(textField2);

        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Baskerville Old Face", Font.BOLD, 38));
        label3.setForeground(Color.WHITE);
        label3.setBounds(88, 472, 233, 59);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(370, 472, 388, 62);
        passwordField3.setFont(new Font("Algerian", Font.BOLD, 32));
        add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Baskerville Old Face", Font.BOLD, 38));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(556, 665, 214, 82);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Baskerville Old Face", Font.BOLD, 38));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(663, 566, 214, 82);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Baskerville Old Face", Font.BOLD, 38));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(427, 566, 214, 82);
        button3.addActionListener(this);
        add(button3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image i2 = i1.getImage().getScaledInstance(1283, 783, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(i2);
        JLabel image = new JLabel(iii3);
        image.setBounds(0, 0, 1283, 783);
        add(image);


        setLayout(null);
        setSize(1283, 783);
        setLocation(130, 10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            String cardno = textField2.getText();
            String pin = passwordField3.getText();
            try {
                Database Connection = new Database();
                String q = "select * from login where cardno = '%s' and  pin = '%s'".formatted(cardno, pin);
                ResultSet resultSet = Connection.statement.executeQuery(q);

                if (resultSet.next()) {
                    setVisible(false);
                    new Main(pin);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        }
        if (e.getSource() == button2) {
            textField2.setText("");
            passwordField3.setText("");
        }
        if (e.getSource() == button3) {
            new Signup();
            setVisible(false);

        }
    }
    public static void main (String[]args) throws IOException
    {
        new Login();
    }
}
