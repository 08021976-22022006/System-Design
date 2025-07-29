System Design:

==============



Inheritance:

-------------



Allows one class to inherit properties and behaviours from another class. It helps avoid duplications of code by enabling a new class to reuse code from a existing class. 

A subclass (Child class) class can inherit from super class (Parent class) using extend keyword.



Types of Inheritance:

&nbsp;	Single Inheritance

&nbsp;	Multilevel Inheritance

&nbsp;	Multiple Inheritance

&nbsp;	Hierarchical Inheritance

&nbsp;	Hybrid Inheritance



Inheritance lets a subclass use the methods and fields of its superclass, promoting code reuse and hierarchy



Code reusability

Improves code organization

supports polymorphism

Establishes parent-child relationships



=============================================================================================================================



Polymorphism:

--------------



Polymorphism means "Many Forms" - ability of an object to take an many forms, allowing you to call the same method name on different classes and get different behaviours.

Two main types:

&nbsp;	compile time polymorphism --> method overloading

&nbsp;	run  time polymorphim ---> method overriding using inheritance





Feature		Method Overloading		Method Overriding

Defined In	Same Class 			Subclass

Parameters	Must be different		Must be same

Return type	can be same or different





=============================================================================================================================





Abstract Class:

---------------



Abstract Class:

&nbsp;	is like a blue print for creating other classes. its a class that cannot be instantiated on it own, but it provides a structure that other class can follow.

&nbsp;	Think of it as a partially built house - you cant live in it, but you can use it as a starting point to built a complete house



Interface:

&nbsp;	An interface is like a contract that a class must follow. It defines a set of methods that a class must implement, but it does not provide any implementation itself (only method signatures).

&nbsp;	Think of it like a remote control interface — it tells what buttons are available (methods), but not how the TV responds to each (implementation). The class that "implements" the interface decides what each button actually does.





|||| Abstract Class                         |||| Interface                          ||||

----- ------------------------------------- ----- --------------------------------- -----

abstract class payment {                   |||| interface payments {               ||||

&nbsp;   void processPayment();                 ||||     void paymentMethod();          ||||

&nbsp;                                          ||||     boolean isCompleted();         ||||

&nbsp;   boolean isCompleted() {                |||| }                                  ||||

&nbsp;       Print("Yes!");                     ||||                                    ||||

&nbsp;   }                                      ||||                                    ||||

}                                          ||||                                    ||||

-----------------------------------------------------------------------------------------





Abstract:

* Process of hiding internal implementation details and showing only essential features to the user

&nbsp;	



=======================================================================================================================================================================================================================================================================================================================================================================================







Cohesion And Coupling

---------------------



Cohesion:

1. Cohesion is the degree to which the elements inside a module belong together.
2. A module with high cohesion contains elements that are tightly related to each other and united in their purpose
3. A module is said to be have low cohesion if it contains unrelated elements
4. Highly cohesive modules reflect higher quality of software design



Coupling:

1. Coupling is the degree of interdependence between the modules
2. Two modules have high coupling or tight coupling if they are closely connected and dependent on each other.
3. Modules with low coupling among them work mostly independently of each other
4. Loose coupling reflects the higher quality of software design.







&nbsp;           Cohesion

High  ------------------> Low



&nbsp;           Coupling

High  -------------------> Low









Types of Cohesion:

&nbsp;	Degree of cohesion moves from low to high

&nbsp;	1. Coincidence Cohesion (Worst)

&nbsp;		Modules having no meaning relationship.

&nbsp;		Example: Class contains 2 functions:

&nbsp;			Calculate bill

&nbsp;			Printing Logo



&nbsp;	2. Logical Cohesion

&nbsp;		Modules are grouped because they fall under the same category, but perform different task.

&nbsp;		Example: A CAB Service App Project

&nbsp;			Developer

&nbsp;			Marketing

&nbsp;			DevOps

&nbsp;	

&nbsp;	3. Procedural Cohesion

&nbsp;		Functions are grouped because they execute in a specific sequence.

&nbsp;		Example: A Authentication System

&nbsp;			Take credentials from user

&nbsp;			Check permissions

&nbsp;			Give token and authorize

&nbsp;	

&nbsp;	4. Sequential Cohesion

&nbsp;		Functions are grouped because output of one is the input of next function

&nbsp;		Example: Calculation radius, area, circumference of circle

&nbsp;				

&nbsp;	5. Functional Cohesion (Best)

&nbsp;		All modules contribute to a single well defined task.

