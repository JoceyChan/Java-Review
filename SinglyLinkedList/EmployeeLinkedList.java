public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size; //variable to keep count

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node; 
        size++; //increments and counts
    }
    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void print(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null){
            System.out.println(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}