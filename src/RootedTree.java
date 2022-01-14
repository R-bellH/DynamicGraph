import java.io.DataOutputStream;
import java.io.IOException;
public class RootedTree extends DynamicGraph {
    GraphNode root;
    Queue bfs_res;//added

    public RootedTree(){
        root=null;
    }
    public void printByLayer(DataOutputStream out) throws IOException {
        clean_nei_list(this.root);
        add_nei(this.root);
        bfs(this.root);
        GraphNode node = this.bfs_res.Dequeue();
        int oldie=node.d;
        while(node!=null){
            if(oldie!=node.d)
            {
                oldie=node.d;
                out.writeBytes("\n");
            }
            out.writeBytes(String.valueOf(node.getKey()));
            node=this.bfs_res.Dequeue();
            if(node!=null && oldie==node.d)
                out.writeBytes(",");
        }
    }
    public void preorderPrint(DataOutputStream out) throws IOException {
        preorder(out, this.root);
    }
    private void preorder(DataOutputStream out, GraphNode node) throws IOException {
        GraphNode child = node.leftChild;
        out.writeBytes(String.valueOf(node.getKey()));
        while (child!=null){
            out.writeBytes(",");
            clean_nei_list(child);
            child = child.rightSibling;
        }
    }
    public GraphNode insert(GraphNode node){
        GraphNode rootedNode = this.insertNode(node.getKey());
        node.linkedNode = rootedNode;
        rootedNode.linkedNode = node;
        return rootedNode;
    }


}
