package Algorithm;


public class PriorityQueue<T> {
    private PriorityQueueNode<T> head;

    public PriorityQueue() { head = null;   }

    public void insert(T value, int priority) {
        PriorityQueueNode<T> newNode = new PriorityQueueNode<>(value, priority);

        if (head == null || priority < head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            PriorityQueueNode<T> current = head;
            while (current.next != null && current.next.priority <= priority) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public T extractMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }

        T minValue = head.value;
        head = head.next;
        return minValue;
    }

    public int SearchByValueAndReturnPriority(T value){
        if (isEmpty())
            throw new IllegalStateException("Priority queue is empty");
        int n;
        for(PriorityQueueNode<T> help=head;help!=null;help=help.next)
            if(help.value.equals(value))
                return help.priority;
        return -1;
    }

    public T SearchByPriorityAndReturnValue(int prior){
        if (isEmpty())
            throw new IllegalStateException("Priority queue is empty");
        for(PriorityQueueNode<T> help=head;help!=null;help=help.next)
            if(help.priority==prior)
                return help.value;
        return null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print(){
        int i=1;
        for(PriorityQueueNode<T> help=head;help!=null;help=help.next, i++)
            System.out.println(i + " element: \"" + help.value.toString() + "\" with priority: " + help.priority);
    }

}