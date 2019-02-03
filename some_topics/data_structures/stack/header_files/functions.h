#ifndef FUNCTIONS
#define FUNCTIONS

#include "header.h"

// Array Implementation.
void push(int x);
int pop();
int isEmpty();
void reset();

// Linked List Implementation.
void push_LS(struct node* x);
struct node* pop_LS();
int isEmpty_LS();

// Evaluate Postfix.
int evaluatePostfix(const char* expression);
int isDelimiter(const char c);
int isNumericDigit(const char c);
int isOperator(const char c);
void performOperation(const char operator);

// Infix To Postfix
char* infixToPostfix(const char* expression);
int isOperand(const char c);
int hasHigherPrecedence(const char operator1, const char operator2);
int getOperatorWeight(const char operator);
void concatenate(char* postfix, const char c);

// Others.
char* reverseString(char* s);
struct node* createLinkedListSL(int n);
void printLinkedList(const struct node* HEAD);
void reverseLinkedList(struct node** pointerToHEAD);
int isBalancedParentheses(const char* expression);




#endif // !FUNCTIONS
