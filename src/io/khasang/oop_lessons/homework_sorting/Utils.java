package io.khasang.oop_lessons.homework_sorting;

import java.util.Arrays;

public class Utils {



    String sortBubble(int[] params) {
        for (int i = 0; i < params.length; i++) {
            for (int j = i + 1; j < params.length; j++) {
                if (params[i] < params[j]) {
                    int temp = params[i];
                    params[i] = params[j];
                    params[j] = temp;
                }


            }

        }
        String ans = Arrays.toString(params);

        return ans;
    }
}
