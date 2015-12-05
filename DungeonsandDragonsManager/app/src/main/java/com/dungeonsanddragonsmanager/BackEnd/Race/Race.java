package com.dungeonsanddragonsmanager.BackEnd.Race;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jackqiao
 */
import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

public abstract class Race {
    public static final int STR = 0;
    public static final int DEX = 1;
    public static final int CON = 2;
    public static final int INT = 3;
    public static final int WIS = 4;
    public static final int CHA = 5;

    public String name;
    public int speed;
    public int hp;
    public Stat stat;
    public ArrayList<Skills> skillset;
    public ArrayList<String> language;
    
    public Race () {
        this.stat = stat;
        name="";
        hp = 0;
        speed = 0; 
    }

    abstract void setLanguage();
    abstract String displayLanguage();
    abstract void setSkills();
    abstract String displaySkills();
    public String toString() {
        return displayLanguage() + "\n" + displaySkills();
    }
    
}
