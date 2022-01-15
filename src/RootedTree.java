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
        LinkedList new_nodes = new LinkedList();
        add_nodes(this.root,new_nodes);
        this.GraphNodes=new_nodes;
        RootedTree tree = bfs(this.root);
        GraphNode node = tree.bfs_res.Dequeue();
        int oldie=node.d;
        while(node!=null){
            if(oldie!=node.d)
            {
                oldie=node.d;
                out.writeBytes("\n");
            }
            out.writeBytes(String.valueOf(node.getKey()));
            node=tree.bfs_res.Dequeue();
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
            preorder(out, child);
            child = child.rightSibling;
        }
    }
    public GraphNode insert(GraphNode node){
        GraphNode rootedNode = this.insertNode(node.getKey());
        node.linkedNode = rootedNode;
        rootedNode.linkedNode = node;
        return rootedNode;
    }
    public void add_nei(GraphNode node){
        GraphNode child = node.leftChild;
        while (child!=null){
            node.outNeighborsList.insert(child);
            child.inNeighborsList.insert(node);
            add_nei(child);
            child = child.rightSibling;
        }
    }
    public void clean_nei_list(GraphNode node){
        GraphNode child = node.leftChild;
        node.inNeighborsList.head = null;
        node.inNeighborsList.tail = null;
        node.outNeighborsList.head = null;
        node.outNeighborsList.tail = null;
        while (child!=null){
            clean_nei_list(child);
            child = child.rightSibling;
        }
    }
    public void add_nodes(GraphNode node, LinkedList graphnodes){
        GraphNode child = node.leftChild;
        graphnodes.insert(node);
        while (child!=null){
            add_nodes(child, graphnodes);
            child = child.rightSibling;
        }
    }

}
