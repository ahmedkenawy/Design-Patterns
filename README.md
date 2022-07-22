# Design Patterns

## What's a Design Patterns?

	Design patterns are typical solutions to commonly occurring problems in software design. 
	They are like pre-made blueprints that you can customize to solve a recurring design problem in your code.

	You can’t just find a pattern and copy it into your program, the way you can with off-the-shelf functions or libraries. 
	The pattern is not a specific piece of code, but a general concept for solving a particular problem. 
	You can follow the pattern details and implement a solution that suits the realities of your own program.

	Patterns are often confused with algorithms, because both concepts describe typical solutions to some known problems. 
	While an algorithm always defines a clear set of actions that can achieve some goal,
	a pattern is a more high-level description of a solution. 
	The code of the same pattern applied to two different programs may be different.

	An analogy to an algorithm is a cooking recipe: 
	both have clear steps to achieve a goal. On the other hand, 
	a pattern is more like a blueprint: you can see what the result and its features are, 
	but the exact order of implementation is up to you.

## Why Design Patterns?

    a- avoid reinventing the wheel

    b- communication between software Engineer using commom Vocabulary
    
    c-Leverage the Power of Object Oriented Design

## Types of Design Patterns

![patterns](https://user-images.githubusercontent.com/50085672/180302387-cfa77ad8-b8e2-44f8-8aa5-d7c3fa6cf4b9.PNG)


 ***- Behavioral  Patterns***
			 
		 take care of effective communication and the assignment of responsibilities between objects.
 ***- Structural Design Patterns***
		 
		explain how to assemble objects and classes into larger structures
		while keeping these structures flexible and efficient.
 ***- Creational Design Patterns***
				 
		provide object creation mechanisms that increase flexibility and reuse of existing code.

## **Behavioral Patterns**

 ### 1. Chain of Responsibility

 

***a- UML class and sequence diagram***
 
 
![chain](https://user-images.githubusercontent.com/50085672/180303015-94c0d78c-88c4-470f-9917-22101ae9f164.png)








 ***b- What problems can the Chain of Responsibility design pattern solve?***
 	
  	-  Coupling the sender of a request to its receiver should be avoided.
  	-  It should be possible that more than one receiver can handle a request.


***c- What solution does the Chain of Responsibility design pattern describe?***
	
	Define a chain of receiver objects having the responsibility, depending on run-time conditions
	to either handle a request or forward it to the next receiver on the chain (if any).
	This enables us to send a request to a chain of receivers without having to know which one handles the request. 
	The request gets passed along the chain until a receiver handles the request. 
	The sender of a request is no longer coupled to a particular receiver.
	

 ***d- pitfalls***


 	-  efficiency Issue in Long Chains!
 	-  No guarantee for request handling!

 ***e- Code Example***
 
 	 IN PROJECT
	 
	 
### 2. Observer Pattern