&nbsp;		Example: Web Development

&nbsp;			1. Model: Entity

&nbsp;			2. Service: Operations

&nbsp;			3. Repository: To perform database task

&nbsp;			4. Connection termination

&nbsp;			5. Config

&nbsp;			6. Utils 









Types of Coupling:

&nbsp;	Worst to Best

&nbsp;	

&nbsp;	1. Content Coupling (Worst)

&nbsp;		One Module directly modifies another's internal data or logic

&nbsp;		Example:

&nbsp;		class Account{

&nbsp;			private double bankBalance;

&nbsp;		}

&nbsp;		

&nbsp;		class Hacker{

&nbsp;			void steal(Account account){

&nbsp;				Account.bankBalance = 0;

&nbsp;			}

&nbsp;		}



&nbsp;	2. Common Coupling (Bad)

&nbsp;		Modules share global data across whole process

&nbsp;		Example:

&nbsp;		class Credentials{

&nbsp;			String username;

&nbsp;			String password;

&nbsp;		}

&nbsp;		

&nbsp;		class Login{

&nbsp;			

&nbsp;		}



&nbsp;		class Registration{

&nbsp;		

&nbsp;		}

&nbsp;	

&nbsp;	3. Control Coupling 

&nbsp;		One module controls the logic another module

&nbsp;		Example: Binary Search depends on the sorting.



&nbsp;	4. Stamp Coupling

&nbsp;		Modules shares a composite data structure like object, json, xml, but only use a part of it

&nbsp;		Example: After logging a system module got whole user details

&nbsp;			For Welcome Page only need username

&nbsp;			For ChechOut Page only need of address and phone



&nbsp;	5. Data Coupling (Good)

&nbsp;		Modules are communicating via simple data parameters

&nbsp;		User\_id

&nbsp;		Get\_user\_name(user\_id)

&nbsp;		Display\_user\_data(user\_id)		

&nbsp;	

&nbsp;	6. No Coupling(Independent Module)

&nbsp;		Modules have no interaction

&nbsp;		Example: Creating a connection module --> Logger Module.





=============================================================================================================================





Separation OF Concerns:

-----------------------

&nbsp;	The development process has too many different responsibilities. User Interface design, database process, exception handling, and many other tasks can be examples of responsibilities.



What does MVC look like? 

&nbsp;	Request

&nbsp;	------->  Controller 

&nbsp;	|	      |

&nbsp;	|	  Logic File

&nbsp;	|	      |

&nbsp;     User	    Model

&nbsp;	|	      |

&nbsp;	|	    View
	|	      |

&nbsp;	---------------

&nbsp;          Response





Monolithic or Layered Architecture:

&nbsp;	Examples: Creating database 

&nbsp;	Handling request response

&nbsp;	UI

&nbsp;	Message Part

Microservices Architecture:

Model-View-Controller (MVC):

&nbsp;			











-----------------------------------------------------------------------------------------------------------------------------





UML Diagram:

------------

Aggregation: ----<>(white colored)

Composition: ----</>(black colored)

Associations: ----> 

&nbsp;	Inheritance --> Is a Relationship

&nbsp;	Aggregation --> Has a Relationship

&nbsp;	Composition --> Part Of Relationship



Unified Modeling Language --> like a blue print (Class and State)

2 Types:

&nbsp;	Structural Diagram: defects the static aspects of the system, which represent those parts of a diagram forming a main structure and therefore stable

&nbsp;	Behavioural Diagram: 



Class Diagram:

&nbsp;	Important UML diagram used for software application development

&nbsp;	A class diagram describes the types of objects in the 

&nbsp;	----------->  Association(Straight Line)

&nbsp;	-----------|> Inheritance(Straight Line)

&nbsp;	-----------|> Realization / Implementation

&nbsp;	----------->  Dependency

&nbsp;	-----------<> Aggregation

&nbsp;	-----------<//> Composition



1. Create a box
2. Heading should be provided (class name or the entity name)
3. Data Members
4. Behaviour Method



&nbsp;--------------------------------

|	class name		|

|--------------------------------

|				|

|	Data Members		|

|				|

|				|
|--------------------------------

|				|

|	Behaviour Method	|

|				|

|--------------------------------







(+)->public

(#)->protected

(-)->Private





-----------------------------------------------------------------------------------------------------------------------------





Home Work: WAP for Cohesion and Coupling for two modules representing high cohesion and tight couple, low cohesion, all the types from worst to best.





\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_X\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

































































&nbsp;	



































