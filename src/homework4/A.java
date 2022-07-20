package homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, String> mapA = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            mapA.put(arr[0], arr[1]);
        }
        String input = br.readLine();
        String result = "";
        Set<String> set = mapA.keySet();
        for (String key : set) {
            if (input.equals(key)) {
                result = mapA.get(key);
            } else if (input.equals(mapA.get(key))) {
                result = key;
            }
         }
        System.out.println(result);
    }
}
