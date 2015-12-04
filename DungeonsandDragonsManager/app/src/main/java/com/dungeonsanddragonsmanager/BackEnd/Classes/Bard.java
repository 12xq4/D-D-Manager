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
        skillset.add(new Skills("Spell casting", "You have the ability to cast spells."));
        skillset.add(new Skills("Bardic inspiration", "You can perform a bonus action on your turn: select another creature who's within 60 feet of you who can hear you, " +
                "that creature gain a 6-sided dice. Once within next 10 minutes, that creature can roll that dice and add its result to one ability check." +
                "The creature can wait until after it rolls the d20 before deciding to use the Bardic Inspiration die, but must decide before the DM says whether the roll succeeds or fails. " +
                "Once the Bardic Inspiration die is rolled, it is lost. A creature can have only one Bardic Inspiration die at a time." +
                "You can use this feature a number of times equal to your Charisma modifier (a minimum of once). You regain any expended uses when you finish a long rest."));
        skillset.add(new Skills("Bonus", "Choose any 3 skills."));

    }

    void setEquipments(){
        equipment.add("a rapier, a longsword, or any simple weapon.");
        equipment.add("a diplomat's pack or an entertainer's pack.");
        equipment.add("one musical instrument.");
        equipment.add("Leather armor and a dagger.");
    }
}
