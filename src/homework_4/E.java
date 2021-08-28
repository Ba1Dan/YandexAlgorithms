package homework_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] pair = reader.readLine().split(" ");
            int key = Integer.parseInt(pair[0]);
            int value = Integer.parseInt(pair[1]);
            if (map.containsKey(key)) {
                int curValue = map.get(key);
                if (value > curValue) {
                    map.put(key, value);
                }
            } else {
                map.put(key, value);
            }
        }

        long result = 0;
        for (int key : map.keySet()) {
            result += map.get(key);
        }
        System.out.println(result);
    }
}
