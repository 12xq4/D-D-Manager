package com.dungeonsanddragonsmanager.BackEnd.Classes;

import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Ranger extends Role {
    public Ranger(Stat stat){
        name = "Ranger";
        this.stat = stat;
        hitDice = "one 10-sided dice";
        hitPoint = 10 + this.stat.returnModifier(stat.getConstitution());
        skillset = new ArrayList<>();
        equipment = new ArrayList<>();
        setEquipments();
        setSkills();
    }
    void setSkills() {
        skillset.add(new Skills("Armor and Weapon Proficiencies", "Light armor, medium armor, shields, simple weapons, martial weapons."));
        skillset.add(new Skills("Saving throw proficiencies", "Strength, Dexterity."));
        skillset.add(new Skills("Favored Enemy", "Choose a type of favored enemy: aberrations, beasts, celestials, constructs, dragons, elementals, fey, fiends, giants, monstrosities, oozes, plants, or undead. Alternatively, you can select two races of humanoid (such as gnolls and orcs) as favored enemies." +
                "You gain advantage on Wisdom checks to track your favored enemies, as well as on Intelligence checks to recall information about them." +
                "When you gain this feature, you also learn one language of your choice that is spoken by your favored enemies, if they speak one at all." +
                "You choose one additional favored enemy, as well as an associated language, at 6th and 14th level."));
        skillset.add(new Skills("Natural Explorer","Choose one type of favored terrain: arctic, coast, desert, forest, grassland, mountain, swamp, or the Underdark. When you make an Intelligence or W isdom check related to your favored terrain, your proficiency bonus is doubled if you are using a skill that you're proficient in." +
                "While traveling for an hour or more in your favored terrain, you gain the following benefits:" +
                "   - Difficult terrain doesn't slow your group's travel." +
                "   - Your group can't become lost except by magical means." +
                "   - Even when you are engaged in another activity while traveling, you remain alert to danger." +
                "   - If you are traveling alone, you can move stealthily at a normal pace." +
                "   - When you forage, you find twice as much food as you normally would." +
                "   - While tracking other creatures, you also learn their exact number, their sizes, and how long ago they passed through the area." +
                "You choose additional favored terrain types at 6th and 10th level."));
        skillset.add(new Skills("Bonus", "Choose three from Animal Handling, Athletics, Insight, Investigation, Nature, Perception, Stealth, and Survival."));
    }

    void setEquipments(){
        equipment.add("scale mail or leather armor.");
        equipment.add("two shortswords or two simple melee weapons.");
        equipment.add("a dungeoneer's pack or an explorer's pack.");
        equipment.add("A longbow and a quiver of 20 arrows.");
    }
}
