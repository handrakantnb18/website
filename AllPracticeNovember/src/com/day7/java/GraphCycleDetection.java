package com.day7.java;

import java.util.*;

// Write a Java program to detect a cycle in a directed graph using DFS

public class GraphCycleDetection {

	public static boolean hasCycle(List<List<Integer>> adjList, boolean[] visited, boolean[] stack, int node) {
		if (stack[node])
			return true;
		if (visited[node])
			return false;
		visited[node] = true;
		stack[node] = true;

		for (int neighbor : adjList.get(node)) {
			if (hasCycle(adjList, visited, stack, neighbor))
				return true;
		}

		stack[node] = false;
		return false;
	}

	public static void main(String[] args) {
		
		int vertices = 4;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) adjList.add(new ArrayList<>());
        adjList.get(0).add(1);
        adjList.get(1).add(2);
        adjList.get(2).add(0);
        adjList.get(2).add(3);

        boolean[] visited = new boolean[vertices];
        boolean[] stack = new boolean[vertices];
        boolean cycle = false;

        for (int i = 0; i < vertices; i++) {
            if (!visited[i] && hasCycle(adjList, visited, stack, i)) {
                cycle = true;
                break;
            }
        }

        System.out.println("Cycle detected: " + cycle);
        
	}
}
