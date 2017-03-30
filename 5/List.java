package hw31;

public class List {

    /**
     * Конструктор класса List.
     */
    public List() {
        first = new Node(0);
    }

    /**
     * Добавление элемента в список.
     * @param addingValue - добавляемоге значение.
     */
    public void addElement (int addingValue) {
        Node newElement = new Node(addingValue);
        newElement.next = first.next;
        first.next = newElement;
    }

    /**
     * Проверка пустоты списка.
     * @return true - если список пуст, иначе false.
     */
    public boolean isEmpty() {
        return first.next == null;
    }

    /**
     * Удаление элемента из списка по значению.
     * @param deletingValue - значение удаляемого элемента.
     */
    public void deleteElement(int deletingValue) throws ValueIsNotInTheListException {
        Node previousForDeleting = first;
        while ((previousForDeleting.next != null) && (previousForDeleting.next.value != deletingValue))
            previousForDeleting = previousForDeleting.next;
            if (previousForDeleting.next == null)
                throw new ValueIsNotInTheListException("Entered value is not in the list.");
        previousForDeleting.next = previousForDeleting.next.next;
    }

    /**
     * Вывод списка на консоль.
     */
    public void printList() {
        Node printing = first.next;
        while(printing != null) {
            System.out.print(printing.value + " ");
            printing = printing.next;
        }
        System.out.println();
    }

    /**
     * Удаление всех элементов из списка.
     */
    public void clearList() {
        first.next = null;
    }

    /**
     * Проверка наличия элемента с заданным значением в списке.
     * @param checkingValue - пароверяемое значение.
     * @return - true, - если присутствует в списке, false - в обратном случае.
     */
    public boolean isInList(int checkingValue) {
        Node previousForChecking = first;
        while((previousForChecking.next != null) && (previousForChecking.next.value != checkingValue))
            previousForChecking = previousForChecking.next;
        return previousForChecking.next != null;

    }
    
    private class Node {

        /**
        * Конструктор класса Node.
        * @param newValue - значение создаваемого объекта.
        */
        public Node(int newValue) {
            value = newValue;
            next = null;
        }

        private int value = 0;

        private Node next = null;

    }

    private Node first = null;
   
}
