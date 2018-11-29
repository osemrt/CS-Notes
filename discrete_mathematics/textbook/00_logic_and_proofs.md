Table of Contents
======
- [What is discrete mathematics](https://github.com/osemrt/CS-Notes/new/master/discrete_mathematics/textbook#what-is-discrete-mathematics)

- [1.1 Propositional Logic](https://github.com/osemrt/CS-Notes/new/master/discrete_mathematics/textbook#11-propositional-logic)

- [1.2 Applications of Propositional Logic](https://github.com/osemrt/CS-Notes/new/master/discrete_mathematics/textbook#12-applications-of-propositional-logic)

- [1.3 Applications of Propositional Logic](https://github.com/osemrt/CS-Notes/new/master/discrete_mathematics/textbook#13-propositional-equivalences)

- [1.4 Applications of Propositional Logic](https://github.com/osemrt/CS-Notes/new/master/discrete_mathematics/textbook#14-predicates-and-quanti%EF%AC%81ers)

### What is discrete mathematics? 

Discrete mathematics is the part of mathematics devoted to the study of discrete objects. (Here discrete means consisting of distinct or unconnected elements.) The kinds of problems solved using discrete mathematics include:

 - How many ways are there to choose a valid password on a computer system?
 - What is the probability of winning a lottery?
 - Is there a link between two computers in a network?
 - How can I identify spam e-mail messages?
 - How can I encrypt a message so that no unintended recipient can read it?
 - What is the shortest path between two cities using a transportation system?
 - How can a list of integers be sorted so that the integers are in increasing order?
 - How many steps are required to do such a sorting?
 - How can it be proved that a sorting algorithm correctly sorts a list?
 - How can a circuit that adds two integers be designed?
 - How many valid Internet addresses are there?
 
More generally, discrete mathematics is used whenever objects are counted, when relationships between ﬁnite (or countable) sets are studied, and when processes involving a ﬁnite number of steps are analyzed. A key reason for the growth in the importance of discrete mathematics is that information is stored and manipulated by computing machines in a discrete fashion.

## 1.1 Propositional Logic

![Not Found!](https://github.com/osemrt/CS-Notes/blob/master/discrete_mathematics/textbook/img/291118-02.png?raw=true)

### Summary

  - The rules of logic specify the meaning of mathematical statements.To understand mathematics, we must understand what makes up a correct mathematical argument, that is, a proof. Once we prove a mathematical statement is true, we call it a theorem. Proofs are used to verify that computer programs produce the correct output for all possible input values, to show that algorithms always produce the correct result, to establish the security of a system, and to create artiﬁcial intelligence. Furthermore, automated reasoning systems have been created to allow computers to construct their own proofs. The rules of logic give precise meaning to mathematical statements. These rules are used to distinguish between valid and invalid mathematical arguments.
  
  - The area of logic that deals with propositions is called the propositional calculus or propositional logic.
    
## 1.2 Applications of Propositional Logic

Logic has many important applications to mathematics, computer science, and numerous other disciplines. Statements in mathematics and the sciences and in natural language often are imprecise or ambiguous. To make such statements precise, they can be translated into the language of logic. For example, logic is used in the speciﬁcation of software and hardware, because these speciﬁcations need to be precise before development begins. Furthermore, propositional logic and its rules can be used to design computer circuits, to construct computer programs, to verify the correctness of programs, and to build expert systems. Logic can be used to analyze and
solve many familiar puzzles. Software systems based on the rules of logic have been developed for constructing some, but not all, types of proofs automatically.

### Translating English Sentences

Moreover, once we have translated sentences from English into logical expressions we can analyze these logical expressions to determine their truth values, we can manipulate them, and we can use rules of inference (which are discussed in Section 1.6) to reason about them.

### System Speciﬁcations

Translating sentences in natural language(suchasEnglish)intologicalexpressionsisanessential part of specifying both hardware and software systems. System and software engineers take requirements in natural language and produce precise and unambiguous speciﬁcations that can be used as the basis for system development. Example 3 shows how compound propositions can be used in this process. System speciﬁcations should be consistent , that is, they should not contain conﬂicting requirements that could be used to derive a contradiction.When speciﬁcations are not consistent, there would be no way to develop a system that satisﬁes all speciﬁcations.

### Boolean Searches
Logical connectives are used extensively in searches of large collections of information, such as indexes of Web pages. Because these searches employ techniques from propositional logic, they are called Boolean searches . In Boolean searches, the connective AND is used to match records that contain both of two search terms, the connective OR is used to match one or both of two search terms, and the connective NOT (sometimes written as AND NOT ) is used to exclude a particular search term.

### Logic Puzzles
Puzzles that can be solved using logical reasoning are known as logic puzzles . Solving logic puzzles is an excellent way to practice working with the rules of logic.Also, computer programs designed to carry out logical reasoning often use well-known logic puzzles to illustrate their capabilities. Many people enjoy solving logic puzzles, published in periodicals, books, and on the Web, as a recreational activity.

### Logic Circuits
Propositional logic can be applied to the design of computer hardware.

## 1.3 Propositional Equivalences

An important type of step used in a mathematical argument is the replacement of a statement with another statement with the same truth value. Because of this, methods that produce propositions with the same truth value as a given compound proposition are used extensively in the construction of mathematical arguments.

![Not Found!](https://github.com/osemrt/CS-Notes/blob/master/discrete_mathematics/textbook/img/291118-03.png?raw=true)

## 1.4 Predicates and Quantiﬁers

The statement “x is greater than 3” has two parts. The ﬁrst part, the variable x , is the subject of the statement. The second part—the predicate , “is greater than 3”—refers to a property that the subject of the statement can have. The statements that describe valid input are known as preconditions and the conditions that the output should satisfy when the program has run
are known as postconditions. 

![Not Found!](https://github.com/osemrt/CS-Notes/blob/master/discrete_mathematics/textbook/img/291118-04.png?raw=true)

