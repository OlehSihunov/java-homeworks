package homework4.customLinkedList;


public class Homework4 {

    public static void main(String[] args) {


        customLinkedList<String> list  = new customLinkedList<String>();
        list.addLast("Hello");
        list.addLast("World");
        list.addLast("From");
        list.printList();
        System.out.println(list.get(1));
        System.out.println(list.contains("World"));
        list.remove("World");
        list.addFirst("Java");
        try {
            list.remove(6);
        }
        catch (Exception e){
            System.out.println(e);
        }

        list.printList();
    }

}



