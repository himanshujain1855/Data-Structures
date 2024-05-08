package gfg.lcdailystreak;

import java.util.Arrays;
import java.util.Collections;

public class RelativeRanks {

    public static void main(String[] args) {
        int[] input = new int[]{10, 3, 8, 9, 4};
        findRelativeRanks(input);
        input = new int[]{5, 4, 3, 2, 1};
        findRelativeRanks(input);
    }

    public static String[] findRelativeRanks(int[] score) {
        int[] sortedScore = Arrays.copyOf(score, score.length);

        Arrays.sort(sortedScore);

        String[] output = new String[score.length];

        boolean gold = false, silver = false, bronze = false;

        for (int i = 0; i < score.length; i++) {
            output[i] = String.valueOf((score.length) - Arrays.binarySearch(sortedScore, score[i]));
            if (!(gold && silver && bronze)) {
                switch (output[i]) {
                    case "1":
                        output[i] = "Gold Medal";
                        gold = true;
                        break;
                    case "2":
                        output[i] = "Silver Medal";
                        silver = true;
                        break;
                    case "3":
                        output[i] = "Bronze Medal";
                        bronze = true;
                        break;
                }
            }
        }
        return output;
    }


}
