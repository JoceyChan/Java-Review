public class Main {
    public static void main(String[] args){

    }
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    public class LinkedList{
        Node head;
        public LinkedList(int data){
            this.head = new Node(data);
        }
        public void insert(int data){
            if(this.head == null){
                this.head = new Node(data);
                return;
            }
            Node current = this.head;
            while(current != null){
                if(current.next == null){
                    current.next = new Node(data);
                    return;
                }
                current = current.next;
            }
        }
        public void delete(int data){
            if(this.head == null){
                return;
            }
            if(this.head != null){
              head = head.next;
              return;
            }
            Node current = this.head;
            while(current != null){
                if(current.data == data){
                    current = current.next;
                    return;
                }
            }
                return;
        }
        public boolean search(int data){
            Node current = this.head;
            if(current == null){
                return false;
            }
            while(current != null){
                if(current.data == data){
                    return true;
                    current = current.next;
                }
            }
            return false;
        }
        public void print(){
            Node current = this.head;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}