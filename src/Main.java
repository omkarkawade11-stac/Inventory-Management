import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<String> pl=new ArrayList<>();
        pl.add("laptop");
        pl.add("mouse");
        pl.add("keybord");

        Set<String> cat=new HashSet<>();
        cat.add("Electronics");
        cat.add("Accessories");
        cat.add("Electronics");

        Map<String,Integer> map=new HashMap<>();
        map.put("Laptop",10);
        map.put("Mouse",50);
        map.put("Keyboard",20);

        System.out.println("Products: " + pl);
        System.out.println("Categories: " + cat);
        System.out.println("Stock Details:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}