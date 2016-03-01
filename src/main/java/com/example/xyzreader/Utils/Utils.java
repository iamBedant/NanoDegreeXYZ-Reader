package com.example.xyzreader.Utils;

/**
 * Created by Kuliza-193 on 2/20/2016.
 */
public class Utils {
    public static float getProgress(int value, int min, int max) {
        if (min == max) {
            throw new IllegalArgumentException("Max (" + max + ") cannot equal min (" + min + ")");
        }

        return (value - min) / (float) (max - min);
    }
}
