package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Set<String> set = new HashSet<>();
        for (String s : input) {
            if (!set.contains(s)) {
                set.add(s);
            }
        }
        System.out.println(set.size());
    }
}
