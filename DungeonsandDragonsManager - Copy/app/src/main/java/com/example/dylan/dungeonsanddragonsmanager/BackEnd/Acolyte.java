package com.example.dylan.dungeonsanddragonsmanager.BackEnd;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jackqiao
 */
public class Acolyte extends Background{

    public Acolyte(){
        name = "Acolyte";
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Skill Proficiency", "Insight, Religion"));
    }

    @Override
    String displaySkills() {
        String result = "Skills: \n";
        for (Skills skill: skillset){
            result += skill + "\n";
        }
        return result;
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
    String displayEquipments() {
        String result = "Equipments: ";
        for (String equi: equipment){
            result += "            " +equi + "\n";
        }
        return result;
    }

    @Override
    void setLanguage() {
        language.add("Two of your choice");
    }

    @Override
    String displayLanguages() {
        String result = "Language:   ";
        for (String lan:language) {
            result += lan + "    ";
        }
        return result;
    }

}
