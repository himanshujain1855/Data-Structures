class Solution {
    public static int numUniqueEmails(String[] emails) {
        int len=emails.length;
        HashMap<String,Integer> uniqueMails=new HashMap();

        for(int i=0;i<len;i++){
            if(!emails[i].contains("@")) continue;
            String[] splitedByAmpherSend=emails[i].split("@");
            String[] splitedByPlus;
            String[] splitedByDot;

            if(splitedByAmpherSend[0].contains("+")){
                splitedByPlus=new String[]{
                    splitedByAmpherSend[0].substring(0,splitedByAmpherSend[0].indexOf("+"))
                };
            }
            else{
                splitedByPlus=new String[]{splitedByAmpherSend[0]};
            }

            if(splitedByPlus[0].contains(".")){
                splitedByDot=splitedByPlus[0].split("\\.");
            }
            else{
                splitedByDot=new String[]{splitedByPlus[0]};
            }


            StringBuilder localName=new StringBuilder();

            for(String part:splitedByDot){
                localName.append(part);
            }
            String email= localName +"@"+splitedByAmpherSend[1];
            uniqueMails.put(email,1);
        }

        return uniqueMails.size();
    }
}