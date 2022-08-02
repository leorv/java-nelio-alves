public class Strings {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2,9);
        String s06 = original.replace('a','X');
        String s07 = original.replace("abc", "xyz");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original-" + original + "-");
        System.out.println("toLowerCase-" + s01 + "-");
        System.out.println("toUpperCase-" + s02 + "-");
        System.out.println("trim-" + s03 + "-");
        System.out.println("substring-" + s04 + "-");
        System.out.println("substring-" + s05 + "-");
        System.out.println("replace-" + s06 + "-");
        System.out.println("replace-" + s07 + "-");
        System.out.println("indexOf-" + i + "-");
        System.out.println("lastIndexOf-" + j + "-");

        // Split
        String s = "potato apple lemon";

        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println("word1: " + word1);
        System.out.println("word2: " + word2);
        System.out.println("word3: " + word3);
        System.out.println("vect: " + vect);

    }
}
