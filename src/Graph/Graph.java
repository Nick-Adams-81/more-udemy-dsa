package Graph;

import java.util.ArrayList;
import java.util.HashMap;


public class Graph {

    private HashMap<String, ArrayList<String>> list = new HashMap<>();

    public void printGraph() {
        System.out.println(list);
    }
    public boolean addVertex(String vertex) {
        if(list.get(vertex) == null) {
            list.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }
}
