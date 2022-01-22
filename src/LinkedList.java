public class LinkedList {
    Link head = null;

    static class Link{
        GraphNode graphNode=null;
        GraphEdge graphEdge=null;
        Link next;
        Link previous;

        Link(GraphNode k)
        {
            graphNode =k;
            next=null;
            previous=null;
        }
        Link(GraphEdge k)
        {
            graphEdge =k;
            next=null;
            previous=null;
        }

    }
    public int length(){
        if (head==null)
            return 0;
        int counter = 0;
        Link last= head;
        do
        {
            counter++;
            last=last.next;
        }while(last !=null);
        return counter;
    }

    public void insert(Link new_link) {
        new_link.next = head;
        head = new_link;
    }

    public void insert(GraphNode new_node){
        Link new_link = new Link(new_node);
        this.insert(new_link);
    }

    public void insert_after(Link new_link, Link prev_link){
        if(prev_link==null)
            this.insert(new_link);
        else{
            if (prev_link.next != null)
                prev_link.next.previous = new_link;
            new_link.next = prev_link.next;
            new_link.previous = prev_link;
            prev_link.next = new_link;
            if(new_link.next==null)
                this.tail=new_link;
        }

    }

    public void insert_after(GraphNode new_node, Link prev_link){
        Link new_link = new Link(new_node);
        insert_after(new_link, prev_link);
    }

    public void delete(Link link){
        if(link==null)
            return;
        if(link.previous != null)
            link.previous.next = link.next;
        else head = link.next;
        if(link.next != null)
            link.next.previous = link.previous;
        else
            tail=link.previous;
    }

}