public class RootedTreeNode {
    GraphNode node;
    GraphNode π;
    int d;
    int f;
    LinkedList GraphNodes;

    String color;
    public GraphNode insertNode(int nodeKey){
        GraphNode new_node = new GraphNode(nodeKey);
        LinkedList.Link new_link = new LinkedList.Link(new_node);
        new_node.place = new_link;
        GraphNodes.insert(new_link);
        return new_node;
    }

    public RootedTreeNode(GraphNode graphNode) {
        node=graphNode;
        LinkedList.Link new_link = new LinkedList.Link(node);
        node.place = new_link;
        GraphNodes.insert(new_link);
    }
}
