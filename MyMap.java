import java.util.Map;

public class MyMap<T> {
    private Map<String, T> map;

    public Map<String, T> getMap() {
        return this.map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

}
