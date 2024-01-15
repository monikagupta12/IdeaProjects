public class BrowserHistory {
    Node head;
    Node temp;

    public class Node {
        String url;
        Node next;
        Node prev;

        public Node(String url) {
            this.url = url;
            next = null;
            prev = null;
        }
    }

       public BrowserHistory(String homepage) {
        head = new Node(homepage);
        temp = head;

    }

    public void visit(String url) {

        Node newNode = new Node(url);
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        temp = newNode;
    }

    public String back(int steps) {
        while (steps != 0 && temp.prev != null) {
            temp = temp.prev;
            steps--;
        }
        return temp.url;
    }

    public String forward(int steps) {
        while (steps != 0 && temp.next != null) {
            temp = temp.next;
            steps--;
        }
        return temp.url;
    }

}
