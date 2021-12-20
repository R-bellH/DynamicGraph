public class Queue {
    LinkedList list;
    LinkedList.Link tail;

    public static void Enqueue(Queue queue, GraphNode node){
        LinkedList.Link link = new LinkedList.Link(node);
        if (queue.tail !=null)
            LinkedList.insert_after(link,queue.tail);
        else
            queue.list.insert(link);
        queue.tail = link;
    }

    public static GraphNode Dequeue(Queue queue){
        if (queue.list.head == null)
             return null;
        GraphNode node= queue.list.head.graphNode;
        queue.list.delete(queue.list.head);
        if (queue.list.head == null)
            queue.tail =null;
        return node;

    }
}
