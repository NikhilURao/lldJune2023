package generics;

import java.util.*;
class GenericMethods<K, V> {
    K key;
    V value;

    GenericMethods(K key, V val){
        this.key = key;
        this.value = val;
    }

    static <N, M> void doSomething (N key, M val) {
        System.out.println(key);
        System.out.println(val);
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
