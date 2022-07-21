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


    The truth is that you might manage to work as a programmer for many years without knowing about a single pattern.
    A lot of people do just that. Even in that case, though, you might be implementing some patterns without even knowing it.
    So why would you spend time learning them?

    a- Design patterns are a toolkit of tried and tested solutions to common problems in software design. 
    Even if you never encounter these problems
    knowing patterns is still useful because it teaches you how to solve all sorts of problems 
    using principles of object-oriented design.

    b- Design patterns define a common language that you and your teammates can use to communicate more efficiently. 
    You can say, “Oh, just use a Singleton for that,” and everyone will understand the idea behind your suggestion. 
    No need to explain what a singleton is if you know the pattern and its name.

## Types of Design Patterns

![patterns](https://user-images.githubusercontent.com/50085672/180302387-cfa77ad8-b8e2-44f8-8aa5-d7c3fa6cf4b9.PNG)


 ***- Behavioral  Patterns***
			 
		 take care of effective communication and the assignment of responsibilities between objects.
 ***- Structural Design Patterns***
		 
		explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient.
 ***- Creational Design Patterns***
				 
		provide object creation mechanisms that increase flexibility and reuse of existing code.

## **Behavioral Patterns**

 ### 1. Chain of Responsibility

 

***Pseudocode***
 
 
![chain](https://user-images.githubusercontent.com/50085672/180303015-94c0d78c-88c4-470f-9917-22101ae9f164.png)



 ***pitfalls***


 - [ ] efficiency Issue in Long Chains!
 - [ ] No guarantee for request handling!
