package com.dungeonsanddragonsmanager.BackEnd.Background;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.dungeonsanddragonsmanager.BackEnd.Skills;

import java.util.*;

/**
 *
 * @author jackqiao
 */

public abstract class Background {
    String name;
    String feature;
    ArrayList<Skills> skillset;
    ArrayList<String> language;
    ArrayList<String> equipment;
    

    abstract void setSkills();
    String displaySkills() {
        String result = "\nSkills: \n";
        for (Skills skill : skillset) {
            result += skill + "\n";
        }
        return result;
    }

    abstract void setEquipments();
    String displayEquipments() {
        String result = "Equipments: ";
        for (String equi: equipment){
            result += "            " +equi + "\n";
        }
        return result;
    }
    abstract void setLanguage();
    String displayLanguages() {
        String result = "Language:   ";
        for (String lan:language) {
            result += lan + "    ";
        }
        return result;
    }

    public String toString(){
        return name + "\n" + displayLanguages() + displaySkills() + displayEquipments() + feature;
    }
}
