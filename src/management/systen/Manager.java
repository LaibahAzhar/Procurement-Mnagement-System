/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management.systen;
import java.util.regex.*;

public class Manager {
    
    private String Email;
    private String Password;

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    static boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public boolean setEmail(String Email) {

        for (int i = 0; i < this.Email.length(); i++) {
            if (isValid(this.Email) == true) {
                this.Email = Email;

                return true;
            }
        }
        return false;
    }
    
    public static boolean
    isValidPassword(String password)
    {
  
        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }
  
        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);
  
        // Return if the password
        // matched the ReGex
        return m.matches();
    }
    public boolean setPassword(String Password) {
        if (isValidPassword(Password))
        {
        this.Password = Password;
        return true;
        }
        return false;
    }
    
    
    
}
