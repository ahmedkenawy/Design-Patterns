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

 

***a- UML Diagram***
 
 
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

***a- UML Diagram  ***

![observer](https://user-images.githubusercontent.com/50085672/180453348-3f11135e-57ed-4308-9284-284f49f8020c.png)


***b- What problems can the Observer design pattern solve?***

	- A one-to-many dependency between objects should be defined without making the objects tightly coupled.
	- It should be ensured that when one object changes state, an open-ended number of dependent objects are updated automatically.
	- It should be possible that one object can notify an open-ended number of other objects.

***c- What solution does the Observer design pattern describe?***

	- Define Subject and Observer objects.
	- so that when a subject changes state, all registered observers are notified
	  and updated automatically (and probably asynchronously).

 ***d- pitfalls***
 
 	- Observable doesn't know which observer update its state
	- Large Updates
	- Difficult debugging
 
 
 
 ***e- Code Example***
 
 	 IN PROJECT


### 3. Command Pattern


***a- UML Diagram***

![command](https://user-images.githubusercontent.com/50085672/180668082-361e5d39-fc44-464c-ac3c-5a59380a8f2c.jpg)


***b- What problems can the Observer design pattern solve?***

	- Coupling the invoker of a request to a particular request should be avoided. That is, hard-wired requests should be avoided.
	- It should be possible to configure an object (that invokes a request) with a request.


***c- What solution does the Observer design pattern describe?***

	- Define separate (command) objects that encapsulate a request.
	- A class delegates a request to a command object instead of implementing a particular request directly.
	
	
	
 ***d- pitfalls***
 
 	- There are a high number of classes and objects working together to achieve a goal. 
	       Application developers need to be careful developing these classes correctly.
	- Every individual command is a ConcreteCommand ...
 
 
 
 ***e- Code Example***
 
 	 IN PROJECT


### 4. Interpreter Pattern

***a- UML Diagram***

![interpreter UMLDiagram](https://user-images.githubusercontent.com/50085672/183257440-6bd249a9-e35a-4d77-b757-fb6169ebc2e8.png)


***b- What problems can the Interpreter design pattern solve?***

	- A grammar for a simple language should be defined
	- so that sentences in the language can be interpreted.
	
	
***c- What solution does the Interpreter design pattern describe?***

	- Define a grammar for a simple language by defining an Expression class hierarchy and implementing an interpret() operation.
	- Represent a sentence in the language by an abstract syntax tree (AST) made up of Expression instances.
	- Interpret a sentence by calling interpret() on the AST.

***d- pitfalls***

	- Complex grammars are difficult to maintain as there will be lot of terminal classes.
	

 ***e- Code Example***
 
 	 IN PROJECT


### 5. Iterator Pattern

***a- UML Diagram***

![iterator pattern](https://user-images.githubusercontent.com/50085672/183257875-8eb98a98-a25a-41ab-b987-af7f82c69348.PNG)


***b- What problems can the Iterator design pattern solve?***

	- The elements of an aggregate object should be accessed and traversed without exposing its representation (data structures).
	- New traversal operations should be defined for an aggregate object without changing its interface.



***c- What solution does the Iterator design pattern describe?***

	- Define a separate (iterator) object that encapsulates accessing and traversing an aggregate object.
	- Clients use an iterator to access and traverse an aggregate without knowing its representation (data structures).
	
***d- pitfalls***

	- If your software simply interacts with basic collections, using the Iterator Design pattern may be an overkill in that case.
	- Explicitly traversing items of some specialized collections may be more competent than using an iterator design pattern.

***e- Code Example***
 
 	 IN PROJECT


### 6. Mediator Pattern

***a- UML Diagram***

![Mediator_pattern (1)](https://user-images.githubusercontent.com/50085672/183317514-0261444a-421a-4bdc-9e64-0f44a7d76361.png)
![Mediator_pattern](https://user-images.githubusercontent.com/50085672/183317539-719a4d32-6773-4c02-8373-e4282347b593.png)


***b- What problems can the Mediator design pattern solve?***

	- Tight coupling between a set of interacting objects should be avoided.
	- It should be possible to change the interaction between a set of objects independently.


***c- What solution does the Mediator design pattern describe?***

	- Define a separate (mediator) object that encapsulates the interaction between a set of objects.
	- Objects delegate their interaction to a mediator object instead of interacting with each other directly.
	
***d- pitfalls***
	
	
	- The Mediator often needs to be very intimate with all the different classes, And it makes it really complex.
	- Can make it difficult to maintain.

***e- Code Example***
 
 	 IN PROJECT


### 7. Memento Pattern

***a- UML Diagram***

![mem](https://user-images.githubusercontent.com/50085672/183317969-13dfc2fc-f578-408b-9491-b286c0b8c77f.png)

![memento](https://user-images.githubusercontent.com/50085672/183317978-c2134bc9-d3d8-4f98-af77-0cfcc20eab52.PNG)

***b- What problems can the Memento design pattern solve?***

	Memento pattern is used to restore state of an object to a previous state. Memento pattern falls under behavioral pattern category.
	Memento pattern uses three actor classes. Memento contains state of an object to be restored. 
	Originator creates and stores states in Memento objects and Caretaker object is responsible to restore object state from Memento. 
	We have created classes Memento, Originator and CareTaker.

***c- What solution does the Memento design pattern describe?***

	- saving its internal state to a (memento) object and
	- restoring to a previous state from a (memento) objec
	

***d- pitfalls***

	- The application will consume a huge amount of RAM if the user creates mementos many times.

	- The extra time to save the states will reduce the overall performance of the application.
	

***e- Code Example***
 
 	 IN PROJECT

	
