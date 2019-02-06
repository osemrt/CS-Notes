#include "functions.h"

/*
	Some linear data structures : array, linkedlist, queue, stack, ...
	Some Non-linear data structures : tree, graph, ...

	the components of a graph are nodes(vertices) and edge.

	in a tree, if there are N nodes, the tree has (N-1) edges.
	All nodes must be reachable from the root, and there must be
	exactly one possible path from root to a node but there are 
	no rules in a graph dictating the connection among the nodes.

	A tree is a special kind of graph.

	The mathematical definition of the graph:
	A graph G is an ordered pair of a set V of vertices and a set of edges.
	G(V,E)... ordered pair( (a,b)!=(b,a) if a!=b ), unordered pair( {a,b}={b,a} )
	
	for a directed edge = (start_vertex, end_vertex)
	for an undirected edge = {vertex1, vertex2}

	V = { v1, v2, v3, v4, v5, ... }
	E = { {v1, v2}, {v2, v3}, {v4, v5}, ... }

	|V| = the number of the vertices.
	|E| = the number of the edges.
		> 0<= |E| <= n*(n-1), for a directed graph.
		> 0<= |E| <= n*(n-1)/2, for an undirected graph.
		(assuming no self-loop or multiedge)

	dense  -> too many edges, it can be stored in an adjacency matrix.
	sparse -> too few edges, it can be stored in an adjacency list.

	unweighted graph : a weighted graph with all edges having weight = 1 unit.

	//no repetition
	path			 : a sequence of vertices where each adjacent pair is connected  
					   by an edge. (eg: <A,B,F,E>)
	simple path      : a path in which no vertices (and thus no edges) are repeated.

	//
	walk			 : a sequence of vertices where each adjacent pair is connected
					   by an edge. (eg: <A,B,F,E>)
	path (simple)    : a walk in which no vertices (and thus no edges) are repeated.
	trail            : a walk in which no edges are repeated.
	closed walk      : starts and ends at same vertex.
	simple cycle     : a closed walk with no repetition other than start and end.

	Some applications:
		> if you think the Facebook social network and you want to recommend 
		  a friend to any facebook user, you must solve this question is that 
		  find all nodes having the length of the shortest path (length = 2) 
		  from the person to a person.

		> World Wide Web can be represented with graphs.
		> Web-crawling is a graph traversal application.



*/

int main() {

	

	scanf("\n");
	return 0;
}