public class DynamicGraph {
    LinkedList Edges;
    LinkedList GraphNodes;

    public DynamicGraph(){
        Edges=new LinkedList();
        GraphNodes = new LinkedList();
    }

    public GraphNode insertNode(int nodeKey){
        GraphNode new_node = new GraphNode(nodeKey);
        LinkedList.Link new_link = new LinkedList.Link(new_node);
        new_node.place = new_link;
        GraphNodes.insert(new_link);
        return new_node;
    }
    public void deleteNode(GraphNode node){
        if((node.inNeighborsList != null) || (node.outNeighborsList != null))
            return;
        GraphNodes.delete(node.place);
    }
    public GraphEdge insertEdge(GraphNode from, GraphNode to) {

        GraphEdge new_edge = new GraphEdge(from, to);
        LinkedList.Link place_link = new LinkedList.Link(new_edge);
        LinkedList.Link in_link = new LinkedList.Link(from);
        LinkedList.Link out_link = new LinkedList.Link(to);
        new_edge.place=place_link;
        new_edge.fromLink=in_link;
        from.outNeighborsList.insert(out_link);
        new_edge.toLink=out_link;
        to.inNeighborsList.insert(in_link);
        Edges.insert(place_link);
        return  new_edge;
    }
    public void deleteEdge(GraphEdge edge){
        edge.from.outNeighborsList.delete(edge.toLink);
        edge.to.inNeighborsList.delete(edge.fromLink);
        Edges.delete(edge.place);
    }

    public RootedTree scc(){
        int temp = 0;
    }
}

