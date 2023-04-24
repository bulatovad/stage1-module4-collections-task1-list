package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        int difference = (int)(Math.pow(A,2)-Math.pow(B,2));
        return difference == 0 ? A-B : difference;
    }
}
