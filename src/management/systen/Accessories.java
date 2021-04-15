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
public class Accessories {
    
    private String Name;
    private int Count;

    public boolean setName(String Name) {
       for (int i = 0; i < Name.length(); i++) {
            if ((this.Name.charAt(i) >= 'a' && this.Name.charAt(i) <= 'z') || (this.Name.charAt(i) >= 'A' && this.Name.charAt(i) <= 'Z')) {
                this.Name = Name;
                return true;
            }
        }
       return false;
    }

    public boolean setCount(int Count) {
        for (int i = 0; i < Count; i++) {
            if (this.Count >= 0    && this.Count <=1000) {
                this.Count = Count;
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return Name;
    }

    public int getCount() {
        return Count;
    }
    
    
    
}
