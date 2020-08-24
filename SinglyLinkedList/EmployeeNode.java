package SinglyLinkedList;

public class EmployeeNode { // this is like class Node{}
    private Employee employee; 
    private EmployeeNode next;

    public EmployeeNode(Employee employee){
        this.employee = employee;
    }
    public Employee getEmployee(){
        return employee;
    }
    public void setEmployee(Employee employee){
        this.employee = employee;
    }
    public EmployeeNode getNext(){
        return next;
    }
    public void setNext(EmployeeNode next){
        this.next = next;
    }
}