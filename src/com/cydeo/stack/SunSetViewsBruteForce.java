package com.cydeo.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunSetViewsBruteForce {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(6);
        stack.push(22);
        System.out.println(stack.peek());

        System.out.println("======================");

        int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
        System.out.println(sunsetViews(buildings,"EAST"));
        System.out.println(sunsetViews(buildings,"WEST"));

    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction){

        Stack<Integer> stack = new Stack<>(); //stack to hold building indicies that can see sunset

        if (direction.equalsIgnoreCase("east")){

            for (int i = 0; i < buildings.length; i++) {
                                                    //array index           //stack index
                while (!stack.isEmpty() && buildings[     i     ]>=buildings[stack.peek()]){
                    stack.pop();
                }

                stack.push(i);

            }

        } else if (direction.equalsIgnoreCase("west")) {

            for (int i = buildings.length-1; i >=0 ; i--) {

                while (!stack.isEmpty() && buildings[i]>=buildings[stack.peek()]){
                    stack.pop();
                }

                stack.push(i);
                Collections.reverse(stack);

            }

        }

        // now I have a stack with the building indicies that can see sunset
        return new ArrayList<Integer>(stack);
    }

}
