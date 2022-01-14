import java.io.DataOutputStream;
import java.io.IOException;
public class RootedTree extends DynamicGraph {
    GraphNode root;


    public RootedTree(){
        root=null;
    }
    public void printByLayer(DataOutputStream out) throws IOException {
        out.write(root.key);
        //use bfs
    }
    public GraphNode insert(GraphNode node){
        GraphNode rootedNode = this.insertNode(node.key);
        node.linkedNode = rootedNode;
        rootedNode.linkedNode = node;
        return rootedNode;
    }


}
