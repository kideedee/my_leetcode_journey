import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] v) {
        // Implementation 1
//        String common = strs[0];
//        for (int i = 1; i < strs.length; i++) {
//            String current = strs[i];
//            String temp = "";
//            int maxLength = Math.min(common.length(), current.length());
//            for (int j = 0; j < maxLength; j++) {
//                if (common.charAt(j) == current.charAt(j)) {
//                    temp += common.charAt(j);
//                } else {
//                    break;
//                }
//            }
//            common = temp;
//        }
//        return common;

        // Implementation 2
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] a = inputLine.split(" ");
        System.out.println(longestCommonPrefix(a));
    }
}
