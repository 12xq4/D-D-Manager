package com.dungeonsanddragonsmanager.BackEnd.Background;

import java.util.ArrayList;
import com.dungeonsanddragonsmanager.BackEnd.Skills;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Hermit extends Background {
    public Hermit(){
        name = "Hermit";
        feature = "Discovery \n The quiet seclusion of your extended hermitage gave you access " +
                  "to a unique and powerful discovery. The exact nature of this revelation depends " +
                  "on the nature of your seclusion. It might be a great truth about the cosmos, " +
                  "the deities, or the forces of nature. It could be a site that no one else has " +
                  "ever seen. Work with your DM to determine the details of your discovery and " +
                  "its impact on the campaign.";
        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Skill Proficiency", "Medicine, Religion"));
    }

    @Override
    void setEquipments() {
        equipment.add("a scroll case full of stuffed notes from your studies or prayers");
        equipment.add("a winter blanket");
        equipment.add("a set of common clothes");
        equipment.add("a set of common clothes");
        equipment.add("15 gold");
    }

    @Override
    void setLanguage() {
        language.add("Common");
        language.add("One of your choice");
    }
}
