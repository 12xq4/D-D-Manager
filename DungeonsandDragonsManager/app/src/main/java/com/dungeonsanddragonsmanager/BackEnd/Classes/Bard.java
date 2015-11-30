package com.dungeonsanddragonsmanager.BackEnd.Classes;

import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/25/2015.
 */
public class Bard extends Role {
    public Bard(Stat stat) {
        name = "Bard";
        this.stat = stat;
        hitDice = "one 8-sided dice";
        hitPoint = 8 + this.stat.returnModifier(stat.getConstitution());
        skillset = new ArrayList<>();
        equipment = new ArrayList<>();
        setEquipments();
        setSkills();
    }

    void setSkills() {
        skillset.add(new Skills("Armor and Weapon Proficiencies","Light armor, simple weapons, hand crossbows, longswords, rapiers, shortswords."));
        skillset.add(new Skills("Saving throw proficiencies","Dexterity, Charisma"));
        skillset.add(new Skills("Spell casting", ""));
        skillset.add(new Skills("Bonus", "Choose any 3 skills."));

    }

    void setEquipments(){
        equipment.add("a rapier, a longsword, or any simple weapon.");
        equipment.add("a diplomat’s pack or an entertainer's pack.");
        equipment.add("one musical instrument.");
        equipment.add("Leather armor and a dagger.");
    }
}
