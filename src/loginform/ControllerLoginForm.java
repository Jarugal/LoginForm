/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jarga
 */
public class ControllerLoginForm implements ActionListener{
    
    LoginFrame LoginFrame;
    Model model;
    private Object loginButton;
    
    public ControllerLoginForm ()
    {
        this.LoginFrame = new LoginFrame (this);
        this.model = new Model();
    }
    
    /**
     *
     */
   // public RegisterForm() //Could not connect the two windows :(
    {
    //    this.RegisterForm() = new RegisterForm(this);
    //    this.model = new Model();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String un = LoginFrame.userTextField(); // parseInt(view.getValueOne()); //get Value from View class
        String pw = LoginFrame.passwordField(); // Integer.parseInt(view.getValueTwo());
        
        User user = new User(un, pw);
        boolean result = model.login(user);
        String resultMessage = "Invalid username and password!";
        
        if(result){
            
            resultMessage = "Login successful";
            
        }
        
        LoginFrame.setResult(resultMessage);
        
    }
    
    
    
}
