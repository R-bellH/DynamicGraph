public class GraphNode {
    LinkedList outNeighborsList;
    LinkedList inNeighborsList;
    int key;
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
