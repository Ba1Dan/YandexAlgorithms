package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] list1 = br.readLine().split(" ");
        String[] list2 = br.readLine().split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(list1));
        List<Integer> result = new ArrayList<>();
        for (String item : list2) {
            if (set.contains(item)) {
                result.add(Integer.parseInt(item));
            }
        }
        Collections.sort(result);
        for (Integer item : result) {
            System.out.print(item + " ");
        }
    }
}
