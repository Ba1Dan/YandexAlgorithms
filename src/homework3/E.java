package homework3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            set.add(in.nextInt());
        }
        int num = in.nextInt();
        int count = 0;
        while (num > 0) {
            int d = num % 10;
            if (!set.contains(d)) {
                set.add(d);
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
