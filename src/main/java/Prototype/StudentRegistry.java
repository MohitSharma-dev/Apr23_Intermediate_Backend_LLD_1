package Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String , Student> map = new HashMap<>();

    public void register(String key, Student s){
        map.put(key, s);
    }

    public Student get(String key){
        return map.get(key).copy();
    }
}
