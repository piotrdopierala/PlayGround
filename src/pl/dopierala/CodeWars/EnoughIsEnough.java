package pl.dopierala.CodeWars;

import java.util.*;

public class EnoughIsEnough {
    public static void main(String[] args) {
        int[] pictures = {1, 1, 3, 3, 7, 2, 2, 2, 2};
        Arrays.stream(deleteNth(pictures, 2)).forEach(System.out::println);
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if (maxOccurrences < 0)
            return new int[0];

        HashMap<Integer, Integer> occurences = new LinkedHashMap<>();
        List<Integer> retArray = new LinkedList<>();
        for (int i = 0; i < elements.length; i++) {
            occurences.put(elements[i], (occurences.containsKey(elements[i]) ? occurences.get(elements[i]) + 1 : 1));
            if (occurences.get(elements[i]) <= maxOccurrences)
                retArray.add(elements[i]);
        }
        return retArray.stream().mapToInt(p->p).toArray();
    }
}
