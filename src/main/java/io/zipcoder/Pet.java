package io.zipcoder;

import java.lang.Comparable;
import java.util.Comparator;

public class Pet implements Comparable<Pet>{

    private String petName;

    public Pet(){
    }

    public Pet(String petName){
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    public String speak(){
        return "Animal soundsss...";

    }

    public int compareTo(Pet o) {
        int petComparison = 0;
        if(!this.petName.equalsIgnoreCase(o.petName)){
            petComparison = this.petName.compareTo(o.petName);
        } else{
          petComparison = this.getClass().getName().compareTo(o.getClass().getName());
        }
        return petComparison;
    }
}
