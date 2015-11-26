package com.dungeonsanddragonsmanager.BackEnd;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author jackqiao
 */

public abstract class Background {
    String name;
    ArrayList<Skills> skillset;
    ArrayList<String> language;
    ArrayList<String> equipment;
    
     
    abstract void setSkills();
    abstract String displaySkills();
    abstract void setEquipments();
    abstract String displayEquipments();
    abstract void setLanguage();
    abstract String displayLanguages();

    public String toString(){
        return name + "\n" + displayLanguages() + displaySkills() + displayEquipments();
    }
}
