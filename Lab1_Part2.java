package edu.neu.mgen;

import java.util.ArrayList;

public class Lab1_Part2 {

    public static void main(String[] args){
        //Initiate an ArrayList that contain 5 names
        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Harold");
        names.add("Jessica");
        names.add("Susan");
        names.add("Thia");

        //Print original name
        System.out.println("Names = " + formatListWithBraces(names));
        
        //Switch the first and last letters in each name in the ArrayList
        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names){
            switchedNames.add(switchFirstAndLast(name));
        }
        //Print switched names
        System.out.println("Names (switched) = " + formatListWithBraces(switchedNames));
    }

    //Method to switch the first and last letters in each name
    public static String switchFirstAndLast(String name){
        if (name.length() <= 1){
            return name;
        }
        char firstChar = name.charAt(name.length() - 1);
        char lastChar = name.charAt(0);
        String middle = name.substring(1, name.length() - 1);

        return Character.toUpperCase(firstChar) + middle + Character.toLowerCase(lastChar);
    }

    public static String formatListWithBraces(ArrayList<String> list) {
        return "{" + String.join(", ", list) + "}";
    }
}

