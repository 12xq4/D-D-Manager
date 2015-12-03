package com.dungeonsanddragonsmanager.BackEnd.Background;

import com.dungeonsanddragonsmanager.BackEnd.Skills;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class GuildArtisan extends Background {
    public GuildArtisan(){
        name = "GuildArtisan";
        feature = "Guild Membership \n As an established and respected member of a guild, you can " +
                  "rely on certain benefits that membership provides. Your fellow guild members " +
                  "will provide you with lodging and food if necessary, and pay for your funeral " +
                  "if needed. In some cities and towns, a guildhall offers a central place to " +
                  "meet other members of your profession, which can be a good place to meet " +
                  "potential patrons, allies, or hirelings. Guilds often wield tremendous " +
                  "political power. If you are accused of a crime, your guild will support you " +
                  "if a good case can be made for your innocence or the crime is justifiable. " +
                  "You can also gain access to powerful political figures through the guild, if " +
                  "you are a member in good standing. Such connections might require the donation " +
                  "of money or magic items to the guild’s coffers. You must pay dues of 5 gp per " +
                  "month to the guild. If you miss payments, you must make up back dues to remain " +
                  "in the guild’s good graces.";
        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Skill Proficiency", "Insight, Persuasion"));
    }

    @Override
    void setEquipments() {
        equipment.add("a set of artisan's tools (one of your choice)");
        equipment.add("a letter of introduction from your guild");
        equipment.add("a set of traveler's clothes");
        equipment.add("15 gold");
    }

    @Override
    void setLanguage() {
        language.add("Common");
        language.add("one of your choice");
    }
}
