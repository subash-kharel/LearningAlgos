package subash.learning.algos.graph.bfs;

import subash.learning.algos.graph.dfs.Vertex;

import java.util.ArrayList;
import java.util.List;

public class VertexBfs {
    private String name;
    private List<VertexBfs> adjacentChilds;

    public void addNeighbour(VertexBfs vertex){
        this.adjacentChilds.add(vertex);
    }

    public VertexBfs(String name){
        this.name = name;
        this.adjacentChilds = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<VertexBfs> getAdjacentChilds() {
        return adjacentChilds;
    }

    public void setAdjacentChilds(List<VertexBfs> adjacentChilds) {
        this.adjacentChilds = adjacentChilds;
    }

    @Override
    public String toString() {
        return name;
    }
}
