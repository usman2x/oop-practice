package practice.runner;

import practice.model.MyNode;

public class NodeRunner {
    public static void main(String[] args) {
        MyNode myNode = new MyNode(5);
        insertNode(myNode, 6);
        insertNode(myNode, 8);
        insertNode(myNode, 9);
        insertNode(myNode, 0);
        insertNode(myNode, 11);
        insertNode(myNode, 11);
        insertNode(myNode, 12);
        insertNode(myNode, 13);
        System.out.println("List Before Delete");
        displayNodeList(myNode);
        int toDelete = 5;
        System.out.printf("Deleting %d from Above List", toDelete);
        System.out.println();
        myNode = delete(myNode, toDelete);
        System.out.println("List After Delete");
        displayNodeList(myNode);

//        boolean isFound = find(myNode, 12);
//        if (isFound) {
//            System.out.println("Found");
//        } else {
//            System.out.println("Not Found");
//        }
//        System.out.println(findMiddle(myNode));
    }

    public static MyNode insertNode(MyNode head, int data) {
        MyNode newNode = new MyNode(data);
        if (head == null) {
            head = newNode;
        } else if (head.next == null) {
            head.next = newNode;
        } else {
            MyNode start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = newNode;
        }
        return head;
    }

    public static boolean find(MyNode head, int toFind) {
        MyNode start = head;
        boolean found = false;
        while (start != null) {
            if (start.data == toFind) {
                found = true;
            }
            start = start.next;
        }
        return found;
    }

    public static int findMiddle(MyNode head) {
        MyNode start = head;
        MyNode lateStart = head;
        int counter = 0;
        while (start.next != null) {
            start = start.next;
            if (counter % 2 == 0) {
                lateStart = lateStart.next;
            }
            counter++;
        }
        return lateStart.data;
    }

    public static MyNode delete(MyNode head, int toDelete) {
        MyNode start = head;
        MyNode prev = head;
        while (start != null) {
            if (start.data == toDelete) {
                if (start == head) {
                    start = start.next;
                    head = start;
                } else {
                    prev.next = start.next;
                    start = prev.next;
                }
            } else {
                prev = start;
                start = start.next;
            }
        }
        return head;
    }

    public static void displayNodeList(MyNode head) {
        MyNode start = head;
        while (start != null) {
            System.out.printf("%d ", start.data);
            start = start.next;
        }
        System.out.println();
    }
}
