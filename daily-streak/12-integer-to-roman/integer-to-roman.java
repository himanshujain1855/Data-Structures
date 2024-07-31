class Solution {
    public String intToRoman(int num) {
        StringBuilder ansSB=new StringBuilder("");
        
        int mult=1;

        while(num!=0){
            int digit = (num % 10) * mult;
            
            String digis="";

            if(mult==1){
                digis=evalOneToTen(digit);
            }else if(mult==10){
                digis=evalTenToHun(digit);
            }else if(mult==100){
                digis=evalHunToFiveHun(digit);
            }else if(mult==1000){
                digis=evalOneThouToThreeThou(digit);
            }

            ansSB.insert(0, digis);
            num/=10;
            mult*=10;
        }

        return ansSB.toString();
    }

    static String evalOneToTen(int digit){
        if(digit==0) return "";

        if(digit>=1 && digit<=3) {
            StringBuilder ansSB=new StringBuilder();

            for(int i=1;i<=digit;i++){
                ansSB.append("I");
            }
            return ansSB.toString();
        }

        if(digit==4) return "IV";

        if(digit==5) return "V";

        if(digit==9) return "IX";

        if(digit>5 && digit<=8) {
             StringBuilder ansSB=new StringBuilder("V");
            
            for(int i=6;i<=digit;i++){
                ansSB.append("I");
            }
            return ansSB.toString();
        }

        return "";
    }

    static String evalTenToHun(int digit){
        if(digit==0) return "";

        if(digit>=10 && digit<=30) {
            StringBuilder ansSB=new StringBuilder();

            for(int i=10;i<=digit;i+=10){
                ansSB.append("X");
            }
            return ansSB.toString();
        }

        if(digit==40) return "XL";

        if(digit==50) return "L";

        if(digit>50 && digit<=80) {
             StringBuilder ansSB=new StringBuilder("L");
            
            for(int i=60;i<=digit;i+=10){
                ansSB.append("X");
            }
            return ansSB.toString();
        }

        if(digit==90) return "XC";
        if(digit==100) return "C";

        return "";
    }

    static String evalHunToFiveHun(int digit){
        if(digit==0) return "";

        if(digit>=100 && digit<=300) {
            StringBuilder ansSB=new StringBuilder();

            for(int i=100;i<=digit;i+=100){
                ansSB.append("C");
            }
            return ansSB.toString();
        }

        if(digit==400) return "CD";

        if(digit==500) return "D";

        if(digit>500 && digit<=800) {
             StringBuilder ansSB=new StringBuilder("D");
            
            for(int i=600;i<=digit;i+=100){
                ansSB.append("C");
            }
            return ansSB.toString();
        }

        if(digit==900) return "CM";

        return "";
    }

    static String evalOneThouToThreeThou(int digit){
        if(digit==0) return "";

        if(digit>=1000 && digit<=3000) {
             StringBuilder ansSB=new StringBuilder();
            
            for(int i=1000;i<=digit;i+=1000){
                ansSB.append("M");
            }
            return ansSB.toString();
        }

        return "";
    }
}