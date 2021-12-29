public class GraphNode {
    LinkedList outNeighborsList;
    LinkedList inNeighborsList;
    int key;
    LinkedList.Link place;
    String color;
    GraphNode π;
    int d;
    int f;

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
