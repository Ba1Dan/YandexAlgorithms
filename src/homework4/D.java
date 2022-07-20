package homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class D {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        String[] items = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            map.put(i + 1, Integer.parseInt(items[i]));
        }

        int m = Integer.parseInt(reader.readLine());
        items = reader.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(items[i]);
            map.put(key, map.get(key) - 1);
        }

        for (int key : map.keySet()) {
            int value = map.get(key);
            if (value >= 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
