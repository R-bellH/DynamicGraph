public class GraphNode {
    LinkedList outNeighborsList;
    LinkedList inNeighborsList;
    LinkedList rootedOutList;
    private final int key;
    LinkedList.Link place;
    String color;
    GraphNode π;
    GraphNode linkedNode;
    int d;
    int f;
    GraphNode leftChild;
    GraphNode rightSibling;

    public GraphNode(int k){
        outNeighborsList=new LinkedList();
        inNeighborsList = new LinkedList();
        key=k;
    }
    public int getOutDegree(){
        return (outNeighborsList.length());
    }
    public int getInDegree(){
        return (inNeighborsList.length());
    }
    public int getKey(){
        return key;
    }



}
