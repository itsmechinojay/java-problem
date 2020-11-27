package com.accenture.democode.day7.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo2 {

    public static void main(String[] args) {
        List<List<String>> list2d = new ArrayList<>();

        for(int i=0; i<3; i++) {
            list2d.add(Arrays.asList(String.valueOf(i), "name" + i));
        }

        System.out.println(list2d);
        for(List<String> rowData : list2d) {
            for(String data : rowData) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }
}
