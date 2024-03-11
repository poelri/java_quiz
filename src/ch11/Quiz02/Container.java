package ch11.Quiz02;

public class Container<K, M> {
    private K Key;
    private M Value;

    public K getKey() {
        return Key;
    }

    public void set(K key, M value) {
        this.Key = key;
        this.Value=value;
    }

    public M getValue() {
        return Value;
    }


}
