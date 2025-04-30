package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {

    JRadioButton SA, FDA, CA, RDA;
    JLabel type, cn, note, number, pindetail, pin, pnumber, services;
    JCheckBox c1, c2, c3, c4, c5, c6, tick;
    JButton submit, cancel;
    String formno;

    SignupThree(String formno) {
        setTitle("SignUp");
        this.formno = formno;
        setLayout(null);
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        type = new JLabel("Account Type");
        type.setBounds(100, 130, 200, 30);
        type.setFont(new Font("Raleway", Font.BOLD, 25));
        add(type);

        SA = new JRadioButton("Saving Account");
        SA.setBounds(100, 170, 200, 20);
        SA.setFont(new Font("Raleway", Font.BOLD, 15));
        SA.setBackground(Color.WHITE);
        add(SA);

        FDA = new JRadioButton("Fixed Deposit Account");
        FDA.setBounds(400, 170, 400, 20);
        FDA.setFont(new Font("Raleway", Font.BOLD, 15));
        FDA.setBackground(Color.WHITE);
        add(FDA);

        CA = new JRadioButton("Current Account");
        CA.setBounds(100, 210, 200, 20);
        CA.setFont(new Font("Raleway", Font.BOLD, 15));
        CA.setBackground(Color.WHITE);
        add(CA);

        RDA = new JRadioButton("Recurring Deposit Account");
        RDA.setBounds(400, 210, 400, 20);
        RDA.setFont(new Font("Raleway", Font.BOLD, 15));
        RDA.setBackground(Color.WHITE);
        add(RDA);

        cn = new JLabel("Card Number :");
        cn.setBounds(100, 280, 300, 45);
        cn.setFont(new Font("Raleway", Font.BOLD, 22));
        add(cn);

        note = new JLabel("Your 16 Digit Card Number ");
        note.setBounds(100, 310, 300, 45);
        note.setFont(new Font("Raleway", Font.BOLD, 13));
        add(note);

        number = new JLabel("XXXX-XXXX-XXXX-4586");
        number.setBounds(400, 280, 400, 45);
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        add(number);

        pin = new JLabel("PIN : ");
        pin.setBounds(100, 380, 300, 45);
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        add(pin);

        pindetail = new JLabel("Your 4 Digit Password ");
        pindetail.setBounds(100, 410, 300, 45);
        pindetail.setFont(new Font("Raleway", Font.BOLD, 13));
        add(pindetail);

        pnumber = new JLabel("XXXX");
        pnumber.setBounds(400, 380, 400, 45);
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        add(pnumber);

        services = new JLabel("Service Required: ");
        services.setBounds(100, 470, 300, 45);
        services.setFont(new Font("Raleway", Font.BOLD, 25));
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setBounds(100, 520, 200, 30);
        c1.setFont(new Font("Raleway", Font.BOLD, 15));
        add(c1);

        c2 = new JCheckBox("Internet Baning");
        c2.setBackground(Color.WHITE);
        c2.setBounds(400, 520, 200, 30);
        c2.setFont(new Font("Raleway", Font.BOLD, 15));
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setBounds(100, 570, 200, 30);
        c3.setFont(new Font("Raleway", Font.BOLD, 15));
        add(c3);

        c4 = new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setBounds(400, 570, 200, 30);
        c4.setFont(new Font("Raleway", Font.BOLD, 15));
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setBounds(100, 620, 200, 30);
        c5.setFont(new Font("Raleway", Font.BOLD, 15));
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setBounds(400, 620, 200, 30);
        c6.setFont(new Font("Raleway", Font.BOLD, 15));
        add(c6);

        tick = new JCheckBox("I hereby that the above entered details are correct to the best of my knowledge");
        tick.setBackground(Color.WHITE);
        tick.setBounds(100, 700, 800, 30);
        tick.setFont(new Font("Raleway", Font.BOLD, 12));
        add(tick);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(200, 740, 120, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancle");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(400, 740, 120, 30);
        cancel.addActionListener(this);
        add(cancel);

        setSize(850, 820);
        setLocation(350, 0);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = null;
            if (SA.isSelected()) {
                accountType = "Saving Account";
            } else if (FDA.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (CA.isSelected()) {
                accountType = "Current Account";
            } else if (RDA.isSelected()) {
                accountType = "Reccuring Deposit Account";
            }

            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String facility = "";
            if (c1.isSelected()) {
                facility = facility + "ATM CARD";
            } else if (c2.isSelected()) {
                facility = facility + "Internet Banking";
            } else if (c2.isSelected()) {
                facility = facility + "Mobile Banking";
            } else if (c2.isSelected()) {
                facility = facility + "EMAILS & SMS Alerts";
            } else if (c2.isSelected()) {
                facility = facility + "Cheque Book";
            } else if (c2.isSelected()) {
                facility = facility + "E-Statement";
            }

            try {
                if (accountType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                } else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('" + formno + "', '" + accountType + "','" + cardnumber + "','" + pinnumber + "','" + facility + "')";
                    String query2 = "insert into login values('" + formno + "', '" + cardnumber + "','" + pinnumber + "')";

                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "card Number:" + cardnumber + "\n Pin:" + pinnumber);
                   
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == cancel) {
         setVisible(false);
         new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new SignupThree("");
    }

}