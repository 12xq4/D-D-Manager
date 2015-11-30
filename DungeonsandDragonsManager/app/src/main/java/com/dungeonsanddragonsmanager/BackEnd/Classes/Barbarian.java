package com.dungeonsanddragonsmanager.BackEnd.Classes;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

/**
 *
 * @author jackqiao
 */
public class Barbarian extends Role{
    // int modifier;
    public Barbarian(Stat stat){
        name = "Barbarian";
        this.stat = stat;
        hitPoint = 12 + this.stat.returnModifier(stat.getConstitution());
        hitDice = "one 12-sided dice";
        skillset = new ArrayList<>();
        equipment = new ArrayList<>();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Armor and Weapon Proficiencies","Light and medium armor, shields, simple and martial weapons"));
        skillset.add(new Skills("Saving throw proficiencies","Strength and Constitution"));
        skillset.add(new Skills("Rage","On your turn, you can enter a rage as a bonus action. While enraged, if you aren't wearing heavy armor:\n" +
"    -You have advantages on Strength checks and saving throws\n" +
"    -When you make a melee weapon attack using Strength, you gain +2 to the damage roll.\n" +
"    -You have resistance to bludgeoning, piercing, and slashing damage.\n" +
"Rage lasts one minute.  While enraged you cannot cast spells."));
        skillset.add(new Skills("Unarmored Defense", "While you are not wearing any armor, your Armor Class is 10 + Dexterity modifier + Constitution modifier.  This still applies while wearing a shield"));
        skillset.add(new Skills("Bonus", " Choose two from Animal Handling, Athletics, Intimidation, Nature, Perception, and Survival"));
    }

    void setEquipments(){
        equipment.add("any martial weapon");
        equipment.add("any simple weapon");
        equipment.add("explorer's pack");
        equipment.add("four javelins");
    }
}
