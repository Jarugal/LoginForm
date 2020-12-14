package loginform;

//import java.awt.Container;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;


public class LoginFrame extends JFrame //implements ActionListener  
{
    Container container = getContentPane();
    JLabel userLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton ("Login");
    JButton resetButton = new JButton("Reset");
    JCheckBox showPassword = new JCheckBox("Show Password"); 
    
    LoginFrame()
    {
        setLayoutManager();  //Called Layout manager here
        setLocationAndSize(); //Called method here
        addComponentsToCointainer(); // Call method here */
//        addActionEvent();
    }

    LoginFrame(ControllerLoginForm aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    LoginFrame(ControllerLoginForm aThis) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    public void setLayoutManager()
    {
        container.setLayout(null);
    }        
    public void setLocationAndSize() //Location and Size of each component
    {
        userLabel.setBounds(50,150,100,30);
        passwordLabel.setBounds(50,220,100,30);
        passwordField.setBounds(50,220,100,300);
        userTextField.setBounds(150,150,150,30);
        passwordField.setBounds(150,220,150,30);
        showPassword.setBounds(150,250,150,30);
        loginButton.setBounds(50,300,100,30);
        resetButton.setBounds(200,300,100,30);
    }
    public void addComponentsToCointainer()
    {
    container.add(userLabel);
    container.add(passwordLabel);
    container.add(userTextField);
    container.add(passwordField);
    container.add(showPassword);
    container.add(loginButton);
    container.add(resetButton);
    }
   public void addActionEvent()
    {
//        loginButton.addActionListener((ActionListener) this);
        resetButton.addActionListener((ActionListener) this);
        showPassword.addActionListener((ActionListener) this);
    } 
    
    private void validation(){
        this.validate();
        this.repaint();
    }

   // @Override
   /* public void actionPerformed(ActionEvent e) {
       if(e.getSource()==loginButton)
       {
           String user = userTextField.getText();
           String password = passwordField.getText();
           //String userText;
           //String passwordText;
           //userText=userTextField.getText();
           //passwordText=passwordField.getText();
           if(userText.equalsIgnoreCase("++")&&passwordText.equalsIgnoreCase("++"))
           {
               JOptionPane.showMessageDialog(this,"Login successful");
           }   
           else
           {
               JOptionPane.showMessageDialog(this,"Invalid Username or Password");
           }    
       }
       if(e.getSource()==resetButton)
       {
            userTextField.setText("");
            passwordField.setText("");
       }
       if(e.getSource()==showPassword)
       {
           if(showPassword.isSelected())
           {
               passwordField.setEchoChar((char)0);
           }
           else
           {
               passwordField.setEchoChar('*');
           }    
       }*/    

    void setResult(String resultMessage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String userTextField() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getValueTwo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String passwordField() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }   


    

