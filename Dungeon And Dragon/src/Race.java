/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jackqiao
 */
import java.util.ArrayList;

public abstract class Race {
    public static final int STR = 0;
    public static final int DEX = 1;
    public static final int CON = 2;
    public static final int INT = 3;
    public static final int WIS = 4;
    public static final int CHA = 5;
    
    int speed;
    // int[] statBonus;
    Stat stat;
    ArrayList<Skills> skillset;
    ArrayList<String> language;
    
    public Race () {
        this.stat = stat;
        speed = 0; 
    }
    
    
    
    abstract void setLanguage();
    abstract void setSkills();
    
}
