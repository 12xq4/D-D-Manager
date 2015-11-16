package com.example.dylan.dungeonsanddragonsmanager;

/**
 * Created by Dylan on 2015-10-29.
 */

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class classAdapter {//extends RecyclerView.Adapter<classAdapter.classViewHolder> {

    class characterClass {
        String chosenClass;

        characterClass(String chosenClass) {
            this.chosenClass = chosenClass;
        }
    }

    private List<characterClass> characterClassesList;

    private void initializeData() {
        characterClassesList = new ArrayList<>();
        characterClassesList.add(new characterClass("Dwarf"));
        characterClassesList.add(new characterClass("Elf"));
        characterClassesList.add(new characterClass("Halfling"));
        characterClassesList.add(new characterClass("Human"));
        characterClassesList.add(new characterClass("Dragonborn"));
        characterClassesList.add(new characterClass("Gnome"));
        characterClassesList.add(new characterClass("Half-Elf"));
        characterClassesList.add(new characterClass("Half-Orc"));
        characterClassesList.add(new characterClass("Tiefling"));
    }

    //List<characterClass> characterClassList;
    public static class classViewHolder extends RecyclerView.ViewHolder {
        TextView className;

        classViewHolder(View itemView) {
            super(itemView);
            //className = (TextView)itemView.findViewById(R.id.class_name);
        }
    }
}
