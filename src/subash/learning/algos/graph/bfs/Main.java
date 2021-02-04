package subash.learning.algos.graph.bfs;

import subash.learning.algos.graph.dfs.Dfs;
import subash.learning.algos.graph.dfs.Vertex;

public class Main {

    public static void main(String[] args) {
        VertexBfs vertexA = new VertexBfs("A");
        VertexBfs vertexB = new VertexBfs("B");
        VertexBfs vertexC = new VertexBfs("C");
        VertexBfs vertexD = new VertexBfs("D");
        VertexBfs vertexE = new VertexBfs("E");
        VertexBfs vertexF = new VertexBfs("F");
        VertexBfs vertexG = new VertexBfs("G");

        vertexA.addNeighbour(vertexB);
        vertexA.addNeighbour(vertexC);

        vertexB.addNeighbour(vertexD);
        vertexB.addNeighbour(vertexE);
        vertexE.addNeighbour(vertexF);
        vertexE.addNeighbour(vertexG);

        Bfs bfs = new Bfs();
        bfs.bfs(vertexA);
        // dfs.dfs1(vertexB);
    }
}
