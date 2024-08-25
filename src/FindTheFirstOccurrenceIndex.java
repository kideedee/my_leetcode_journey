import java.util.Scanner;

public class FindTheFirstOccurrenceIndex {

    public static int strStr(String haystack, String needle) {
//      Implementation 1
        //        int needleIndex = 0;
//        int res = -1;
//
//        if (haystack.length() < needle.length()){
//            return res;
//        }
//
//        for (int i = 0; i < haystack.length(); i++) {
//            if (haystack.charAt(i) != needle.charAt(0)) {
//                continue;
//            }
//
//            boolean flag = false;
//            for (int j = i; j < haystack.length(); j++) {
//                char a = haystack.charAt(j);
//                char b = needle.charAt(needleIndex);
//                if (a == b) {
//                    needleIndex++;
//                    if (needleIndex == needle.length()) {
//                        res = j - needleIndex + 1;
//                        flag = true;
//                        break;
//                    }
//                    continue;
//                }
//
//                needleIndex = 0;
//                break;
//            }
//
//            if (flag) {
//                break;
//            }
//        }
//
//        return res;

//        Implementation 2
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(strStr(a, b));
    }
}
