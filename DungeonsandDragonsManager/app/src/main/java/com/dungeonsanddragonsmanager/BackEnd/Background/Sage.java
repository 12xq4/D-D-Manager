package com.dungeonsanddragonsmanager.BackEnd.Background;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Sage extends Background {
    public Sage(){
        name = "Sage";
        feature = "Researcher \n When you attempt to learn or recall a piece of lore, if you do not know that info, you often know where and from whom you can obtain it.  Usually, this info comes from a library, scriptorium, university, or a sage or another learned person or creature.  Your DM might rule that the knowledge you seek is secreted away in almost inacessible place, or that it simply cannot be found.  Unearthing the deepest secrets of the multiverse can require an adventure or even a whole campaign";
        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Skill Proficiency", "Arcana, History"));
    }

    @Override
    void setEquipments() {
        equipment.add("a bottle of black ink");
        equipment.add("a quill");
        equipment.add("a small knife");
        equipment.add("a letter from a dead colleague posing a question you have not yet been able to answer");
        equipment.add("a set of common clothes");
        equipment.add("15 gold");
    }

    @Override
    void setLanguage() {
        language.set("Common");
        language.set("Two of your choice")
    }
}
