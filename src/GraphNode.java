public class GraphNode {
    LinkedList outNeighborsList;
    LinkedList inNeighborsList;
    int key;
    LinkedList.Link place;
    String color;
    GraphNode π;
    GraphNode linkedNode;
    int d;
    int f;
    GraphNode leftChild;
    GraphNode rightSibiling;

    public GraphNode(int k){
        outNeighborsList=new LinkedList();
        inNeighborsList = new LinkedList();
        key=k;
    }
    public

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
