#include "functions.h"

/***********************************************************************************************
   Stack Abstract Data Type
  --------------------------
   A list with the restriction that insertion and deletion can be performed only from one end, 
   called the top. (Last-In First-Out) 

   We can implement stacks using Arrays or Linked Lists.
  ---------------------------------------------------------------------------------------------
   Applications					   || Operations        
  ---------------------------  	   || ----------        
   Function Calls / Recursion	   || push(), pop(),    
   undo operation in any editor	   || top(),            
   balanced parentheses, ...	   || isEmpty(), ...    
***********************************************************************************************/

int main() {


	struct node* HEAD = createLinkedListSL(10);
	printLinkedList(HEAD);

	reverseLinkedList(&HEAD);
	printLinkedList(HEAD);
	

	printf("%s : %d\n", "{}()[]", isBalancedParentheses("{}()[]"));
	printf("%s : %d\n", "{(})[]", isBalancedParentheses("{(})[]"));
	printf("%s : %d\n", "{()[]}", isBalancedParentheses("{()[]}"));
	printf("%s : %d\n", "{()}[]", isBalancedParentheses("{()}[]"));
	printf("%s : %d\n", "(sad{123}(sad{asd})[])", isBalancedParentheses("(sad{123}(sad{asd})[])"));

	printf("%d\n", evaluatePostfix("5 3 + 6 2 / * 3 5 * + "));
	printf("%d\n", evaluatePostfix("2 3 * 5 4 * + 9 -"));

	printf("%s\n", infixToPostfix("A + B * C - D * E"));
	printf("%s\n", infixToPostfix("((A+B)^C-D)*E"));
	printf("%s\n", infixToPostfix("((A+B)^(C-D)*E)"));
	printf("%s\n", infixToPostfix("A^B+C+D^(E^F)"));
	printf("%s\n", infixToPostfix("A^B^C^D"));


	scanf("\n");
	return 0;
}