package gfg.lcweekly;

public class ValidWord {
    public static void main(String[] args) {
        System.out.println(isValid("234Adas"));
        System.out.println(isValid( "b3"));
        System.out.println(isValid( "a3$e"));
        System.out.println(isValid( "aeb"));
        System.out.println(isValid( "aebu"));
        System.out.println(isValid( "au"));
    }

    public static boolean isValid(String word) {
        if (word.length() < 3) return false;
        word = word.toLowerCase();
        return (!(word.contains("@") || word.contains("#") || word.contains("$")))
                && (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) &&
                (word.contains("b") || word.contains("c") || word.contains("d")
                        || word.contains("f") || word.contains("g") || word.contains("h")
                        || word.contains("j") || word.contains("k") || word.contains("l")
                        || word.contains("m") || word.contains("n") || word.contains("p")
                        || word.contains("q") || word.contains("r") || word.contains("s") || word.contains("t")
                        || word.contains("v") || word.contains("w") || word.contains("x")
                        || word.contains("y") || word.contains("z"));
    }
}
