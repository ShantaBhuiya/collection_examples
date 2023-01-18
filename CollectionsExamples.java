package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class CollectionsExamples {

    public static void main(String[] args) {


        //collection>List>ArrayList, LinkedList, Vector>Stack
//        Collection a = new ArrayList();
//        List b = new ArrayList();
//        ArrayList c = new ArrayList();

        //for finding
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Mehedi"); //0
        arrayList.add("Tanha"); //1
        arrayList.add("Shanta");//2
        arrayList.add("Asma");//3
        arrayList.add("Nishat");//4

//        System.out.println(arrayList.size());
//        System.out.println(arrayList.get(4));
//        arrayList.add(2, "Sazin"); // replaced Shanta
//        System.out.println(arrayList.get(2));

        System.out.println("Beofre removal: " + arrayList.get(3));
        System.out.println("I wanr to  to remove: " +arrayList.remove(3));
        System.out.println("After Removal; " +arrayList.get(3));


        //----------------------------------------
        //to add or delete
        LinkedList <String>linkedList = new LinkedList<>();
        linkedList.add("Mehedi");
        linkedList.add("Aziz");
        linkedList.add("Shanta");
        linkedList.add("Tanha");

        System.out.println(linkedList.size());







    }






}
