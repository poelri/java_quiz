package ch11.Quiz01;

public class Container<K> {
    private K name;

    public K get() {
        return name;
    }

    public void set(K name) {
        this.name = name;
    }
}
