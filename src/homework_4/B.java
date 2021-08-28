package homework_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B {

    public static void main(String[] args) throws IOException {

        Map<String, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        int c;
        List<Character> list = new ArrayList<>();
        while ((c = reader.read()) != -1) {
            if (c == ' ' || c == '\n' && !list.isEmpty()) {

                StringBuilder stringBuilder = new StringBuilder();
                for (Character ch : list) {
                    stringBuilder.append(ch);
                }
                String word = stringBuilder.toString();
                list.clear();

                map.compute(word, (key, total) -> {
                    int count = total == null ? 0 : total + 1;
                    writer.print(count);
                    writer.print(' ');
                    return count;
                });
            }
            else {
                list.add((char) c);
            }
        }

        reader.close();
        writer.close();
    }
}

