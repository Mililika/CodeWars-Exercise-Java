public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String result = "";
        String[] words = name.split(" ");
        result = words[0].charAt(0) + "." + words[1].charAt(0);
        return result.toUpperCase();
    }
}
