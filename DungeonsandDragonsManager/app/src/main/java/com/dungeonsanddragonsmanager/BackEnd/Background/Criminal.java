package com.dungeonsanddragonsmanager.BackEnd.Background;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Criminal extends Background {
    public Criminal(){
        name = "Criminal";
        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {

    }

    @Override
    void setEquipments() {

    }

    @Override
    void setLanguage() {

    }
}
