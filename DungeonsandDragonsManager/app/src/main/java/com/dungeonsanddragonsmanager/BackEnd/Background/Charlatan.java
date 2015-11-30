package com.dungeonsanddragonsmanager.BackEnd.Background;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Charlatan extends Background{
    public Charlatan(){
        name = "Charlatan";
        feature= "Second identity including documentation, acquaintainces, and disguises. Ability to forge documents, including official papers and personal letters (as long as you have seen an example of the kind of document or handwriting you are trying to copy)."
        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Skill Proficiency", "Deception", "Slight of Hand"));
    }

    @Override
    void setEquipments() {
        equipment.add("a set of fine clothes");
        equipment.add("a disguise kit");
        equipment.add("ten stoppered bottles filled with colored liquid OR 
        /n a set of weighted dice OR
        /n a deck of marked cards OR
        /n a signet ring of an imaginary duke");
        equipment.add("15 gold");
    }

    @Override
    void setLanguage() {
        language.add("Common");
    }
}
