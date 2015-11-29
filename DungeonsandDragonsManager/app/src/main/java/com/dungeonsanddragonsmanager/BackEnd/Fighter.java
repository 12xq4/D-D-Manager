package com.dungeonsanddragonsmanager.BackEnd;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/26/2015.
 */
public class Fighter extends Role {
    public Fighter (Stat stat){
        name = "Fighter";
        this.stat = stat;
        hitDice = "one 10-sided dice";
        hitPoint = 10 + this.stat.returnModifier(stat.getConstitution());
        skillset = new ArrayList<>();
        equipment = new ArrayList<>();
        setEquipments();
        setSkills();
    }

    void setSkills() {
        skillset.add(new Skills("Armor and Weapon Proficiencies", "all armor, shields, simple weapon, martial weapon."));
        skillset.add(new Skills("Saving throw proficiencies", "Strength, Constitution"));
        skillset.add(new Skills("Fight Style", "You adapt a particular fight style as your speciality, choose one from the following: \n" +
            "   - Archery: gain +2 bonus roll when making a ranged attack. \n" +
            "   - Defense: while wearing armor, gain +1 bonus to Armor Class. \n" +
            "   - Dueling: when wielding a melee weapon in one hand and no other weapons, gain +2 bonus damage roll on that weapon. \n" +
            "   - Great Weapon Fighting: When you roll a 1 or 2 on your first hit with a double-handed or versatile melee weapon, you can choose to roll again. Your second roll will be final. \n" +
            "   - Protection: When an enemy attack a target other than you that is within 5 feet of you, you can impose a disadvantage on the attack roll. Must be wielding a shield. \n" +
            "   - Two-Weapon Fighting: When engaged in two-weapon fighting, you can add your ability modifiers to the damage of the second attack."));
        skillset.add(new Skills("Second Wind", "Have a limited well of stamina that you can draw on to protect yourself from harm. On your turn, you could use a bonus action " +
                "to regain hit points equal to one 10-sided dice roll + your fighter level. Once this feature is used, you must finish a short/long rest before you can use it again."));
        skillset.add(new Skills("Bonus", "Choose two from  Acrobatics, Animal Handling, Athletics, History, Insight, Intimidation, Perception, and Survival"));
    }

    void setEquipments(){
        equipment.add("chain mail or leather armor + longbow and 20 arrows ");
        equipment.add("a martial weapon and a shield or two martial weapons.");
        equipment.add("a light crossbow and 20 bolts or two handaxes ");
        equipment.add("a dungeoneer’s pack or an explorer’s pack.");
    }
}
