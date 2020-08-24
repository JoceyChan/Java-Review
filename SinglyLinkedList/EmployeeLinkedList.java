public class EmployeeLinkedList {
    private EmployeeNode head;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node; 
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