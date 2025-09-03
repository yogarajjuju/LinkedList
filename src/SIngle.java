import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class SIngle {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        //insert
        list.addFirst(20);
        list.add(25);
        list.add(30);
        list.add(50);
        list.addLast(60);
        list.add(null);
        System.out.println("Insert");
        System.out.print(list);
        System.out.println();
        list.add(2,35);
        System.out.println("Insert at a index");
        System.out.print(list);
        // Same for get and delete the nodes

    }
}
