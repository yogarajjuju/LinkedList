public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size=0;
    }

    //INSERTION OF NODES
    // to insert a new node in head I.E INSERT A NODE @ FIRST
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;

        }
        size+=1;
    }// Insert a node at a give of particular position
    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        } if(index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        Node node = new Node(temp.next, value);

        temp.next=node;
        size++;
    }

// Insert a node at the last / tail position
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next=node;
        tail=node;

        size++;
    }

    //Insertion using recursion
    // insert using recursion
    // helper
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(node, val);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }



















    //DELETION OF NODES

    // Delete a node at first
    public int deletefirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }


    // Deletion of last node


    public int deletelast(){
        if(size<=1){
            return deletefirst();
        }
        Node secondLast=get(size-2);
        int val = tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }
    // Delete a particular index node

    public int delete(int index){
        if(index==0){
            return deletefirst();
        } if(index==size-1){
            return deletelast();

        }
        Node prev=get(index-1);
        int val = prev.next.value;
        prev.next=prev.next.next;
        return val;
    }

    // To find a node in the list
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    //To remove duplicates
    public void duplicates(){

        Node node =head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            } else{
                node=node.next;
            }

        }
        tail=node;
        tail.next=null;

    }
    // merge two sorted list

    public static LL  merge(LL first, LL second){
       Node f=first.head;
       Node s= second.head;
       LL ans = new LL();

       while(f!=null&& s!=null){
           if(f.value<s.value){
               ans.insertLast(f.value);
               f=f.next;
           } else {
               ans.insertLast(s.value);
               s=s.next;
           }
       }




       while(f!=null){
           ans.insertLast(f.value);
           f=f.next;

       } while (s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }
       return ans;

    }










    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2=new LL();

        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);

        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(4);
        list2.insertLast(9);
        list2.insertLast(14);


//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.display();
//        list.duplicates();
//        list.display();
        list1.display();
        list2.display();
        LL ans = LL.merge(list1,list2);
        ans.display();







    }













    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node =node.next;

        }
        return node;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }
}
