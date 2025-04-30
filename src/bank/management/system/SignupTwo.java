package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField panTextField, aadharTextField;
    JRadioButton  Sno, Eno, Eyes, Syes;
    JButton next;
    JComboBox Religion , catagory , Income ,Education , Occupation; 
    String formno;
    SignupTwo(String formno) {
        setTitle("SignUp");
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel line = new JLabel("Page 2: Additional Details" );
        line.setFont(new Font("Raleway", Font.BOLD, 38));
        line.setBounds(165, 40, 600, 40);
        add(line);

        JLabel religion = new JLabel("Religion :");
        religion.setFont(new Font("Raleway", Font.BOLD, 22));
        religion.setBounds(100, 140, 400, 30);
        add(religion);

        String ValReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        Religion = new JComboBox(ValReligion);
        Religion.setBounds(300, 140, 400, 30);
        add(Religion);
        
        JLabel Catagory = new JLabel("Catagory :");
        Catagory.setFont(new Font("Raleway", Font.BOLD, 20));
        Catagory.setBounds(100, 200, 400, 30);
        add(Catagory);

        String ValCatagory[] = {"General", "OBC", "SC", "ST", "Other"};
        catagory= new JComboBox(ValCatagory);
        catagory.setBounds(300, 200, 400, 30);
        catagory.setBackground(Color.WHITE);
        add(catagory);

        JLabel income = new JLabel("Income ");
        income.setFont(new Font("Raleway", Font.BOLD, 22));
        income.setBounds(100, 260, 100, 30);
        add(income);
        
        String ValIncome[] = {"Null", "<1,50,000", "<= 2,50,000", "<= 5,00,000", "Up to 10,00,000"};
        Income= new JComboBox(ValIncome);
        Income.setBounds(300, 260, 400, 30);
        Income.setBackground(Color.WHITE);
        add(Income);

        JLabel education = new JLabel(" Educational ");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 310, 200, 30);
        add(education);
        
        JLabel qualification = new JLabel(" Qualification: ");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 340, 200, 30);
        add(qualification);

        String ValEducation[] = {"Non-Graduation", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        Education= new JComboBox(ValEducation);
        Education.setBounds(300, 340, 400, 30);
        Education.setBackground(Color.WHITE);
        add(Education);
        
        JLabel occupation = new JLabel(" Occupation: ");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 400, 200, 30);
        add(occupation);

        String ValOccupation[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired"};
        Occupation= new JComboBox(ValOccupation);
        Occupation.setBounds(300, 400, 400, 30);
        Occupation.setBackground(Color.WHITE);
        add(Occupation);
        
        JLabel pan = new JLabel(" PAN No. : ");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 460, 200, 30);
        add(pan);
      
         panTextField = new JTextField();
         panTextField.setFont(new Font("Raleway" , Font.BOLD ,15));
         panTextField.setBounds(300, 460, 400, 30);
         panTextField.setBackground(Color.WHITE);
         add(panTextField);
       
         JLabel aadhar = new JLabel(" Aadhar No. : ");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 520, 200, 30);
        add(aadhar);
      
         aadharTextField = new JTextField();
         aadharTextField.setFont(new Font("Raleway" , Font.BOLD ,15));
         aadharTextField.setBounds(300, 520, 400, 30);
         aadharTextField.setBackground(Color.WHITE);
         add(aadharTextField);

         
         JLabel SeniorCitizen = new JLabel(" Senior Citizen: ");
        SeniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        SeniorCitizen.setBounds(100, 580, 200, 30);
        add(SeniorCitizen);
        
        Syes = new JRadioButton("Yes");
        Syes.setBounds(300, 580, 200, 30);
        Syes.setBackground(Color.WHITE);
        add(Syes);

        Sno = new JRadioButton("No");
        Sno.setBounds(500, 580, 200, 30);
        Sno.setBackground(Color.WHITE);
        add(Sno);
        
        ButtonGroup seniorCitizen = new ButtonGroup();
        seniorCitizen.add(Syes);
        seniorCitizen.add(Sno);
        

        JLabel ExistingAccount = new JLabel(" Existing Account: ");
        ExistingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        ExistingAccount.setBounds(100, 640, 200, 30);
        add(ExistingAccount);
        
        Eyes = new JRadioButton("Yes");
        Eyes.setBounds(300, 640, 200, 30);
        Eyes.setBackground(Color.WHITE);
        add(Eyes);

         Eno = new JRadioButton("No");
        Eno.setBounds(500, 640, 200, 30);
        Eno.setBackground(Color.WHITE);
        add(Eno);
        
        ButtonGroup existingAccount = new ButtonGroup();
        existingAccount.add(Eyes);
        existingAccount.add(Eno);
       

       
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String SReligion = (String) Religion.getSelectedItem();
        String Scatagory = (String)catagory.getSelectedItem();
        String Sincome = (String)Income.getSelectedItem();
        String SEducation = (String)Education.getSelectedItem();
        String SOccupation = (String)Occupation.getSelectedItem();
        String seniorCitizen = null;
        if (Syes.isSelected()) {
            seniorCitizen = "Yes";
        } else if (Sno.isSelected()) {
            seniorCitizen = "No";
        }
        
        String ExistingAccount = null;
        if (Eyes.isSelected()) {
            ExistingAccount = "Yes";
        } else if (Eno.isSelected()) {
            ExistingAccount = "No";
        
        }
        String SPan = panTextField.getText();
        String SAadhar = aadharTextField.getText();
      

        try {
                Conn c = new Conn();
                String query = "insert into signuptwo values('" + formno + "', '" + SReligion + "', '" + Sincome + "', '" + SEducation + "', '" + SOccupation + "', '" + SPan + "', '" + SAadhar + "')";  
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        new SignupTwo("");
    }
}