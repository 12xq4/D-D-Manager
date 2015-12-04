package com.dungeonsanddragonsmanager.BackEnd.Classes;

import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

/**
 * Created by jackqiao on 12/1/2015.
 */
public class Wizard extends Role {
    public Wizard(Stat stat){
        name = "Wizard";
        this.stat = stat;
        hitDice = "one 6-sided dice";
        hitPoint = 6 + this.stat.returnModifier(stat.getConstitution());
        skillset = new ArrayList<>();
        equipment = new ArrayList<>();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Armor and Weapon Proficiencies", "Daggers, darts, slings, quarterstaffs, light crossbows."));
        skillset.add(new Skills("Saving throw proficiencies", "Intelligence, Wisdom."));
        // More to come
        skillset.add(new Skills("Bonus", "Choose two from Arcana, History, Insight, Investigation, Medicine, and Religion."));
    }

    @Override
    void setEquipments() {
        equipment.add("a quarterstaff or a dagger.");
        equipment.add("a component pouch or an arcane focus.");
        equipment.add("a scholar's pack or an explorer's pack.");
        equipment.add("a spellbook.");
    }
}
