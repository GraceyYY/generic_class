import java.util.Map;

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
}
