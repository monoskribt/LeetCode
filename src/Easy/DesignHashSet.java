package Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DesignHashSet {
    private int size;
    private List<List<Integer>> prototypeHashSet;

    public DesignHashSet() {
        size = 1000;
        prototypeHashSet = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            prototypeHashSet.add(new LinkedList<>());
        }
    }

    public void add(int key) {
        int index = hashFunction(key);
        List<Integer> bucket = prototypeHashSet.get(index);
        if(!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int index = hashFunction(key);
        List<Integer> bucket = prototypeHashSet.get(index);
        bucket.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int index = hashFunction(key);
        List<Integer> bucket = prototypeHashSet.get(index);
        return bucket.contains(key);
    }

    private int hashFunction(int key) {
        return key % size;
    }

}
