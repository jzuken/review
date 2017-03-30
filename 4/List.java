package список;

public class List {

    public void printList() {
        if (this.link != null) {
            Node pNode = this.link;
            while (pNode != null) {
                System.out.print(pNode.value + " ");
                pNode = pNode.next;
            }
        } else {
            System.out.println("\nсписок пуст\n");
        }
    }

    public void addValue(int value) {
        if (this.link == null) {
            Node node = new Node();
            node.value = value;
            this.link = node;
        } else {
            Node pNode = this.link;
            while (pNode.next != null) {
                pNode = pNode.next;
            }
            Node tNode = new Node();
            tNode.value = value;
            pNode.next = tNode;
        }
    }

    public void deleteValue(int ext) {
        Node list = this.link;

        if (list.next == null) {
            System.out.print("список пуст\n");
            return;
        }
        while (list.next != null) {
            if (list.next.value == ext) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }
    }

    public int getFirstElement() {
        return link.value;
    }

    public int getSecondElement() {
        return link.next.value;
    }

    public int getNextElement() {
        return link.next.next.value;
    }

    private Node link;

    private class Node {

        private int value;
        private Node next;
    }
}

