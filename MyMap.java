import java.util.*;

public class MyMap<T> {
    private Map<String, T> map;

    public MyMap() {
        this.map = new HashMap<>();
    }

    @Override
    public String toString() {
        String result = "{\n";
        for (Map.Entry pair : this.map.entrySet()) {
            result = result + pair + ",\n";
        }

        result += "}";
        return result;
    }

    public Map<String, T> getMap() {
        return this.map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    public T save(String id, T value) {
        return this.map.put(id, value);
    }

    public T delete(String id) {
        return this.map.remove(id);
    }

    public T edit(String id, T newValue) {
        return this.map.replace(id, newValue);
    }

    public T getValueOf(String id) {
        return this.map.get(id);
    }

    public List<T> showValues() {

        List<T> values = new ArrayList<>();
        for (T value : this.map.values()) {
            values.add(value);
        }
        return values;
    }

    public List<String> showIds() {

        List<String> ids = new ArrayList();
        for (String id : this.map.keySet()) {
            ids.add(id);
        }
        return ids;
    }

    public Set<Map.Entry<String, T>> showPairs() {

        return this.map.entrySet();
    }

    public TreeMap<String, T> sort() {
        return new TreeMap<>(this.map);
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public int size() {
        return this.map.size();
    }

    public boolean containsId(String id) {
        return this.map.containsKey(id);
    }
}
