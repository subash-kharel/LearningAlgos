package subash.learning.algos.graph.dfs;

public class Main {

    public static void main(String[] args) {
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        Vertex vertexF = new Vertex("F");
        Vertex vertexG = new Vertex("G");

        vertexA.addNeighbour(vertexB);
        vertexA.addNeighbour(vertexC);

        vertexB.addNeighbour(vertexD);
        vertexB.addNeighbour(vertexE);
        vertexE.addNeighbour(vertexF);
        vertexE.addNeighbour(vertexG);

        Dfs dfs = new Dfs();
        dfs.dfs1(vertexA);
       // dfs.dfs1(vertexB);
    }
}
