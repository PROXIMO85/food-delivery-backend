package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int arr[]={2,3,4,5,2,3,4,3,4};
        for (int i = 0; i < arr.length ; i++) {

        }
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                // Əgər artıq varsa, sayını artır
                map.put(num, map.get(num) + 1);
            } else {
                // Əgər yoxdursa, 1 qoy
                map.put(num, 1);
            }

        }
        System.out.println(map);
        int maxCount = 0;
        int mostFrequent = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Ən çox təkrarlanan element: " + mostFrequent);



    }


}


