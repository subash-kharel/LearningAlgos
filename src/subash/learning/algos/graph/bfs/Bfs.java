package subash.learning.algos.graph.bfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Bfs {
    Queue<VertexBfs> vertexBfsQueue;
    public Bfs(){
        this.vertexBfsQueue = new LinkedList<>();
    }

    public void bfs(VertexBfs vertexBfs){
        Set<VertexBfs> seen = new HashSet<>();
        vertexBfsQueue.add(vertexBfs);

        while(!vertexBfsQueue.isEmpty()){
            VertexBfs currentVertex = vertexBfsQueue.poll();
            if(!seen.contains(currentVertex)){
                seen.add(currentVertex);
                System.out.println(currentVertex);
            }

            for(VertexBfs vertexChild: currentVertex.getAdjacentChilds()){
                if(!seen.contains(vertexChild)){
                    vertexBfsQueue.add(vertexChild);
                }
            }
        }
    }
}
