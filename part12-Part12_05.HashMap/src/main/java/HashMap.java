import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {

    private List<Pair<K, V>>[] values;
    private int size;
    private static final double LOAD_FACTOR = 0.75;

    public HashMap() {
        this.values = new List[32];
        for (int i = 0; i < values.length; i++) {
            values[i] = new ArrayList<>();
        }
        this.size = 0;
    }
    
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        List<Pair<K, V>> bucket = values[hashValue];
        
        for (Pair<K, V> pair : bucket) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }
    
    public void add(K key, V value) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        List<Pair<K, V>> bucket = values[hashValue];

        for (Pair<K, V> pair : bucket) {
            if (pair.getKey().equals(key)) {
                pair.setValue(value);
                return;
            }
        }

        bucket.add(new Pair<>(key, value));
        size++;

        if (1.0 * size / values.length > LOAD_FACTOR) {
            grow();
        }
    }
    
    public V remove(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        List<Pair<K, V>> bucket = values[hashValue];
        
        for (Pair<K, V> pair : bucket) {
            if (pair.getKey().equals(key)) {
                bucket.remove(pair);
                size--;
                return pair.getValue();
            }
        }
        return null;
    }
    
    private void grow() {
        List<Pair<K, V>>[] oldValues = values;
        values = new List[oldValues.length * 2];
        for (int i = 0; i < values.length; i++) {
            values[i] = new ArrayList<>();
        }
        
        size = 0;  // reset size, and re-add elements to new array
        for (List<Pair<K, V>> bucket : oldValues) {
            for (Pair<K, V> pair : bucket) {
                add(pair.getKey(), pair.getValue());
            }
        }
    }
}