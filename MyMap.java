import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyMap<T> {
    private Map<String, T> map;

    public Map<String, T> getMap() {
        return this.map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    public T save(String id, T value) {
        return map.put(id, value);
    }

    public T delete(String id) {
        return map.remove(id);
    }

    public T edit(String id, T newValue) {
        return map.replace(id, newValue);
    }

    public T getValueOf(String id) {
        return map.get(id);
    }

    public List<T> showValues() {

        List<T> values = new ArrayList<>();
        for (T value : map.values()) {
            values.add(value);
        }
        return values;
    }

    public List<String> showIds() {

        List<String> ids = new ArrayList();
        for (String id : map.keySet()) {
            ids.add(id);
        }
        return ids;
    }

    public Set<Map.Entry<String, T>> showPairs() {

        return map.entrySet();
    }

    
}
