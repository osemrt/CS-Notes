#include "functions.h"

/*
	  Vertex			 Edge
	   List				 List
      |-----|	     |-----|-----|
      |  A  |		 |  A  |  B  |
      |-----|		 |-----|-----|
	  |  B  |		 |  A  |  C  |
	  |-----|		 |-----|-----|
	  |  C  |		 |  A  |  D  |
	  |-----|		 |-----|-----|
	  |  D  |		 |  B  |  E  |
	  |-----|		 |-----|-----|
	  |  E  |		 |  B  |  F  |
	  |-----|		 |-----|-----|
	  |  F  |		 |  C  |  G  |
	  |-----|		 |-----|-----|
	  |  G  |		 |  D  |  H  |
	  |-----|		 |-----|-----|
	  |  H  |		 |  E  |  H  |
	  |-----|		 |-----|-----|
					 |  F  |  H  |
					 |-----|-----|
					 |  G  |  H  |
					 |-----|-----|



*/


struct edge {
	char* startVertex;
	char* endVertex;
	int weight;
};

struct edge2 {
	int startVertex;
	int endVertex;
	int weight;
};


void adjacencyList() {

	char* vertexList[] = { "A", "B", "C", "D", "E", "F", "G", "H" };

	struct edge edgeList[] = { {.startVertex = "A",.endVertex = "B",.weight = 1},
							   {.startVertex = "A",.endVertex = "C",.weight = 1},
							   {.startVertex = "A",.endVertex = "D",.weight = 1},
							   {.startVertex = "B",.endVertex = "E",.weight = 1},
							   {.startVertex = "B",.endVertex = "F",.weight = 1},
							   {.startVertex = "C",.endVertex = "G",.weight = 1},
							   {.startVertex = "D",.endVertex = "H",.weight = 1},
							   {.startVertex = "E",.endVertex = "H",.weight = 1},
							   {.startVertex = "F",.endVertex = "H",.weight = 1},
							   {.startVertex = "G",.endVertex = "H",.weight = 1} 
	};

	//to decrease memory consumption, think long strings.
	struct edge edgeListAdv[] = { {.startVertex = vertexList[0],.endVertex = vertexList[1],.weight = 1},
								  {.startVertex = vertexList[0],.endVertex = vertexList[2],.weight = 1},
								  {.startVertex = vertexList[0],.endVertex = vertexList[3],.weight = 1},
								  {.startVertex = vertexList[1],.endVertex = vertexList[4],.weight = 1},
								  {.startVertex = vertexList[1],.endVertex = vertexList[5],.weight = 1},
								  {.startVertex = vertexList[2],.endVertex = vertexList[6],.weight = 1},
								  {.startVertex = vertexList[3],.endVertex = vertexList[7],.weight = 1},
								  {.startVertex = vertexList[4],.endVertex = vertexList[7],.weight = 1},
								  {.startVertex = vertexList[5],.endVertex = vertexList[7],.weight = 1},
								  {.startVertex = vertexList[6],.endVertex = vertexList[7],.weight = 1},

	};

	/*

		space complexity = O(|V|) + O(|E|) = O(|V| + |E|)

		time complexity
		---------------
		finding adjacent nodes                    - O(|E|)
		check if given nodes are connected or not - O(|E|)

		O(|E|) or O(|v|*|v|) is costly! (0<=|E|<=n*(n-1), if a graph is directed graph.)


	*/
	struct edge2 edgeListAdv2[] = { {.startVertex = 0,.endVertex = 1 ,.weight = 1},
								    {.startVertex = 0,.endVertex = 2 ,.weight = 1},
								    {.startVertex = 0,.endVertex = 3 ,.weight = 1},
								    {.startVertex = 1,.endVertex = 4 ,.weight = 1},
								    {.startVertex = 1,.endVertex = 5 ,.weight = 1},
								    {.startVertex = 2,.endVertex = 5 ,.weight = 1},
								    {.startVertex = 3,.endVertex = 6 ,.weight = 1},
								    {.startVertex = 4,.endVertex = 7 ,.weight = 1},
								    {.startVertex = 5,.endVertex = 7 ,.weight = 1},
								    {.startVertex = 6,.endVertex = 7 ,.weight = 1}, 
	};
									 
};									 
