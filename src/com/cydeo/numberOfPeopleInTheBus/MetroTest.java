package com.cydeo.numberOfPeopleInTheBus;

import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MetroTest {
    MetroBruteForce metro = new MetroBruteForce();
  
    @Test
    public void test1() {
    ArrayList<int[]> list = new ArrayList<int[]>();
    list.add(new int[] {10,0});
    list.add(new int[] {3,5});
    list.add(new int[] {2,5});
    assertEquals(5, metro.countPassengers(list));
    }
    
    
}