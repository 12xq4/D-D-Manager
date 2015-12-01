package com.dungeonsanddragonsmanager.BackEnd.Classes;

import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

/**
 * Created by jackqiao on 12/1/2015.
 */
public class Sorcerer extends Role {
    public Sorcerer(Stat stat){
        name = "Sorcerer";
        this.stat = stat;
        hitDice = "one 6-sided dice";
        hitPoint = 6 + this.stat.returnModifier(stat.getConstitution());
        skillset = new ArrayList<>();
        equipment = new ArrayList<>();
        setEquipments();
        setSkills();
    }

    void setSkills() {
        skillset.add(new Skills("Armor and Weapon Proficiencies", "Daggers, darts, slings, quarterstaffs, light crossbows."));
        skillset.add(new Skills("Saving throw proficiencies", "Constitution, Charisma."));
        // More to come
        skillset.add(new Skills("Bonus", "Choose two from Arcana, Deception, Insight, Intimidation, Persuasion, and Religion."));
    }

    void setEquipments(){
        equipment.add("a light crossbow and 20 bolts or any simple weapon.");
        equipment.add("a component pouch or an arcane focus.");
        equipment.add("a dungeoneer’s pack or an explorer’s pack.");
        equipment.add("Two daggers.");

    }
}
