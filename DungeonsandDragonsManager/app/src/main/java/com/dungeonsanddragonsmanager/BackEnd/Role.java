package com.dungeonsanddragonsmanager.BackEnd;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jackqiao
 */
public abstract class Role {
    String name;
    ArrayList<Skills> skillset;
    String hitDice;
    int hitPoint;
    ArrayList<String> equipment;
    Stat stat;
    public Role () {
        hitDice = "0";
        hitPoint = 0;
    }

    String displaySkills() {
        String result = "Skills: \n";
        for (Skills skill: skillset){
            result += skill + "\n";
        }
        return result;
    }

    abstract void setSkills();

    String displayEquipments() {
        String result = "Equipments: ";
        for (String equi: equipment){
            result += "            " +equi + "\n";
        }
        return result;
    }

    abstract void setEquipments();

    public String toString(){
        return "Hitpoints:    " + hitPoint + "\nAttack:    " + hitDice + "\n"
                + displaySkills() + displayEquipments();
    }
}
