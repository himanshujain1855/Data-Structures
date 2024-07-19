class Solution {
    public static int numUniqueEmails(String[] emails) {
        int len = emails.length;
        HashMap<String, Integer> uniqueMails = new HashMap();
        boolean add = true;
        boolean ampherSendEncountered = false;
        for (int i = 0; i < len; i++) {
            add = true;
            ampherSendEncountered = false;
            int emailLen = emails[i].length();
            String email = emails[i];
            StringBuilder emailBuilder = new StringBuilder();

            for (int k = 0; k < emailLen; k++) {
                char charAt=email.charAt(k);

                if (charAt == '@') {
                    ampherSendEncountered = true;
                }
                if (charAt == '+') {
                    add = false;
                }
                if (ampherSendEncountered || (add && !(charAt == '.'))) {
                    emailBuilder.append(charAt);
                }
            }
            if(ampherSendEncountered){
                uniqueMails.put(emailBuilder.toString(), 1);
            }
        }

        return uniqueMails.size();
    }
}