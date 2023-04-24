package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0; i<sourceList.size(); i++) {
            int number = sourceList.get(i);
            if(number%2==1) {
                list.addFirst(number);
            } else {
                list.addLast(number);
            }
        }
        return list;
    }
}
