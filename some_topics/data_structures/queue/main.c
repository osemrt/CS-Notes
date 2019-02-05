#include "functions.h"

/***********************************************************************************************
   Queue Abstract Data Type
  --------------------------
   A list or collection with the restriction that insertion can be performed at one end (rear),
   and deletion can be performed at other end (front). (Last-In First-Out)
                .__.__.__.__.__.__.__.__.__.__.
      front --> |__|__|__|__|__|__|__|__|__|__| <-- rear

   We can implement stacks using Arrays or Linked Lists.
  ---------------------------------------------------------------------------------------------
   Applications					   || Operations
  ---------------------------  	   || ----------
   Network Printer,          	   || enQueue() or push(), deQueue() or pop(),
   Process Scheduling,        	   || isEmpty(), isFull(), 
   Simulating Wait, ...	           || front() or peek(), ...
  ---------------------------------------------------------------------------------------------
   in a circular array if the current position of an array is i, next position and previous
   position respectively will be [i+1]%N and [i+N-1]%N. (let's add N into the parentheses 
   to make sure the inside of parentheses always positive.)
  ---------------------------------------------------------------------------------------------
************************************************************************************************/

int main() {


	enQueue(1);
	enQueue(2);
	enQueue(3);
	enQueue(4);

	deQueue();
	deQueue();
	
	printf("%d\n", getFront());
	printQueue();

	//---------------------------

	enQueue_LS(10);
	enQueue_LS(20);
	enQueue_LS(30);
	enQueue_LS(40);
	enQueue_LS(50);

	deQueue_LS();
	deQueue_LS();

	printf("%d\n", getFront_LS());
	printQueue_LS();



	scanf("\n");
	return 0;
}