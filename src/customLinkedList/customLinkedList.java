package customLinkedList;
import java.util.NoSuchElementException;

public class customLinkedList<T> {
        private Node head;
        private Node tail;
        private int size;

        public  customLinkedList(){
            head = null;
            tail = null;
            size = 0;
        }
        public  void addFirst(T s){
            if(head == null&&tail == null){
                Node newNode = new Node();
                newNode.value = s;
                head = newNode;
                tail = newNode;
                size++;
            }else {
                Node newNode = new Node();
                newNode.value = s;
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
                size++;
            }

        }
        public  void addLast(T s){
            if(head == null&&tail == null){
                Node newNode = new Node();
                newNode.value = s;
                head = newNode;
                tail = newNode;
                size++;
            }else {
                Node newNode = new Node();
                newNode.value = s;
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
                size++;
            }

        }

        public  boolean  contains(T s){
            Node el = head;
            while(el!=null){
                if(el.value==s){
                    return true;
                }
                el = el.next;
            }
            return false;
        }
        public  T get(int index){
            int count = 0;
            if(index>=size){
                throw new IndexOutOfBoundsException();
            }
            Node current = head;
            while (current !=null){
                if(count==index){
                    return current.value;
                }else {
                    current = current.next;
                    count++;
                }
            }
            throw new NoSuchElementException();
        }

        public T popLast() {
            Node result = tail;
            tail = tail.prev;
            size--;
            return result.value;
        }
        public T popFitst() {
            Node result = head;
            head = head.next;
            size--;
            return  result.value;
        }

        public T getLast() {
            return tail.value;
        }
        public T getFitst() {
            return head.value;
        }
        public T remove(int index){
            int count = 0;
            if(index>=size){
                throw new IndexOutOfBoundsException();

            }
            Node current = head;
            while (current !=null){
                if(count==index){
                    if(current.next == null){
                        current.prev.next =null;
                        tail = current.prev;
                    }else if(current.prev !=null){
                        current.prev.next = current.next;
                    }else {

                    }

                    if(current.prev ==null){
                        current.next.prev =null;
                        head = current.next;
                    }else if(current.next !=null){
                        current.next.prev =current.prev;
                    }
                    return current.value;
                }else {
                    current = current.next;
                    count++;
                }
            }
            throw new NoSuchElementException();
        }
        public boolean  remove(T  s){
            Node current = head;
            while(current!=null){
                if(current.value == s ){
                    if(current.next == null){
                        current.prev.next =null;
                        tail = current.prev;
                    }else if(current.prev !=null){
                        current.prev.next = current.next;
                    }else {

                    }

                    if(current.prev ==null){
                        current.next.prev =null;
                        head = current.next;
                    }else if(current.next !=null){
                        current.next.prev =current.prev;
                    }

                    return true;
                }
                current = current.next;
            }
            return false;
        }
        public int size(){
            return size;
        }
        public  void printList() {
            Node el = head;
            while(el!=null){
                System.out.println(el.value);
                el = el.next;
            }
        }
        private  class  Node {
            T value;
            Node next;
            Node prev;
        }
}
