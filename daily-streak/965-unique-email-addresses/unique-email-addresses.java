class Solution {
    public static int numUniqueEmails(String[] emails) {
        int len = emails.length;
        HashMap<String, Integer> uniqueMails = new HashMap();

        for (int i = 0; i < len; i++) {
            if (!emails[i].contains("@"))
                continue;
            String[] splitedByAmpherSend = emails[i].split("@");

            StringBuilder localName = new StringBuilder();
            String emailWithDotAndPlus = splitedByAmpherSend[0];
            int emailWithDotLen = emailWithDotAndPlus.length();
            for (int j = 0; j < emailWithDotLen; j++) {
                if (emailWithDotAndPlus.charAt(j) == '.')
                    continue;
                if (emailWithDotAndPlus.charAt(j) == '+')
                    break;
                localName.append(emailWithDotAndPlus.charAt(j));
            }

            String email = localName + "@" + splitedByAmpherSend[1];
            uniqueMails.put(email, 1);
        }

        return uniqueMails.size();
    }
}