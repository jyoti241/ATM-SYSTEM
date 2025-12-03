package atm.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;
    JRadioButton r1, r2, e1, e2;
    JButton next, clear;
    String formno;

    Signup2(String formno) {
        super("APPLICATION FORM");

        this.formno = formno;

        JLabel label2 = new JLabel("Page 2");
        label2.setFont(new Font("Algerian", Font.BOLD, 30));
        label2.setBounds(250, 60, 450, 37);
        add(label2);

        JLabel label3 = new JLabel("Additonal Details");
        label3.setFont(new Font("Algerian", Font.BOLD, 30));
        label3.setBounds(180, 90, 450, 37);
        add(label3);


        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        l3.setBounds(5, 190, 163, 34);
        add(l3);

        String[] religion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252, 235, 219));
        comboBox.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        comboBox.setBounds(195, 190, 357, 34);
        add(comboBox);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        l4.setBounds(5, 240, 178, 34);
        add(l4);

        String[] Category = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(252, 235, 219));
        comboBox2.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        comboBox2.setBounds(195, 240, 357, 34);
        add(comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        l5.setBounds(5, 290, 145, 34);
        add(l5);

        String[] income = {"Null", "<1,50,000", "<2,50,000", "5,00,000", "Uptp 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252, 235, 219));
        comboBox3.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        comboBox3.setBounds(195, 290, 357, 34);
        add(comboBox3);


        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        l6.setBounds(5, 340, 195, 34);
        add(l6);

        String[] educational = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(252, 235, 219));
        comboBox4.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        comboBox4.setBounds(195, 340, 357, 34);
        add(comboBox4);


        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        l7.setBounds(5, 390, 150, 34);
        add(l7);

        String[] Occupation = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(252, 235, 219));
        comboBox5.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        comboBox5.setBounds(195, 390, 357, 34);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN No. : ");
        l8.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        l8.setBounds(5, 440, 150, 34);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        textPan.setBounds(195, 440, 357, 34);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar No. : ");
        l9.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        l9.setBounds(5, 490, 180, 34);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        textAadhar.setBounds(195, 490, 357, 34);
        add(textAadhar);


        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        l10.setBounds(5, 540, 250, 34);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        r1.setBackground(new Color(252, 235, 219));
        r1.setBounds(250, 540, 80, 34);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        r2.setBackground(new Color(252, 235, 219));
        r2.setBounds(350, 540, 80, 34);
        add(r2);

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        l11.setBounds(5, 590, 250, 34);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        e1.setBackground(new Color(252, 235, 219));
        e1.setBounds(250, 590, 80, 34);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        e2.setBackground(new Color(252, 235, 219));
        e2.setBounds(350, 590, 80, 34);
        add(e2);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Algerian", Font.BOLD, 30));
        l12.setBounds(180, 20, 450, 37);
        add(l12);

        JLabel l13 = new JLabel(this.formno);
        l13.setFont(new Font("Algerian", Font.BOLD, 30));
        l13.setBounds(180, 20, 450, 37);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Baskerville Old Face", Font.BOLD, 32));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(420, 710, 120, 42);
        next.addActionListener(this);
        add(next);

      /*  clear = new JButton("Clear");
        clear.setFont(new Font("Baskerville Old Face",Font.BOLD, 32));
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setBounds(280,710,130,42);
        clear.addActionListener(this);
        add(clear);*/

       /* ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(580, 800, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(i2);
        JLabel image = new JLabel(iii3);
        image.setBounds(0, 0, 580, 800);
        add(image);*/

        setLayout(null);
        setSize(580, 800);
        setLocation(360, 5);
        setVisible(true);
        getContentPane().setBackground(new Color(252, 235, 219));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String addhar = textAadhar.getText();

        String scitizen = " ";
        if ((r1.isSelected())) {
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }
        String eAccount = " ";
        if ((r1.isSelected())) {
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount = "No";
        }

      /*  if (e.getSource() == clear) {
            textAadhar.setText(" ");
            textPan.setText(" ");
            comboBox.removeAllItems();
            comboBox2.removeAllItems();
            comboBox3.removeAllItems();
            comboBox4.removeAllItems();
            comboBox5.removeAllItems();
            r1.setSelected(false);
            r2.setSelected(false);
        }*/

        try {
            if (textPan.getText().equals("") || textAadhar.getText().equals("") || comboBox.getSelectedItem().equals("") || comboBox2.getSelectedItem().equals("") || comboBox3.getSelectedItem().equals("") || comboBox4.getSelectedItem().equals("") || comboBox5.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Database Connection = new Database();
                String q = "insert into signuptwo values('%s', '%s', '%s','%s','%s','%s','%s','%s','%s','%s')".formatted(formno, rel, cate, inc, edu, occ, pan, addhar, scitizen, eAccount);
                Connection.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }


        } catch (Exception E) {
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
