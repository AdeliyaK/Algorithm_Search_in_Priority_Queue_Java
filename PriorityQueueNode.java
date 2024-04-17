package Algorithm;

    class PriorityQueueNode<T> {
        T value;
        int priority;
        PriorityQueueNode<T> next;

        public PriorityQueueNode(T value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }