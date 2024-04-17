package Algorithm;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>();
        q.insert("First String",3);
        q.insert("Second String",1);
        q.insert("Third String",1);
        q.print();
    }
}
