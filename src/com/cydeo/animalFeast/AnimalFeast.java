package com.cydeo.animalFeast;

public class AnimalFeast {

    public static void main(String[] args) {

        String beast = "chickadee";
        String dish = "chocolate cake";

        System.out.println(checkNameAndDish(beast, dish));

    }

    private static boolean checkNameAndDish(String beast, String dish) {

        int countBeast = 0;
        int countDish = 0;

        //at least two letters

        for (int i = 0; i < beast.length(); i++) {
            if (beast.charAt(i) > 'a' && beast.charAt(i) < 'z') countBeast++;
        }
        if (countBeast < 2) return false;

        for (int i = 0; i < dish.length(); i++) {
            if (dish.charAt(i) > 'a' && dish.charAt(i) < 'z') countDish++;
        }
        if (countDish < 2) return false;

        //may contain hyphens and spaces (not appear at the beginning or end)

        if (beast.startsWith(" ") || beast.startsWith("-") || beast.endsWith(" ") || beast.endsWith("-")) return false;

        //not contain numerals

        for (int i = 0; i < beast.length(); i++) {
            if (beast.charAt(i)>='0' && beast.charAt(i)<='9') return false;
        }

        for (int i = 0; i < dish.length(); i++) {
            if (dish.charAt(i)>='0' && dish.charAt(i)<='9') return false;
        }

        //start and end with the same letters

        if (!(beast.charAt(0)==dish.charAt(0) && (beast.charAt(beast.length()-1)==dish.charAt(dish.length()-1)))) return false;

        return true;
    }

}
/*
- start and end with the same letters
- at least two letters
- may contain hyphens and spaces (not appear at the
beginning or end)
- not contain numerals

Requirements:

Animal Feast
All the animals are having a feast! Each animal is bringing one dish. There is just one rule: the dish must start and end with the same letters as the animal's name. For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake. Write a method that takes the animal's name and dish as arguments and returns true or false to indicate whether the beast is allowed to bring the dish to the feast. Assume that beast and dish are always lowercase strings, and
that each has at least two letters. Beast and dish may contain hyphens and spaces, but these will not appear at the
beginning or end of the string. They will not contain numerals.

*/