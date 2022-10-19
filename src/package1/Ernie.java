package package1;

import java.util.Arrays;

public class Ernie {

    public static void main(String[] args) {

        String str1 = "abdc";
        String str2 = "cabh";
        char[] ch1 = str1.toCharArray();  //{a,b,d,c}
        char[] ch2 = str2.toCharArray();  //{c,a,b,d}
        String str1Sorted = "";
        String str2Sorted = "";
        Arrays.sort(ch1);   //{a,b,c,d}
        Arrays.sort(ch2);   //{a,b,c,d}
        for (char each : ch1) {
            str1Sorted += each;   //"abcd"
        }
        for (char each : ch2) {    //"abcd"
            str2Sorted += each;
        }
        System.out.println(str1Sorted.equals(str2Sorted));


    }
}


