package com.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedListDemo{

    public static void main(String[] args) {

     LinkedList<Integer> linkedList = new LinkedList<>(); //1000000
     ArrayList<Integer> arrayList = new ArrayList<>(); //1000000

     long startTime;
     long endTime;
     long elapsedTime;

     for (int i = 0; i < 1000000; i++){
         linkedList.add(i);
         arrayList.add(i);
     }

     //-----------------LinkedList-----------------------------
    startTime = System.nanoTime();
//        linkedList.get(0);
//     linkedList.get(500000);
//        linkedList.get(99999);
        linkedList.remove(0);
     endTime = System.nanoTime();
     elapsedTime = endTime-startTime;
        System.out.println("LinkedList:\t" +elapsedTime + " ns");




    //------------------ArrayList------------------------------

        startTime = System.nanoTime();
//        arrayList.get(0);
//        arrayList.get(500000);
//        arrayList.get(99999);
        arrayList.remove(0);
        endTime = System.nanoTime();
        elapsedTime = endTime-startTime;
        System.out.println("ArrayList:\t" +elapsedTime + " ns");


    }
}
