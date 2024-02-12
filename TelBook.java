import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.List;
/**
 * TelBook
 */
public class TelBook {
    Map<String, ArrayList<Integer>> book = new HashMap<>();
    
    public void add(String name, int numberPhone)
    {
        if (book.containsKey(name))
        {
            ArrayList<Integer> phone_numbers = new ArrayList<>(book.get(name));
            phone_numbers.add(numberPhone);
            book.put(name, phone_numbers);
        }
        else
        {
            ArrayList<Integer> phone_numbers = new ArrayList<>();
            phone_numbers.add(numberPhone);
            book.put(name, phone_numbers);
        }
    }
    public void print() {
        List<Map.Entry<String, ArrayList<Integer>>> sortedEntries = book.entrySet()
                .stream()
                .sorted(Comparator.comparingInt((Map.Entry<String, ArrayList<Integer>> entry) -> entry.getValue().size()).reversed())
                .collect(Collectors.toList());

        for (Map.Entry<String, ArrayList<Integer>> entry : sortedEntries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}