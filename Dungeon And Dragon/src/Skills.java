/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jackqiao
 */
public class Skills {
    String name;
    String description;
    
    public Skills (String name, String des) {
        this.name = name;
        description = des;
    }
    
    public String toString () {
        return name + ": " + description;
    }
}
