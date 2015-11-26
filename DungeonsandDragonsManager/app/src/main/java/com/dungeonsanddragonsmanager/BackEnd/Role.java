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

    abstract String displaySkills();
    abstract void setSkills();
    abstract String displayEquipments();
    abstract void setEquipments();

    public String toString(){
        return "Hitpoints:    " + hitPoint + "\nAttack:    " + hitDice + "\n"
                + displaySkills() + displayEquipments();
    }
}
