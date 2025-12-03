package atm.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;

 class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton submite,cancel;
    String formno;
    Signup3(String formno){

        this.formno = formno;


        JLabel l1 = new JLabel("Page 3");
        l1.setFont(new Font("Algerian",Font.BOLD, 35));
        l1.setBounds(237,8,385,30);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Algerian", Font.BOLD,35));
        l2.setBounds(181,47,450,37);
        add(l2);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Baskerville Old Face",Font.BOLD,21));
        l3.setBounds(5,136,237,34);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Baskerville Old Face",Font.BOLD,17));
        r1.setBackground(new Color(251, 195, 174));
        r1.setBounds(24,185,142,27);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Baskerville Old Face",Font.BOLD,17));
        r2.setBackground(new Color(251, 195, 174));
        r2.setBounds(24,223,192,27);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Baskerville Old Face",Font.BOLD,17));
        r3.setBackground(new Color(251, 195, 174));
        r3.setBounds(24,264,150,27);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Baskerville Old Face",Font.BOLD,17));
        r4.setBackground(new Color(251, 195, 174));
        r4.setBounds(24,301,230,27);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Baskerville Old Face",Font.BOLD,21));
        l4.setBounds(5,355,226,34);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Baskerville Old Face",Font.BOLD,14));
        l5.setBounds(7,380,223,19);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Baskerville Old Face",Font.BOLD,21));
        l6.setBounds(237,355,322,34);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setFont(new Font("Baskerville Old Face",Font.BOLD,14));
        l7.setBounds(210,380,380,19);
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Baskerville Old Face",Font.BOLD,21));
        l8.setBounds(5,410,92,46);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Baskerville Old Face",Font.BOLD,21));
        l9.setBounds(210,410,323,46);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Baskerville Old Face",Font.BOLD,18));
        l10.setBounds(7,440,159,19);
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Baskerville Old Face",Font.BOLD,21));
        l11.setBounds(5,485,311,27);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(251, 195, 174));
        c1.setFont(new Font("Baskerville Old Face",Font.BOLD,17));
        c1.setBounds(324,525,200,27);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(251, 195, 174));
        c2.setFont(new Font("Baskerville Old Face",Font.BOLD,17));
        c2.setBounds(24,525,200,27);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(251, 195, 174));
        c3.setFont(new Font("Baskerville Old Face",Font.BOLD,17));
        c3.setBounds(24,570,200,27);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(251, 195, 174));
        c4.setFont(new Font("Baskerville Old Face",Font.BOLD,17));
        c4.setBounds(324,570,200,27);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(251, 195, 174));
        c5.setFont(new Font("Baskerville Old Face",Font.BOLD,17));
        c5.setBounds(24,615,200,27);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(251, 195, 174));
        c6.setFont(new Font("Baskerville Old Face",Font.BOLD,17));
        c6.setBounds(324,615,200,27);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by decleares that the above entered details correct to the best of my knlowledge.",true);
        c7.setFont(new Font("Baskerville Old Face",Font.BOLD,14));
        c7.setBackground(new Color(252, 235, 219));
        c7.setBounds(10,660,558,40);
        add(c7);

        submite = new JButton("Submit");
        submite.setFont(new Font("Baskerville Old Face", Font.BOLD,17));
        submite.setBackground(Color.BLACK);
        submite.setForeground(Color.WHITE);
        submite.setBounds(45,719,115,34);
        submite.addActionListener(this);
        add(submite);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Baskerville Old Face", Font.BOLD,17));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(410,719,115,34);
        cancel.addActionListener(this);
        add(cancel);

      /*  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/signup3.png"));
        Image i2 = i1.getImage().getScaledInstance(580,800, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(i2);
        JLabel image = new JLabel(iii3);
        image.setBounds(0,0,580,800);
        add(image);*/

        setLayout(null);
        setSize(580,800);
        getContentPane().setBackground(new Color(252, 235, 219));
        setLocation(360, 5);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (r1.isSelected()){
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype ="Fixed Deposit Account";
        }else if (r3.isSelected()){
            atype ="Current Account";
        }else if (r4.isSelected()){
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac = fac+"ATM CARD ";
        } else if (c2.isSelected()) {
            fac = fac+"Internet Banking";
        } else if (c3.isSelected()) {
            fac = fac+"Mobile Banking";
        } else if (c4.isSelected()) {
            fac = fac+"EMAIL Alerts";
        } else if (c5.isSelected()) {
            fac=fac+"Cheque Book";
        } else if (c6.isSelected()) {
            fac=fac+"E-Statement";
        }

        try {
            if (e.getSource()==submite){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else {
                    Database Connection = new Database();
                    String q1 = "insert into signupthree values('"+formno+"','"+cardno+"','"+pin+"','"+fac+"','"+atype+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    Connection.statement.executeUpdate(q1);
                    Connection.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==cancel) {
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
