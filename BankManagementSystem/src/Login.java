import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton login,clear,signup;
    JTextField cardTxtField;
    JPasswordField pinTxtField;
    Login()
    {
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);

        //ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpeg"));
        //Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        //ImageIcon i3=new ImageIcon(i2);
        //JLabel label=new JLabel(i3);
        //label.setBounds(70,10,100,100);
        //add(label);

        JLabel text =new JLabel("WELCOME TO ATM");
        text.setBounds(200,40,400,40);
        text.setFont(new Font("Osward",Font.BOLD,38));
        add(text);

        JLabel cardno =new JLabel("Card No :");
        cardno.setBounds(120,150,150,40);
        cardno.setFont(new Font("Raleway",Font.BOLD,30));
        add(cardno);

         cardTxtField=new JTextField();
        cardTxtField.setBounds(300,150,230,30);
        cardTxtField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTxtField);

        JLabel pin =new JLabel("Pin :");
        pin.setBounds(120,220,250,30);
        pin.setFont(new Font("Raleway",Font.BOLD,30));
        add(pin);

         pinTxtField=new JPasswordField();
        pinTxtField.setBounds(300,220,230,30);
        pinTxtField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTxtField);

         login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

         clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

         signup=new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.white);

         setSize(800,480);
         setVisible(true);
        setLocation(350,200);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== clear)
        {
            cardTxtField.setText("");
            pinTxtField.setText("");
        }
        else if(ae.getSource()== login)
        {}
        else if (ae.getSource()==signup) {
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
