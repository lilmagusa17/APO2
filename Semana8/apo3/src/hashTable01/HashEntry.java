package hashTable01;

public class HashEntry <K, V> {
		K key;
		V value;
		
		public HashEntry(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		public String toString() {
			return key.toString() + "=" + value.toString();
		}
}
