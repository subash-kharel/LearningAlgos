package subash.learning.algos.graph.dfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean isVisited;
    private List<Vertex> adjacentChilds;
    private Vertex previousVertex;

    public Vertex(String name){
        this.name = name;
        this.adjacentChilds = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex){
        this.adjacentChilds.add(vertex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public List<Vertex> getAdjacentChilds() {
        return adjacentChilds;
    }

    public void setAdjacentChilds(List<Vertex> adjacentChilds) {
        this.adjacentChilds = adjacentChilds;
    }

    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
