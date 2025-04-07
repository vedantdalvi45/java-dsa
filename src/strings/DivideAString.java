package strings;

import javax.swing.*;
import java.util.*;

public class DivideAString {
    public static void main(String[] args) {
        System.out.println(removeChars("abc123"));
        String[] string = {"https://www.w3schools.com/java1/try",
                "https://www.w3schools.com/java2/tryja/tryj",
                "https://www.w3schools.com/java3/tryja/id1/id2",
                "https://www.w3schools.com/java5/tryj/id1",
                "https://www.w3schools.com/java4"};
        Map<Integer,String> map = new TreeMap<>();
        for (String s : string) {
            String[] list = s.split("/");
            System.out.println(Arrays.toString(list));
            map.put(removeChars(list[3]),s);
        }
        System.out.println(map);
    }
    static int removeChars(String s){
        String i = "";
        for (char ch : s.toCharArray()) {
            if (Character.isAlphabetic(ch)){
                continue;
            }else {
                i+=ch;
            }
        }
        return Integer.parseInt(i);
    }
}
