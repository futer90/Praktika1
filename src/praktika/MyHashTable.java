package praktika;

import java.util.ArrayList;

/**
 * Created by admin on 10.02.2017.
 */
 class MyHashTable {
    ArrayList<Bucket> buckets = new ArrayList<>();

    MyHashTable(int n) {
        for (int i = 0; i < n; i++) {
            buckets.add(new Bucket());
        }
    }

    String get(String k) {
        int h = k.hashCode();
        int index = Math.abs(h % buckets.size());
        Bucket b = buckets.get(index);
        for (Pair p : b.pairs) {
            if ((p.key.equals(k))) {
                return p.value;
            }

        }
        return null;
    }

    void put(String k, String V) {
        int h = k.hashCode();
        int index = Math.abs(h % buckets.size());
        Bucket b = buckets.get(index);
        for (Pair p : b.pairs) {
            if ((p.key.equals(k))) {
                p.value = V;
                return;
            }
        }
b.pairs.add(new Pair(k,V));
    }
}
