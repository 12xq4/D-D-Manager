package com.example.dylan.dungeonsanddragonsmanager;
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
    ArrayList<Skills> skillset;
    ArrayList<String> language;
    ArrayList<String> equipment;
    
     
    abstract void setSkills();
    abstract void setEquipments();
    abstract void setLanguage();
}
