#ifndef FUNCTIONS
#define FUNCTIONS

#include "header.h"

//binarySearchTree
void insert(NODE** pointerToRoot, int data);
int search(const NODE* pointerToRoot, int data);
NODE* getNewNode(int data);
int findMinValue(const NODE* root);
int findMaxValue(const NODE* root);

//queue
void enQueue(int x);
void deQueue();
int getFront();
void printQueue();
int isFull();
int isEmpty();

//isBinarySearchTree_S1
int isBinarySearchTree_S1(const NODE* root);
int isSubtreeLesser(const NODE* root, int value);
int isSubtreeGreater(const NODE* root, int value);

//depthFirst
void depthFirst(const NODE* root, int mode);

//breadthFirst
void breadthFirstTraversal(const NODE* root);


//findHeight
int findHeight(const NODE* root);

//successorAndPredecessor
NODE* findSuccessor(const NODE* root, int data);
NODE* getAddress(const NODE* root, int data);
NODE* findMin(const NODE* root);
NODE* findPredecessor(const NODE* root, int data);
NODE* findMax(const NODE* root);

//deleteNode
void deleteNode(NODE** pointerToRoot, int data);
NODE* deleteNode2(NODE* root, int data);

//arrayImplementation
void insertArray(int data, int index);
void printArray();

//binaryTree




#endif // !FUNCTIONS
