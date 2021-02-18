package subash.learning.algos.graph.dfs1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Dfs1 {

    class Node {
        int data;
        List<Node> adjacentNodes;
    }

    public void dfs1(Node node){
        Stack<Node> stack = new Stack<>();
        Set<Node> seen = new HashSet<>();
        stack.push(node);
        while(!stack.isEmpty()){
            Node lastPushedNode = stack.pop();
            if(!seen.contains(lastPushedNode)){
                seen.add(lastPushedNode);
                System.out.println(lastPushedNode);
            }
            for(Node adjNode: lastPushedNode.adjacentNodes){
                if(!seen.contains(adjNode)){
                    stack.push(adjNode);
                }
            }

        }

    }
}
