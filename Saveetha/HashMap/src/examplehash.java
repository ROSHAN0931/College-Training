import java.util.HashMap;
import java.util.Map;

public class examplehash {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Roshan");
        map.put(2,"chennai");
        map.put(3,"saveetha");
        for (Integer key : map.keySet()){
            System.out.println(key + "->" + map.get(key));
        }
        for (HashMap.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}