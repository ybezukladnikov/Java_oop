public class LinkedList {

    Node head;
    Node tail;

    public Node Find(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next;

        }
        return null;
    }

    public void addToEnd(int value){
        Node newNode = new Node();
        newNode.value = value;
        if(head == null){
            head = newNode;
            tail = newNode;

        }
        else{
            tail.next = newNode;
            newNode.presious = tail;
            tail = newNode;
        }

    }

    public void addToHead(int value){
        Node newNode = new Node();
        newNode.value = value;
        if(head == null){
            head = newNode;
            tail =newNode;
        }
        else {
            head.presious = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void addToMidle(int value, Node node){

    }



    public void print(){
        Node currentNode = head;
        if (currentNode == null){
            System.out.println(-1);
        }
        else {
            while (currentNode != null){
                System.out.print(currentNode.value + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }

    }


    public static class Node {
        int value;
        Node next;
        Node presious;
    }
}


