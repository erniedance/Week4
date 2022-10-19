package package1;

public class Ernie2 {

    public static String charFrequency(String str) {
        String expectedResult = "";
        int count = 0;
        while (count < str.length()) {
            int i = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(count)) {
                    i++;
                }
            }
            expectedResult += str.charAt(count) + "" + i;
            str = str.replace("" + str.charAt(count), "");
        }
        return expectedResult;

    }
}

