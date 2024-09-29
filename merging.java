public class StringMerger {
    public static String mergeStrings(String s1, String s2) {
        StringBuilder mergedString = new StringBuilder();

        int i = 0;
        while (i < s1.length() && i < s2.length()) {
            mergedString.append(s1.charAt(i));
            mergedString.append(s2.charAt(i));
            i++;
        }

        if (i < s1.length()) {
            mergedString.append(s1.substring(i));
        } else {
            mergedString.append(s2.substring(i));
        }

        return mergedString.toString();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String mergedString = mergeStrings(s1, s2);
        System.out.println("Merged String: " + mergedString);
    }
}