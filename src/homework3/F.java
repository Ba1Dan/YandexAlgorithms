package homework3;

import java.util.*;

public class F {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> set = new HashSet<>();

        String inputA = in.nextLine();
        String inputB = in.nextLine();
        for (int i = 0; i < inputB.length() - 1; i++) {
            String pair = inputB.charAt(i) + String.valueOf(inputB.charAt(i + 1));
            set.add(pair);
        }
        int count = 0;
        for (int i = 0; i < inputA.length() - 1; i++) {
            String pair = inputA.charAt(i) + String.valueOf(inputA.charAt(i + 1));
            if (set.contains(pair)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
