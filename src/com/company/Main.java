package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[5];

        for(int i = 0; i < array1.length; i++){
            array1[i] = i * 2;
        }
        System.out.println(Arrays.toString(array1));

        //lav en arrayList
        ArrayList<Integer> list = new ArrayList<>();

        //set værdierne 3-6-9-12-15
        for(int i = 0; i < 5; i++){
            list.add((i + 1) * 3);
        }
        System.out.println("Default toString metode "+list);

        // print en værdi ud af gangen
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
        // indsæt 0 før hvert tal
        for(int i = 0; i < list.size(); i+=2){
            list.add(i, 0);
        }
        System.out.println(list);
        //fjern alle 0´erne
        for(int i = 0; i < list.size(); i++){
            list.remove(i);
        }
        System.out.println(list);
    }
}
