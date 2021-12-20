public class GraphEdge {
    GraphNode from;
    GraphNode to;
    LinkedList.Link place;
    LinkedList.Link fromLink;
    LinkedList.Link toLink;

    public GraphEdge(GraphNode f, GraphNode t){
        from=f;
        to=t;
    }
}
