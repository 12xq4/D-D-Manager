package com.dungeonsanddragonsmanager.BackEnd.Classes;

import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

/**
 * Created by jackqiao on 12/1/2015.
 */
public class Warlock extends Role {
    public Warlock(Stat stat){
        name = "Warlock";
        this.stat = stat;
        hitDice = "one 8-sided dice";
        hitPoint = 8 + this.stat.returnModifier(stat.getConstitution());
        skillset = new ArrayList<>();
        equipment = new ArrayList<>();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Armor and Weapon Proficiencies", "Light armor, simple weapons."));
        skillset.add(new Skills("Saving throw proficiencies", "Wisdom, Charisma."));
        // More to come
        skillset.add(new Skills("Bonus", "Choose two skills from Arcana, Deception, History, Intimidation, Investigation, Nature, and Religions."));
    }

    @Override
    void setEquipments() {
        equipment.add("a light crossbow and 20 bolts or any simple weapon.");
        equipment.add("a component pouch or an arcane focus.");
        equipment.add("a scholar’s pack or a dungeoneer’s pack.");
        equipment.add("leather armor");
        equipment.add("any simple weapon");
        equipment.add("two daggers.");
    }
}
