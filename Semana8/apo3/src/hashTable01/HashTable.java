package hashTable01;

import java.util.ArrayList;

public class HashTable<K,V> {
	
	ArrayList<ArrayList<HashEntry<K, V>>> hashMap;
	int size;
	
	public HashTable() {
		this(10);
	}
	
	public HashTable(int size) {
		this.size = size;
		hashMap = new ArrayList<>(size);
		for(int i=0; i<size; i++)
			hashMap.add(new ArrayList<HashEntry<K, V>>());
	}
	
	public int getHashIndex(K key) {
		return key.hashCode() % size;
	}
	
	public V get(K key) {
		int idx = getHashIndex(key);
		System.out.println("GET "+ idx);
		ArrayList<HashEntry<K, V>> entryList = hashMap.get(idx);
		System.out.println("GOT List: " + entryList);
		for(HashEntry<K, V> entry : entryList) {
			if(entry.key.equals(key)) {
				return entry.value;
			}
		}
		return null;
	}
	
	public void put(K key, V value) {
		int idx = getHashIndex(key);
		System.out.println("PUT "+ idx);	
		ArrayList<HashEntry<K, V>> entryList = hashMap.get(idx);
		HashEntry<K, V> newEntry = new HashEntry<K, V>(key, value);
		boolean isFound = false;
		for(HashEntry<K, V> entry : entryList) {
			if(entry.key.equals(newEntry.key)) {
				isFound = true;
				entry.value = newEntry.value;
			}
		}
		if(!isFound) {
			entryList.add(newEntry);
		}
		System.out.println(hashMap);
	}

}
	
