package gfg.weekly;

import java.util.HashMap;

public class KPeriodic {
    public static void main(String[] args) {
//        System.out.println(minimumOperationsToMakeKPeriodic("le",2));
//        System.out.println(minimumOperationsToMakeKPeriodic("lele",2));
//        System.out.println(minimumOperationsToMakeKPeriodic("leet",2));
//        System.out.println(minimumOperationsToMakeKPeriodic("leetcodeleet",4));
//        System.out.println(minimumOperationsToMakeKPeriodic("leetcoleet",2));
        System.out.println(minimumOperationsToMakeKPeriodic("leleetcoetcoetetetetet",2));
//        System.out.println(minimumOperationsToMakeKPeriodic("leetcoleetetleet",2));
    }

    public static int minimumOperationsToMakeKPeriodic(String word, int k) {
        int count=-1;
        int tempCount=0;
        String periodic;

        HashMap<String,Integer> data=new HashMap<>();

        for (int i = 0; i < word.length(); i=i+k) {

            periodic=word.substring(i,i+k);

            if(data.containsKey(periodic)) continue;

            for (int j = 0; j < word.length(); j=j+k) {
                if(!periodic.equals(word.substring(j,j+k))){
                  tempCount++;
                }
            }

            // first time
            if(count==-1) count=tempCount;

            // if new count is less then, update main count
            if(tempCount < count) count=tempCount;
            tempCount=0;
            data.put(periodic,count);
        }

        if(count==-1) return 0;
        return count;
    }
}