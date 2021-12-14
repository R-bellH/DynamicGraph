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

    public static LinkedList insert(LinkedList list, GraphNode graphNode)
    {
        Link new_link = new Link(graphNode);
        new_link.next=null;
        new_link.previous=null;
        if (list.head==null)
        {
            list.head=new_link;
        }
        else
        {
            Link last = list.head;
            while (last.next !=null){
                last=last.next;
            }
            last.next=new_link;
            new_link.previous=last;
        }
        return list;
    }

}