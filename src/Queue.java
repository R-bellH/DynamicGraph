public class Queue {
    LinkedList list;
    LinkedList.Link tail;

    public static void Enqueue(Queue queue, GraphNode node){
        LinkedList link = new LinkedList();
        LinkedList.insert(link, node);
        if (queue.tail !=null)
            LinkedList.insert_after(queue.list,link,queue.tail);
        else
            LinkedList.insert(queue.list,link);
        queue.tail = link;


    }
    public static GraphNode Dequeue(Queue queue){
        if (queue.list.head == null)
            return "error";
        GraphNode node= queue.list.head.graphNode;
        LinkedList_Delete(queue.list,queue.list.head);
        if (queue.list.head == null)
            queue.tail =null;
        return node;

    }
}
