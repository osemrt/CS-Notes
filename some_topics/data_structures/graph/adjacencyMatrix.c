/*

		An adjacency matrix is a matrix composing of |V|*|V|.

		A[i][j] = { 1, if at least one edge from i to j.
				    0, otwerwise }

		in an adjacency matrix, while columns represent endpoint 
		of a node, rows represent start point of a node.

					
							     Adjacency Matrix (Unweighted)
					
							  0   1   2   3   4   5   6   7   8   9					  
		  Vertex			.___.___.___.___.___.___.___.___.___.___.				.___.___.___.___.___.___.
		   List			0	|_0_|_1_|_0_|_1_|_1_|_0_|_1_|_0_|_1_|_1_|			0	|_1_|_3_|_4_|_6_|_8_|_9_|___.
		  |-----|		1	|_1_|_0_|_1_|_1_|_1_|_1_|_0_|_0_|_1_|_0_|			1	|_0_|_2_|_2_|_3_|_4_|_5_|_8_|
	    0 |  A  |		2	|_1_|_0_|_0_|_0_|_0_|_1_|_1_|_1_|_1_|_0_|			2	|_0_|_5_|_6_|_7_|_8_|___.
	      |-----|		3	|_0_|_1_|_0_|_1_|_1_|_0_|_1_|_0_|_1_|_1_|			3	|_1_|_3_|_4_|_6_|_8_|_9_|
	    1 |  B  |		4	|_1_|_0_|_0_|_1_|_1_|_0_|_0_|_0_|_1_|_1_|	==> 	4	|_0_|_3_|_4_|_8_|_9_|__.
	      |-----|		5	|_0_|_0_|_1_|_1_|_1_|_0_|_1_|_1_|_0_|_1_|			5	|_2_|_3_|_4_|_6_|_7_|_9_|
	    2 |  C  |		6	|_0_|_1_|_1_|_1_|_0_|_1_|_0_|_0_|_0_|_1_|			6	|_1_|_2_|_3_|_5_|_9_|
	      |-----|		7	|_1_|_0_|_1_|_0_|_0_|_0_|_0_|_0_|_1_|_0_|			7	|_0_|_2_|_8_|___.
	    3 |  D  |		8	|_0_|_1_|_1_|_1_|_0_|_1_|_0_|_0_|_0_|_0_|			8	|_1_|_2_|_3_|_5_|
	      |-----|		9	|_1_|_0_|_0_|_0_|_0_|_0_|_0_|_0_|_0_|_0_|			9	|_0_|
	    4 |  E  |	
	      |-----|			     Adjacency Matrix (weighted)				space complexity = O(|E| + |V|) <<<< O(|V|*|V|)
	    5 |  F  |															---------------- 
	      |-----|			  0   1   2   3   4   5   6   7   8   9			time complexity
	    6 |  G  |			.___.___.___.___.___.___.___.___.___.___.		> finding adjacent nodes                    - O(|V|) + O(|V|) = O(|V|)
	      |-----|		0	|_x_|_4_|_x_|_9_|_x_|_x_|_7_|_x_|_5_|_x_|		> finding if two nodes are connected        - O(log2(n)) - (binary search)
	    7 |  H  |		1	|_1_|_4_|_6_|_x_|_x_|_x_|_x_|_4_|_6_|_x_|												    - O(|V|)     - (linear search)
		  |-----|		2	|_5_|_x_|_x_|_3_|_5_|_4_|_7_|_x_|_x_|_9_|
		8 |  G  |		3	|_4_|_x_|_9_|_x_|_x_|_4_|_x_|_5_|_9_|_x_|
		  |-----|		4	|_x_|_4_|_x_|_x_|_5_|_x_|_9_|_x_|_x_|_5_|
		9 |  H  |		5	|_9_|_8_|_9_|_4_|_x_|_7_|_5_|_x_|_9_|_x_|
	      |-----|		6	|_x_|_x_|_5_|_x_|_x_|_4_|_x_|_5_|_x_|_9_|
						7	|_9_|_9_|_x_|_7_|_x_|_x_|_5_|_x_|_x_|_x_|
						8	|_5_|_x_|_4_|_x_|_x_|_9_|_x_|_5_|_x_|_7_|
						9	|_9_|_x_|_9_|_x_|_x_|_7_|_5_|_x_|_x_|_x_|

														(x = INT_MAX)


					 space complexity = O(|V|*|V|) + O(|V|) = O(|V|*|V|)
					 ---------------
					 time complexity
						> finding adjacent nodes                    - O(|V|) + O(|V|) = O(|V|) - (if you don't know which vertice is in which index in the vertex list.)
						> finding if two nodes are connected        - O(|V|) + O(|V|) = O(|V|) - (if you don't know which vertice is in which index in the vertex list.)
					 		   									    - O(1)                     - (if you know the start point and the end point of a node.)


		! also you can decrease time complexity more with has table, etc.


		An example to compare these two structures can be like that:
		Let's find time and space complexities for a social network with a billion (10^9) users.
		Let's assume that a user in the social network can have at most 10,000 friends and a machine 
		that can scan only one cell in 10^-6 seconds will perform this task.

							 |				  |				  |
							 |	Structure-1   |	 Structure-2  |
		---------------------|----------------|---------------|--	
		finding adjacent 	 |  10^9 / 10^6	  |	 10^4 / 10^6  |
		nodes				 |	= 1000 secs	  |	 = 10^-2 secs |
		---------------------|----------------|---------------|--
	    finding if two 		 |	= 1 / 10^6 	  |	 = 10^-2 secs |
	    nodes are connected	 |				  |				  |
		 					 |				  |				  |


		


*/

struct node {
	int data;
	int weight;
	struct data* next;
};

/*
	for best optimization, you must sort the row after insertion.

*/
										
void adjacencyMatrix() {


	int* A[10];

	A[0] = malloc(sizeof(int) * 6);
	A[1] = malloc(sizeof(int) * 7);
	A[2] = malloc(sizeof(int) * 5);
	A[3] = malloc(sizeof(int) * 6);
	A[4] = malloc(sizeof(int) * 5);
	A[5] = malloc(sizeof(int) * 6);
	A[6] = malloc(sizeof(int) * 5);
	A[7] = malloc(sizeof(int) * 3);
	A[8] = malloc(sizeof(int) * 4);
	A[9] = malloc(sizeof(int) * 1);
	
	//or you can use a linked list or bst with a linked list.

	struct node* B[10];



}
