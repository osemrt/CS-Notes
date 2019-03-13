#ifndef FUNCTIONS
#define FUNCTIONS

#include "header.h"

//stack functions

void clearStack(struct STACK* stack);
int isFull(struct STACK* stack);
int isEmpty(struct STACK* stack);
int push(struct STACK* stack, int data);
int pop(struct STACK* stack, int* data);
int peek(struct STACK* stack, int* data);
void printStack(struct STACK* stack);

//evaluate
int evaluate(struct STACK* operatorStack, struct STACK* operandStack, const char* expression);
void check(int returnedValue);
int isDelimiter(const char c);
int isOpenBracket(const char c);
int isClosedBracket(const char c);
int isOperator(const char c);
int isOperand(const char c);
int calculate(const char sign, const int operand1, const int operand2);
int getOperatorPrecedence(const char sign);

//others
char* getExpressionFromUser();

#endif // !FUNCTIONS
