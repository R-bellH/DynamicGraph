public class LinkedList {
    Link head = null;

    static class Link{
        GraphNode graphNode;
        Link next;
        Link previous;

        Link(GraphNode k)
        {
            graphNode =k;
            next=null;
            previous=null;
        }

    }
    public int length(){
        if (head==null)
            return 0;
        int counter = 1;
        Link last= head;
        while (last.next !=null)
        {
            counter++;
        }
        return counter;
    }

    public static void insert(LinkedList list, Link new_link) {
        new_link.next = list.head;
        list.head = new_link;
    }

    public void insert(GraphNode new_node){
        Link new_link = new Link(new_node);
        this.insert(new_link);
    }

    public static void insert_after(Link new_link, Link prev_link){
        if (prev_link.next != null)
            prev_link.next.previous = new_link;
        new_link.next = prev_link.next;
        new_link.previous = prev_link;
        prev_link.next = new_link;
    }

    public static void insert_after(GraphNode new_node, Link prev_link){
        Link new_link = new Link(new_node);
        insert_after(new_link, prev_link);
    }

    public void delete(Link link){
        if(link.previous != null)
            link.previous.next = link.next;
        else head = link.next;
        if(link.next != null)
            link.next.previous = link.previous;
    }

}