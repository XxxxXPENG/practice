package JzOffer.cache;

import java.util.LinkedHashMap;

public class LRUCache {
    private int cap;
    private LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public LRUCache(int cap) {
        this.cap = cap;
    }

    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }
        makeRecently(key);
        return cache.get(key);
    }

    public void put(int key, int val) {
        if (cache.containsKey(key)) {
            cache.put(key, val);
            makeRecently(key);
            return;
        }
        if (cache.size() >= this.cap) {
            //首个元素就是最久未使用
            int oldestKey = cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }
        //将新节点加入
        cache.put(key, val);
    }

    private void makeRecently(int key) {
        int val = cache.get(key);
        cache.remove(key);
        cache.put(key, val);
    }
}
