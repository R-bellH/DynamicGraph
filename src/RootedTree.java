import java.io.DataOutputStream;
import java.io.IOException;
public class RootedTree {
    GraphNode root;


    public RootedTree(){
        root=null;
    }
    public void printByLayer(DataOutputStream out) throws IOException {
        out.write(root.key);
        //use bfs


    }

}
