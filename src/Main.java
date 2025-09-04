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
        System.out.println(list.find(20));
        list.display();

//       DLL  list = new DLL();
//        list.insertfirst(3);
//        list.insertfirst(5);
//        list.insertfirst(8);
//        list.insertfirst(11);
//
//        list.insertLast(33);
//        list.display();
//        list.insert(11,20);
//        list.display();

//       CLL list = new CLL();
//       list.insert(20);
//       list.insert(50);
//       list.insert(60);
//       list.insert(40);
//       list.display();
//       list.delete(50);
//        list.display();

        list.insertRec(5,3);
        list.display();






    }
}
