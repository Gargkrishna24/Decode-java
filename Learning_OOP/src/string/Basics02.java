package string;

import java.util.Arrays;

public class Basics02 {
    static void main(String[] args) {
        char[] array = {'K','r','i','s','h','n','a',' ','G','a','r','g'};
        System.out.println("array = " + Arrays.toString(array));

        String s = new String(array);
        System.out.println("s = " + s);

        String s1 = new String(array,0,7);
        System.out.println(s1);

        byte[] number = {100,95,127};
        String s3 = new String(number);
        System.out.println("s3 = " + s3);

        String s4 = new String(number,0,1);
        System.out.println("s4 = " + s4);

    }
}
