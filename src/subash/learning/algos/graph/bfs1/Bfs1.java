package subash.learning.algos.graph.bfs1;

import java.util.*;

public class Bfs1 {

    class Node{
        int data;
        List<Node> adjacentNodes;
    }

    public void bfs1(Node node){
        Set<Node> seen = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node lastPushedItemInQueue = queue.poll();
           if(!seen.contains(lastPushedItemInQueue)){
               seen.add(lastPushedItemInQueue);
               System.out.println(lastPushedItemInQueue);
           }
           for(Node everyChild: lastPushedItemInQueue.adjacentNodes){
               if(!seen.contains(everyChild)){
                   queue.add(everyChild);
               }
           }
        }
    }
}
