package com.dungeonsanddragonsmanager.BackEnd.Background;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.dungeonsanddragonsmanager.BackEnd.Skills;

import java.util.ArrayList;

/**
 *
 * @author jackqiao
 */
public class Acolyte extends Background{

    public Acolyte(){
        name = "Acolyte";
        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Skill Proficiency", "Insight, Religion"));
    }

    @Override
    void setEquipments() {
        equipment.add("a holy symbol");
        equipment.add("Prayer book or wheel");
        equipment.add("5 sticks of incense");
        equipment.add("Vestments");
        equipment.add("A set of common cloth");
        equipment.add("15 gold");
    }

    @Override
    void setLanguage() {
        language.add("Two of your choice");
    }


}
