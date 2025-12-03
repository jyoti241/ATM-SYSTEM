package atm.system;


import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

 class Signup extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, m1, m2, m3;
    JButton next;

    JTextField textName, textFname, textEmail, textAdd, textcity, textState, textPin, textPhoneno;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");


        JLabel l1 = new JLabel("APPLICATION FORM -" + first);
        l1.setBounds(80, 9, 550, 34);
        l1.setFont(new Font("Algerian", Font.BOLD, 38));
        add(l1);

        JLabel l2 = new JLabel("PAGE -1");
        l2.setBounds(247, 60, 171, 34);
        l2.setFont(new Font("Algerian", Font.BOLD, 38));
        add(l2);

        JLabel l3 = new JLabel("PERSONAL DETAILS");
        l3.setBounds(171, 115, 400, 34);
        l3.setFont(new Font("Algerian", Font.BOLD, 38));
        add(l3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        labelName.setBounds(5, 167, 116, 34);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        textName.setBounds(150, 167, 400, 34);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        labelfName.setBounds(5, 220, 200, 34);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        textFname.setBounds(150, 220, 400, 34);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        DOB.setBounds(5, 318, 200, 34);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setBackground(new Color(252, 235, 219));
        dateChooser.setBounds(150, 318, 400, 34);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        labelG.setBounds(5, 275, 200, 34);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
        r1.setBackground(new Color(252, 235, 219));
        r1.setBounds(150, 275, 60, 34);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(252, 235, 219));
        r2.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
        r2.setBounds(300, 275, 80, 34);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setBackground(new Color(252, 235, 219));
        r3.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
        r3.setBounds(450, 275, 70, 34);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        labelEmail.setBounds(5, 375, 200, 34);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
        textEmail.setBounds(150, 375, 400, 34);
        add(textEmail);


        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        labelMs.setBounds(5, 428, 200, 34);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(150, 428, 80, 34);
        m1.setBackground(new Color(252, 235, 219));
        m1.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(252, 235, 219));
        m2.setBounds(300, 428, 100, 34);
        m2.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(252, 235, 219));
        m3.setBounds(450, 428, 70, 34);
        m3.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        labelAdd.setBounds(5, 485, 200, 34);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
        textAdd.setBounds(150, 485, 400, 34);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        labelCity.setBounds(5, 540, 200, 34);
        add(labelCity);

        textcity = new JTextField();
        textcity.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
        textcity.setBounds(150, 540, 400, 34);
        add(textcity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        labelPin.setBounds(5, 645, 200, 34);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
        textPin.setBounds(150, 645, 400, 34);
        add(textPin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        labelstate.setBounds(5, 591, 200, 34);
        add(labelstate);

        textState = new JTextField();
        textState.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
        textState.setBounds(150, 591, 400, 34);
        add(textState);

        JLabel labelPhoneno = new JLabel("Phone no :");
        labelPhoneno.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        labelPhoneno.setBounds(5, 690, 200, 34);
        add(labelPhoneno);

        textPhoneno = new JTextField();
        textPhoneno.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
        textPhoneno.setBounds(150, 690, 400, 34);
        add(textPhoneno);

        next = new JButton("Next");
        next.setFont(new Font("Baskerville Old Face", Font.BOLD, 32));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(420, 730, 120, 42);
        next.addActionListener(this);
        add(next);

      /* clear = new JButton("Clear");
        clear.setFont(new Font("Baskerville Old Face", Font.BOLD, 32));
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setBounds(280, 730, 130, 42);
        clear.addActionListener(this);
        add(clear);*/

        /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(580,800, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(i2);
        JLabel image = new JLabel(iii3);
        image.setBounds(0,0,580,800);
        add(image);*/


        setLayout(null);
        setSize(580, 800);
        getContentPane().setBackground(new Color(252, 235, 219));
        setLocation(360, 5);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        } else if (r3.isSelected()) {
            gender = "Other";
        }
        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected()) {
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textcity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();
        String phno = textPhoneno.getText();

        try {
            if (textName.getText().isEmpty() || textFname.getText().isEmpty() || textAdd.getText().isEmpty() || textEmail.getText().isEmpty() || textPhoneno.getText().isEmpty() || textcity.getText().isEmpty() || textPin.getText().isEmpty() || textState.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Database Connection = new Database();
                String q = "insert into signup values('%s', '%s','%s','%s','%s','%s','%s', '%s', '%s','%s','%s','%s' )".formatted(formno, name, fname, dob, gender, email, marital, address, city, pincode, state, phno);
                Connection.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);

            }


        } catch (Exception E) {
            E.printStackTrace();
        }
    }

     /*  textName.setText("");
        textFname.setText("");
        textEmail.setText("");
        textAdd.setText("");
        textcity.setText("");
        textState.setText("");
        textPin.setText("");
        textPhoneno.setText("");
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.clearSelection();
        dateChooser.setDate(null);
        group = new ButtonGroup();
        group.add(m1);
        group.add(m2);
        group.add(m3);
        group.clearSelection();*/


    public static void main(String[] args) {
        new Signup();
    }
}
