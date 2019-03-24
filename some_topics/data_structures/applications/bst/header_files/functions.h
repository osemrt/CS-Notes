#ifndef FUNCTIONS
#define FUNCTIONS

#include "header.h"

NODE* createNode(int data);
void insertNode1(const NODE** pointerToRoot, int data);
NODE* insertNode2(NODE* root, int data);
void printTree(const NODE* root);
void print2D(const NODE* root, int space);
int search(const NODE* root, const int data);

NODE* findNode(const NODE** pointerToRoot, const int data);
NODE* findMin(const NODE** pointerToRoot);
NODE* findMax(const NODE** pointerToRoot);
int findHeight(const NODE* root);
void depthFirstSearch(const NODE* root, int mode);
int isBalancedTree(const NODE* root);


#endif // !FUNCTIONS
