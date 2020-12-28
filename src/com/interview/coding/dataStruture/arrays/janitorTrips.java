package com.interview.coding.dataStruture.arrays;

import java.util.Collections;
import java.util.List;

public class janitorTrips {


    public static int efficientJanitor(List<Integer> weight) {
        Collections.sort(weight);
        int trips = 0;
        int startPoint = 0;
        int endPoint = weight.size() - 1;
        for (int i = weight.size() - 1; i >= 0; i--) {
            if (weight.get(i) > 1.99) {
                trips += 1;
            }

        }
        return 0;
    }
}
