import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> studentAge_hushMap = new HashMap<>();
        studentAge_hushMap.put("Jonas",17);
        studentAge_hushMap.put("Joey",18);
        studentAge_hushMap.put("Old Matt",23);

        System.out.println(studentAge_hushMap);

        Map<String,Integer> studentAge_linkedHushMap = new LinkedHashMap<>(studentAge_hushMap);
        studentAge_linkedHushMap.put("Jeremy",30);
        studentAge_linkedHushMap.put("Asa",21);

        System.out.println(studentAge_linkedHushMap);

        Map<String,Integer> studentAge_treeMap = new TreeMap<>(studentAge_linkedHushMap);
        System.out.println(studentAge_treeMap);

        System.out.println(((TreeMap<String, Integer>) studentAge_treeMap).ceilingKey("B"));
    }
}
