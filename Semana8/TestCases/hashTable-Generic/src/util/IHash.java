package util;

public interface IHash<K, V> {
    public void put(K key, V value);

    public void remove(K key);

    public V get(K key);

    public int getSize();

    public boolean isEmpty();
}
