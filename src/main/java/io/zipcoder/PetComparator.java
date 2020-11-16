package io.zipcoder;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2) {
        int petComparison = 0;
        if(!o1.getClass().getName().equalsIgnoreCase(o2.getClass().getName())){
            petComparison = o1.getClass().getName().compareTo(o2.getClass().getName());
        } else{
            petComparison = o1.getPetName().compareTo(o2.getPetName());
        }
        return petComparison;
    }
    }

