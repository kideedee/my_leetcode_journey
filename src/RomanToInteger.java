import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

    public static int convert(char ch) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        return map.get(ch);
    }

    public static Integer subtractionInstance(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        return map.get(s);
    }

    public static int romanToInt(String s) {
        // Implementation 1
//        int result = 0;
//        for (int i = 0; i < s.length(); i++) {
//            String temp = "";
//            if (i <= s.length() - 2) {
//                temp = s.substring(i, i + 2);
//            }
//
//            if (subtractionInstance(temp) != null) {
//                result += subtractionInstance(temp);
//                i++;
//            } else {
//                result += convert(s.charAt(i));
//            }
//        }
//        return result;

        //Implementation 2
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(romanToInt(s));
    }
}
