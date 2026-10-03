import java.util.HashMap;
import java.util.Map;
import java.util.zip.Inflater;

public class Main{
    public static void main(String[] args) {
        Map<String, Integer> clientIds = new HashMap<>();

        clientIds.put("Pasha", 101);
        clientIds.put("Artem", 202);
        clientIds.put("Kirill", 303);

        System.out.println(clientIds);

        Integer id1 = clientIds.get("Kirill");
        System.out.println(id1);

        System.out.println(clientIds.containsKey("Kirill"));
        System.out.println(clientIds.containsValue(303));
    }
}