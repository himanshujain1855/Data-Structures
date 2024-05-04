package gfg.lcdailystreak;

import java.util.Arrays;

// two pointer , sorting
public class BoatsToSavePeople {
    public static void main(String[] args) {
        System.out.println(numRescueBoatsFor2People(new int[]{1,1,1,1,1,2,2,2,2,3,3,4,4},4));
        System.out.println(numRescueBoatsFor2People(new int[]{3,2,2,1},3));
        System.out.println(numRescueBoatsFor2People(new int[]{1,2},3));
        System.out.println(numRescueBoatsFor2People(new int[]{3,5,3,4},5));
        System.out.println(numRescueBoatsFor2People(new int[]{2,49,10,7,11,41,47,2,22,6,13,12,33,18,10,26,2,6,50,10},50));
    }

    public static int numRescueBoatsFor2People(int[] people, int limit) {
        int size=people.length;
        if(size==1) return 1;

        int i=0,boats=0;
        int j=size-1;

        Arrays.sort(people);

        while (j >= i){
            if((people[i]+people[j]<=limit) || (i==j)){
                boats++;
                i++;
                j--;
            }else if((people[j]==limit) || (people[i]+people[j]>limit)){
                boats++;
                j--;
            }
        }
        return boats;
    }
    public static int numRescueBoatsForNNumberOfPeople(int[] people, int limit) {
        int boats=0;
        if(people.length==1) return 1;

        int i=0;
        int j=people.length-1;

        Arrays.sort(people);

        while (j >= i){
            if((i==j) || (people[i]+people[j]==limit)){
                boats++;
                i++;
                j--;
            }else if((people[j]==limit) || (people[i]+people[j]>limit)){
                boats++;
                j--;
            }else{
                int temp=limit-people[j];

                int newI=i;

                while (temp>0){
                    temp=temp-people[newI];
                    newI++;
                }
                if(temp==0) i=newI;
                if(temp<0) i=newI-1;
                j--;
                boats++;
            }
        }
        return boats;
    }
}
