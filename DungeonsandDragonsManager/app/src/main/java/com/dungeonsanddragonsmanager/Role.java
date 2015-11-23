package com.dungeonsanddragonsmanager;
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
    ArrayList<Skills> skillset;
    String hitDice;
    int hitPoint;
    int modifier;
    ArrayList<String> equipment;
    Stat stat;
    public Role () {
        hitDice = "0";
        hitPoint = 0;
    }
    
    abstract void setSkills();
    abstract void setEquipments();
}
