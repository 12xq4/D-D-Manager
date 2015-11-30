package com.dungeonsanddragonsmanager.BackEnd.Races;
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

public class Human extends Race {

    public Human (Stat stat) {
        name = "Human";
        this.stat = stat;
        speed = 30;
        this.stat.addChar(1);
        this.stat.addCons(1);
        this.stat.addDex(1);
        this.stat.addIntel(1);
        this.stat.addStr(1);
        this.stat.addWis(1);
        language = new ArrayList<>();
        skillset = new ArrayList<>();
        setLanguage();
        setSkills();
    }

    void setLanguage(){
        language.add("Common");
        language.add("Another language of your choice");
    }

    @Override
    String displayLanguage() {
        String result = "Language:   ";
        for (String lan:language) {
            result += lan + "    ";
        }
        return result;
    }

    ArrayList<String> getLanguage() {
        return language;
    }

    void setSkills(){
        skillset.add(new Skills("No Special Skills", ""));
    }

    @Override
    String displaySkills() {
        String result = "Humans have no special race skills.";
        return result;
    }

    ArrayList<Skills> getSkillSet() {
        return skillset;
    }

}
