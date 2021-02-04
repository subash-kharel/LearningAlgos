package subash.learning.algos.graph.dfs;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Dfs {

    private Stack<Vertex> stack;

    public Dfs(){
        this.stack = new Stack<>();
    }

    public void dfs(Vertex root){
        stack.add(root);
        root.setVisited(true);
        while(!stack.isEmpty()){
            Vertex actualVertex = stack.pop();
            System.out.println(actualVertex + " ");
            for(Vertex vertex: actualVertex.getAdjacentChilds()){
                if(!vertex.isVisited()){
                    vertex.setVisited(true);
                    stack.push(vertex);
                }
            }
        }
    }

    public void dfs1(Vertex root){
     Stack<Vertex> vertexStack = new Stack<>();
     Set<Vertex> seenVertex = new HashSet<>();
     vertexStack.add(root);
     while(!vertexStack.isEmpty()){
         Vertex currentVertex = vertexStack.pop();
         if(!seenVertex.contains(currentVertex)){
             seenVertex.add(currentVertex);
             System.out.println(currentVertex);
         }
         for(Vertex vertex: currentVertex.getAdjacentChilds()){
             if(!seenVertex.contains(vertex)){
                 vertexStack.push(vertex);
             }
         }
     }
    }
}
