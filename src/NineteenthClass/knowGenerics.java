package NineteenthClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class knowGenerics {
    public static void main(String[] args) {
       List<String> strings = new ArrayList<>();
       
       strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers .add(2);
        integers .add(4);
        integers .add(5);

        Map<String,Integer> map = new HashMap<>();

        map.put("shamaratun", 19);
      Integer  saima= map.put("saima",18);
        Integer saima1 = map.put("saima",20);
        Integer saima2 = map.put("saima",22);

        System.out.println(saima);
        System.out.println(saima1);
        System.out.println(saima2);
    }
}
