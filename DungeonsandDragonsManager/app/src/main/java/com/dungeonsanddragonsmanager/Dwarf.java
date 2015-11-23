package com.dungeonsanddragonsmanager;
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
public class Dwarf extends Race{
    
    public Dwarf (Stat stat) {
        this.stat = stat;
        speed = 25;
        stat.addCons(2);
        setLanguage();
        setSkills();
    }
    
    void setLanguage(){
        language.add("Common");
        language.add("Dwarvish");
    }
    
    ArrayList<String> getLanguage() {
        return language;
    }
    
    void setSkills(){
        skillset.add(new Skills("Heavy Armor Expertise", "Speed is not reduced by wearing heavy armor"));
        skillset.add(new Skills("Darkvision", "You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light"));
        skillset.add(new Skills("Dwarven Resilience", "You have advantage on saving throws against poison, and you have resistance against poison damage"));
        skillset.add(new Skills("Weapon Proficiencies", "Battleaxe, handaxe, throwing hammer, warhammer"));
        skillset.add(new Skills("Tool Proficiencies", "One of your choice: Smith's tools, brewer's supplies, or mason's tools."));
        skillset.add(new Skills("Stonecunning","Whenever you make a History check related to the origin of stonework, add double proficiency to the roll"));
    }
    
    ArrayList<Skills> getSkillSet() {
        return skillset;
    }
}
