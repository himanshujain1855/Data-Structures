package gfg.potd;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        System.out.println(check(" uq  QTYnj,F,Uv ecDACL  ZgeSoW mgjzmcAg   L, TKShMs ,pQD YjxB TPJa aSFjXEA.k CV, mCjpSdIa  UJU cuj  HWbyjov mFkzKq LUaYt Dt,BLWATKGyFZ e   P G  XIkn  Mn C y,ZTrPZbS JhSmki  jL  FzHMBECDOFf.Cy , bXjBmNlqcoJM i.lL dhZv sn dJ.CHvLu ,flo , G.RyobQ vmFCfh pS TP .Tt  ,.hfhE,tA ZwEVqIWlIRyv bkrJ LQ,NL G TWcGxTbFGD EpWd .k RFYfTUX ,OMdJcOL,nnVgS .Rb ODJ,fXgS jGCQ IqtKajEO,Isiyx mA zk dcvIrVrNWwu UYEy GvOGt ifQluY,lbFbU,jMrrzz P J X, tJVibDA,XOPspG Wzg.myCLMW.SGD LAK.kBbKPvQBdthTvgobfX g GQ.q CKhdc VB  fuuBsa LXwUvMlvp.p"));
        System.out.println(checkV2(" uq  QTYnj,F,Uv ecDACL  ZgeSoW mgjzmcAg   L, TKShMs ,pQD YjxB TPJa aSFjXEA.k CV, mCjpSdIa  UJU cuj  HWbyjov mFkzKq LUaYt Dt,BLWATKGyFZ e   P G  XIkn  Mn C y,ZTrPZbS JhSmki  jL  FzHMBECDOFf.Cy , bXjBmNlqcoJM i.lL dhZv sn dJ.CHvLu ,flo , G.RyobQ vmFCfh pS TP .Tt  ,.hfhE,tA ZwEVqIWlIRyv bkrJ LQ,NL G TWcGxTbFGD EpWd .k RFYfTUX ,OMdJcOL,nnVgS .Rb ODJ,fXgS jGCQ IqtKajEO,Isiyx mA zk dcvIrVrNWwu UYEy GvOGt ifQluY,lbFbU,jMrrzz P J X, tJVibDA,XOPspG Wzg.myCLMW.SGD LAK.kBbKPvQBdthTvgobfX g GQ.q CKhdc VB  fuuBsa LXwUvMlvp.p"));
        System.out.println(checkV3(" uq  QTYnj,F,Uv ecDACL  ZgeSoW mgjzmcAg   L, TKShMs ,pQD YjxB TPJa aSFjXEA.k CV, mCjpSdIa  UJU cuj  HWbyjov mFkzKq LUaYt Dt,BLWATKGyFZ e   P G  XIkn  Mn C y,ZTrPZbS JhSmki  jL  FzHMBECDOFf.Cy , bXjBmNlqcoJM i.lL dhZv sn dJ.CHvLu ,flo , G.RyobQ vmFCfh pS TP .Tt  ,.hfhE,tA ZwEVqIWlIRyv bkrJ LQ,NL G TWcGxTbFGD EpWd .k RFYfTUX ,OMdJcOL,nnVgS .Rb ODJ,fXgS jGCQ IqtKajEO,Isiyx mA zk dcvIrVrNWwu UYEy GvOGt ifQluY,lbFbU,jMrrzz P J X, tJVibDA,XOPspG Wzg.myCLMW.SGD LAK.kBbKPvQBdthTvgobfX g GQ.q CKhdc VB  fuuBsa LXwUvMlvp.p"));
        System.out.println(checkV4(" uq  QTYnj,F,Uv ecDACL  ZgeSoW mgjzmcAg   L, TKShMs ,pQD YjxB TPJa aSFjXEA.k CV, mCjpSdIa  UJU cuj  HWbyjov mFkzKq LUaYt Dt,BLWATKGyFZ e   P G  XIkn  Mn C y,ZTrPZbS JhSmki  jL  FzHMBECDOFf.Cy , bXjBmNlqcoJM i.lL dhZv sn dJ.CHvLu ,flo , G.RyobQ vmFCfh pS TP .Tt  ,.hfhE,tA ZwEVqIWlIRyv bkrJ LQ,NL G TWcGxTbFGD EpWd .k RFYfTUX ,OMdJcOL,nnVgS .Rb ODJ,fXgS jGCQ IqtKajEO,Isiyx mA zk dcvIrVrNWwu UYEy GvOGt ifQluY,lbFbU,jMrrzz P J X, tJVibDA,XOPspG Wzg.myCLMW.SGD LAK.kBbKPvQBdthTvgobfX g GQ.q CKhdc VB  fuuBsa LXwUvMlvp.p"));
        System.out.println(checkV5(" uq  QTYnj,F,Uv ecDACL  ZgeSoW mgjzmcAg   L, TKShMs ,pQD YjxB TPJa aSFjXEA.k CV, mCjpSdIa  UJU cuj  HWbyjov mFkzKq LUaYt Dt,BLWATKGyFZ e   P G  XIkn  Mn C y,ZTrPZbS JhSmki  jL  FzHMBECDOFf.Cy , bXjBmNlqcoJM i.lL dhZv sn dJ.CHvLu ,flo , G.RyobQ vmFCfh pS TP .Tt  ,.hfhE,tA ZwEVqIWlIRyv bkrJ LQ,NL G TWcGxTbFGD EpWd .k RFYfTUX ,OMdJcOL,nnVgS .Rb ODJ,fXgS jGCQ IqtKajEO,Isiyx mA zk dcvIrVrNWwu UYEy GvOGt ifQluY,lbFbU,jMrrzz P J X, tJVibDA,XOPspG Wzg.myCLMW.SGD LAK.kBbKPvQBdthTvgobfX g GQ.q CKhdc VB  fuuBsa LXwUvMlvp.p"));
        System.out.println(checkV6(" uq  QTYnj,F,Uv ecDACL  ZgeSoW mgjzmcAg   L, TKShMs ,pQD YjxB TPJa aSFjXEA.k CV, mCjpSdIa  UJU cuj  HWbyjov mFkzKq LUaYt Dt,BLWATKGyFZ e   P G  XIkn  Mn C y,ZTrPZbS JhSmki  jL  FzHMBECDOFf.Cy , bXjBmNlqcoJM i.lL dhZv sn dJ.CHvLu ,flo , G.RyobQ vmFCfh pS TP .Tt  ,.hfhE,tA ZwEVqIWlIRyv bkrJ LQ,NL G TWcGxTbFGD EpWd .k RFYfTUX ,OMdJcOL,nnVgS .Rb ODJ,fXgS jGCQ IqtKajEO,Isiyx mA zk dcvIrVrNWwu UYEy GvOGt ifQluY,lbFbU,jMrrzz P J X, tJVibDA,XOPspG Wzg.myCLMW.SGD LAK.kBbKPvQBdthTvgobfX g GQ.q CKhdc VB  fuuBsa LXwUvMlvp.p"));
        System.out.println(checkV7(" uq  QTYnj,F,Uv ecDACL  ZgeSoW mgjzmcAg   L, TKShMs ,pQD YjxB TPJa aSFjXEA.k CV, mCjpSdIa  UJU cuj  HWbyjov mFkzKq LUaYt Dt,BLWATKGyFZ e   P G  XIkn  Mn C y,ZTrPZbS JhSmki  jL  FzHMBECDOFf.Cy , bXjBmNlqcoJM i.lL dhZv sn dJ.CHvLu ,flo , G.RyobQ vmFCfh pS TP .Tt  ,.hfhE,tA ZwEVqIWlIRyv bkrJ LQ,NL G TWcGxTbFGD EpWd .k RFYfTUX ,OMdJcOL,nnVgS .Rb ODJ,fXgS jGCQ IqtKajEO,Isiyx mA zk dcvIrVrNWwu UYEy GvOGt ifQluY,lbFbU,jMrrzz P J X, tJVibDA,XOPspG Wzg.myCLMW.SGD LAK.kBbKPvQBdthTvgobfX g GQ.q CKhdc VB  fuuBsa LXwUvMlvp.p"));

    }

    // using map

    public static boolean check(String s) {
        int len = s.length();


        if(len<26) return false;
        Map<Character,Boolean> map=new HashMap();

        for(int i=0;i<len;i++) {
            if ((s.charAt(i) >= 65 && s.charAt(i) <= 90)
                    || (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
                map.put(Character.toUpperCase(s.charAt(i)), true);
            }
        }
        return map.size() == 26;
    }

    // Using set
    public static boolean checkV2(String s) {
        int len = s.length();


        if(len<26) return false;
        Set<Character> set=new HashSet<>();

        for(int i=0;i<len;i++) {
            if ((s.charAt(i) >= 65 && s.charAt(i) <= 90)
                    || (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
                set.add(Character.toUpperCase(s.charAt(i)));
            }
        }
        return set.size() == 26;
    }

    // using array
    public static boolean checkV3(String s) {
        int len = s.length();


        if(len<26) return false;

        boolean[] arr=new boolean[26];

        for(int i=0;i<len;i++) {
            if ((s.charAt(i) >= 65 && s.charAt(i) <= 90)
                    || (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {

                arr[Character.toUpperCase(s.charAt(i))-65]=true;
            }
        }
        int count=0;
        for (int i = 0; i < 26; i++) {
            if(arr[i]) count++;
        }
        return count == 26;
    }


    // memory wise bad , cpu wise good
    public static boolean checkV4(String sentence) {
        int len = sentence.length();


        if(len<26) return false;

        boolean[] arr=new boolean[26];

        Character tempChar;
        for(int i=0;i<len;i++) {
            tempChar=Character.toUpperCase(sentence.charAt(i));

            if (tempChar >= 65 && tempChar <= 90) {

                arr[tempChar-65]=true;
            }
        }
        int count=0;
        for (int i = 0; i < 26; i++) {
            if(arr[i]) count++;
        }
        return count == 26;
    }

    // memory wise good , cpu wise bad
    public static boolean checkV5(String sentence) {
        int len = sentence.length();


        if(len<26) return false;

        boolean[] arr=new boolean[26];


        for(int i=0;i<len;i++) {


            if (Character.toUpperCase(sentence.charAt(i)) >= 65 && Character.toUpperCase(sentence.charAt(i)) <= 90) {

                arr[Character.toUpperCase(sentence.charAt(i))-65]=true;
            }
        }
        int count=0;
        for (int i = 0; i < 26; i++) {
            if(arr[i]) count++;
        }
        return count == 26;
    }

    // memory wise goof , cpu wise good , source leetcode
    public static boolean checkV6(String sentence) {
        int len = sentence.length();
        if(len<26) return false;

        boolean[] arr=new boolean[26];
        char tempChar;

        for(int i=0;i<len;i++) {
            tempChar=Character.toUpperCase(sentence.charAt(i));

            if (tempChar >= 65 && tempChar <= 90) {

                arr[tempChar-65]=true;
            }
        }
        int count=0;
        for (int i = 0; i < 26; i++) {
            if(arr[i]) count++;
        }
        return count == 26;
    }

    public static boolean checkV7(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }

        boolean[] arr = new boolean[26];
        char tempChar;
        for (char ch : sentence.toCharArray()) {
            tempChar = Character.toUpperCase(ch);
            if (tempChar >= 65 && tempChar <= 90) {
                arr[tempChar - 65] = true;
            }
        }

        for (boolean value : arr) {
            if (!value) {
                return false;
            }
        }

        return true;
    }
}
