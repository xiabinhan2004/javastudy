import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class ti_2423 {
    public static void main(String[] args) {
        System.out.println(Solution.equalFrequency("ddaccb"));
    }
}

class Solution {
    public static boolean equalFrequency(String word) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (!hm.containsKey(word.charAt(i))) {
                hm.put(word.charAt(i), 1);
            } else {
                int cnt = hm.get(word.charAt(i));
                cnt++;
                hm.put(word.charAt(i), cnt);
            }

        }
        ArrayList<Integer> als = new ArrayList<>();
        hm.forEach(new BiConsumer<Character, Integer>() {

            @Override
            public void accept(Character t, Integer u) {
                // TODO Auto-generated method stub
                als.add(u);
            }

        });
        System.out.println(als);

        for (int i = 0; i < als.size(); i++) {
            int same = als.get(i) - 1;
            boolean flag = true;
            if (same == 0) {
                for (int j = 0; j < als.size(); j++) {
                    if (j == i) {
                        continue;
                    }
                    for (int j2 = 0; j2 < als.size(); j2++) {
                        if (j2 == i) {
                            continue;
                        }
                        if (als.get(j) != als.get(j2)) {
                            flag = false;
                        }
                    }
                }
                if(flag)
                {                return true;}

            }
        
            for (int j = 0; j < als.size(); j++) {
                if (j == i) {
                    continue;
                }
                if (als.get(j) != same) {
                    flag = false;
                }
            }
            if (flag) {
                return true;
            }

        }

        return false;

    }
}