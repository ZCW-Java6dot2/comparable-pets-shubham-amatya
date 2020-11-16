package io.zipcoder;

import java.lang.Comparable;

public class Dragon extends Pet{
    public Dragon(String petName) {
        super(petName);
    }

    public Dragon(){
    };

    @Override
    public String speak(){
        return "fire roar!";
    }
}
