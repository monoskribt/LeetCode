package Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        Map<Character, Integer> dictionaryOfS = new HashMap<>();
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>((a, b) ->
                dictionaryOfS.get(b) - dictionaryOfS.get(a)
        );

        for(char el : s.toCharArray()) {
            dictionaryOfS.put(el, dictionaryOfS.getOrDefault(el, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : dictionaryOfS.entrySet()) {
            priorityQueue.offer(entry.getKey());
        }

        StringBuilder sb = new StringBuilder();
        while (!priorityQueue.isEmpty()) {
            char currentEl = priorityQueue.poll();
            int countOfCurrentEl = dictionaryOfS.get(currentEl);

            int counter = 0;
            while (counter < countOfCurrentEl) {
                sb.append(currentEl);
                counter++;
            }
        }

        return sb.toString();
    }
}
