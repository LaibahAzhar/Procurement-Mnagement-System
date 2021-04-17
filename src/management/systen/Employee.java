/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management.systen;

/**
 *
 * @author hp
 */
public class Employee {

    private String Name;
    private String CNIC;
    private String Email;

    public boolean setName(String Name) {
        for (int i = 0; i < Name.length(); i++) {
            if ((this.Name.charAt(i) >= 'a' && this.Name.charAt(i) <= 'z') || (this.Name.charAt(i) >= 'A' && this.Name.charAt(i) <= 'Z')) {
                this.Name = Name;
                return true;
            }
        }
return false;
    }

    public boolean setCNIC(String CNIC) {
        for (int i = 0; i < CNIC.length(); i++) {
            if ((this.CNIC.charAt(i) >= '0' && this.CNIC.charAt(i) <= '9') || this.CNIC.charAt(5) == '-' || this.CNIC.charAt(13) == '-') {
                this.CNIC = CNIC;
                return true;
            }
        }
        return false;
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

    public String getName() {
        return Name;
    }

    public String getCNIC() {
        return CNIC;
    }

    public String getEmail() {
        return Email;
    }

}
