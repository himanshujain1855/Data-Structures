package gfg.maths;

import java.util.ArrayList;

public class QuadraticEquationRoots {
    public static void main(String[] args) {
        System.out.println( quadraticRoots(1,-2,1));

        System.out.println(quadraticRoots(1,-7,12));

        System.out.println(quadraticRoots(2, 8, 8));
        System.out.println(quadraticRoots(752, 904, 164));

        System.out.println(quadraticRoots(280 , 399 , 573));
    }

    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int discriminant=((b * b) - (4 * a * c));
        if(discriminant < 0 ){
            arrayList.add(-1);
            return arrayList;
        }

        int rootA=(int) Math.floor(((-b + Math.sqrt(discriminant)) / (2 * a)));
        int rootB=(int) Math.floor(((-b - Math.sqrt(discriminant)) / (2 * a)));

        if(rootA>rootB){
            arrayList.add(rootA);
            arrayList.add(rootB);
        }else {
            arrayList.add(rootB);
            arrayList.add(rootA);
        }
        return arrayList;
    }


}
