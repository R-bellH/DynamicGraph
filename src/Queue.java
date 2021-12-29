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

    public GraphNode Dequeue(){
        if (this.list.head == null)
             return null;
        GraphNode node= this.list.head.graphNode;
        this.list.delete(this.list.head);
        if (this.list.head == null)
            this.tail =null;
        return node;

    }
}
