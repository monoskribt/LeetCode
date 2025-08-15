package Easy;

import java.util.LinkedList;

public class DesignHashMap {
    static class Node<K, V> {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    LinkedList<Node<Integer, Integer>>[] table;
    int sizeOfTable;

    public DesignHashMap() {
        table = new LinkedList[10];

        for(int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<Node<Integer, Integer>>();
        }

        sizeOfTable = 0;
    }

    private int computeIndex(Object key, int capacity) {
        int hashKey = key.hashCode();
        return Math.abs(hashKey % capacity);
    }

    public void put(int key, int value) {
        if(needsResize()) {
            resizeTable();
        }

        int bucketIndex = computeIndex(key, table.length);

        LinkedList<Node<Integer, Integer>> currentBucket = table[bucketIndex];
        for(Node<Integer, Integer> node : currentBucket) {
            if(node.key == key) {
                node.value = value;
                return;
            }
        }

        currentBucket.add(new Node<>(key, value));
        sizeOfTable++;
    }

    public int get(int key) {
        int bucketIndex = computeIndex(key, table.length);

        LinkedList<Node<Integer, Integer>> currentBucket = table[bucketIndex];
        for(Node<Integer, Integer> node : currentBucket) {
            if(node.key == key) {
                return node.value;
            }
        }

        return -1;
    }

    public void remove(int key) {
        int bucketIndex = computeIndex(key, table.length);
        LinkedList<Node<Integer, Integer>> currentBucket = table[bucketIndex];

        boolean removed = currentBucket.removeIf(node -> node.key == key);
        if (removed) {
            sizeOfTable--;
        }
    }


    private int size() {
        return sizeOfTable;
    }

    private boolean needsResize() {
        return sizeOfTable >= table.length * 0.75;
    }

    private void resizeTable() {
        LinkedList<Node<Integer, Integer>>[] tableWithMoreCapacity = new LinkedList[table.length * 2];
        int newLength = tableWithMoreCapacity.length;

        for(int i = 0; i < newLength; i++) {
            tableWithMoreCapacity[i] = new LinkedList<Node<Integer, Integer>>();
        }

        for (LinkedList<Node<Integer, Integer>> currentBucket : table) {
            for (Node<Integer, Integer> node : currentBucket) {
                int newBucketIndex = computeIndex(node.key, newLength);
                LinkedList<Node<Integer, Integer>> newBucket = tableWithMoreCapacity[newBucketIndex];
                newBucket.add(node);
            }
        }

        table = tableWithMoreCapacity;
    }
}
