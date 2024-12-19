package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class InsertDeleteGetRandomO_1 {

    private ArrayList<Integer> list;
    private HashMap<Integer, Integer> map;
    private Random random;

    public InsertDeleteGetRandomO_1() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        else {
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);
        list.set(index, list.getLast());

        map.put(list.get(index), index);
        list.removeLast();

        map.remove(val);

        return true;

    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }


    public static void main(String[] args) {
        InsertDeleteGetRandomO_1 object = new InsertDeleteGetRandomO_1();


        System.out.println(object.insert(10));
        System.out.println(object.insert(20));
        System.out.println(object.insert(30));
        System.out.println(object.insert(10));


        System.out.println(object.remove(20));
        System.out.println(object.remove(40));
    }

}
