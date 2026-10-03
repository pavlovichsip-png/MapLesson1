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

        clientIds.put("Pasha", 404);
        clientIds.replace("Kirill", 505);
        clientIds.putIfAbsent("Vasya", 606);

        System.out.println(clientIds);

        clientIds.remove("Pasha", 404); //optional value
        System.out.println(clientIds);
    }
}