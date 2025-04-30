package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
public class  FastCash extends JFrame implements ActionListener{
    
    JButton fiveh,oneh,onet,twot,fivet,tent,exit;
    JLabel text;
    String pinnumber;
     FastCash(String pinnumber){
          setTitle("Fact Cash");
        this.pinnumber = pinnumber;
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD, 16));
        image.add(text);
        
        oneh = new JButton("Rs 100");
        oneh.setBounds(170, 415, 150, 30);
        oneh.addActionListener(this);
        image.add(oneh);
 
        fiveh = new JButton("Rs 500");
        fiveh.setBounds(355,415,150,30);
        fiveh.addActionListener(this);
        image.add(fiveh);
        
        onet = new JButton("Rs 1000");
        onet.setBounds(170,450,150,30);
        onet.addActionListener(this);
        image.add(onet);
        
        twot = new JButton("Rs 2000");
        twot.setBounds(355,450,150,30);
        twot.addActionListener(this);
        image.add(twot);
        
        fivet = new JButton("Rs 5000");
        fivet.setBounds(170,485,150,30);
        fivet.addActionListener(this);
        image.add(fivet);
        
        tent = new JButton("Rs 10000");
        tent.setBounds(355,485,150,30);
        tent.addActionListener(this);
        image.add(tent);
        
        exit = new JButton("Back");
        exit.setBounds(260,520,150,30);
        exit.addActionListener(this);
        image.add(exit);
      
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
        public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == exit){
         setVisible(false);
         new Transactions(pinnumber).setVisible(true);
         }else {
            String amount =((JButton)ae.getSource()).getText().substring(3);
           Conn c = new Conn();
           try {
             ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
             int balance = 0;
             while(rs.next()){
            if(rs.getString("type").equals("Deposit")){
                balance += Integer.parseInt(rs.getString("amount"));
            }else {
                balance -= Integer.parseInt(rs.getString("amount"));
            }
             }
             if(ae.getSource()!= exit && balance< Integer.parseInt(amount)){
                 JOptionPane.showMessageDialog(null," Insufficient Balance");
                 return;
             }
             Date date = new Date();
             String query = "insert into bank values( '"+pinnumber+"','"+date+"','Withdarwl','"+amount+"')";
             c.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Rs"+amount+" Debited Succesfully");
             setVisible(false);
             new Transactions(pinnumber).setVisible(true);
           }catch (Exception e){
               System.out.println(e);
               
           }
      
         }
        }
        
    
    public static void main(String[] args) {
        new  FastCash("");
    }
}



    
