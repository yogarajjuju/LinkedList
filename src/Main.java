public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(11);


        list.insertLast(20);
        list.insert(10,3);
        list.display();
//        System.out.println(list.deletefirst());
//        System.out.println(list.deletelast());
        System.out.println(list.delete(2));
        list.display();




    }
}
