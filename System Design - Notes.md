System Design:

==============



Inheritance:

---



Allows one class to inherit properties and behaviours from another class. It helps avoid duplications of code by enabling a new class to reuse code from a existing class.

A subclass (Child class) class can inherit from super class (Parent class) using extend keyword.



Types of Inheritance:

 	Single Inheritance

 	Multilevel Inheritance

 	Multiple Inheritance

 	Hierarchical Inheritance

 	Hybrid Inheritance



Inheritance lets a subclass use the methods and fields of its superclass, promoting code reuse and hierarchy



Code reusability

Improves code organization

supports polymorphism

Establishes parent-child relationships



=============================================================================================================================



Polymorphism:

---



Polymorphism means "Many Forms" - ability of an object to take an many forms, allowing you to call the same method name on different classes and get different behaviours.

Two main types:

 	compile time polymorphism --> method overloading

 	run  time polymorphim ---> method overriding using inheritance





Feature		Method Overloading		Method Overriding

Defined In	Same Class 			Subclass

Parameters	Must be different		Must be same

Return type	can be same or different





=============================================================================================================================





Abstract Class:

---



Abstract Class:

 	is like a blue print for creating other classes. its a class that cannot be instantiated on it own, but it provides a structure that other class can follow.

 	Think of it as a partially built house - you cant live in it, but you can use it as a starting point to built a complete house



Interface:

 	An interface is like a contract that a class must follow. It defines a set of methods that a class must implement, but it does not provide any implementation itself (only method signatures).

 	Think of it like a remote control interface — it tells what buttons are available (methods), but not how the TV responds to each (implementation). The class that "implements" the interface decides what each button actually does.





|||| Abstract Class                         |||| Interface                          ||||

---

abstract class payment {                   |||| interface payments {               ||||

    void processPayment();                 ||||     void paymentMethod();          ||||

                                           ||||     boolean isCompleted();         ||||

    boolean isCompleted() {                |||| }                                  ||||

        Print("Yes!");                     ||||                                    ||||

    }                                      ||||                                    ||||

}                                          ||||                                    ||||

---





Abstract:

* Process of hiding internal implementation details and showing only essential features to the user

 



=======================================================================================================================================================================================================================================================================================================================================================================================







Cohesion And Coupling

---



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







            Cohesion

High  ------------------> Low



            Coupling

High  -------------------> Low









Types of Cohesion:

 	Degree of cohesion moves from low to high

 	1. Coincidence Cohesion (Worst)

 		Modules having no meaning relationship.

 		Example: Class contains 2 functions:

 			Calculate bill

 			Printing Logo



 	2. Logical Cohesion

 		Modules are grouped because they fall under the same category, but perform different task.

 		Example: A CAB Service App Project

 			Developer

 			Marketing

 			DevOps

 

 	3. Procedural Cohesion

 		Functions are grouped because they execute in a specific sequence.

 		Example: A Authentication System

 			Take credentials from user

 			Check permissions

 			Give token and authorize

 

 	4. Sequential Cohesion

 		Functions are grouped because output of one is the input of next function

 		Example: Calculation radius, area, circumference of circle

 

 	5. Functional Cohesion (Best)

 		All modules contribute to a single well defined task.

 		Example: Web Development

 			1. Model: Entity

 			2. Service: Operations

 			3. Repository: To perform database task

 			4. Connection termination

 			5. Config

 			6. Utils









Types of Coupling:

 	Worst to Best

 

 	1. Content Coupling (Worst)

 		One Module directly modifies another's internal data or logic

 		Example:

 		class Account{

 			private double bankBalance;

 		}

 

 		class Hacker{

 			void steal(Account account){

 				Account.bankBalance = 0;

 			}

 		}



 	2. Common Coupling (Bad)

 		Modules share global data across whole process

 		Example:

 		class Credentials{

 			String username;

 			String password;

 		}

 

 		class Login{

 

 		}



 		class Registration{

 

 		}

 

 	3. Control Coupling

 		One module controls the logic another module

 		Example: Binary Search depends on the sorting.



 	4. Stamp Coupling

 		Modules shares a composite data structure like object, json, xml, but only use a part of it

 		Example: After logging a system module got whole user details

 			For Welcome Page only need username

 			For ChechOut Page only need of address and phone



 	5. Data Coupling (Good)

 		Modules are communicating via simple data parameters

 		User\_id

 		Get\_user\_name(user\_id)

 		Display\_user\_data(user\_id)

 

 	6. No Coupling(Independent Module)

 		Modules have no interaction

 		Example: Creating a connection module --> Logger Module.





=============================================================================================================================





Separation OF Concerns:

---

 	The development process has too many different responsibilities. User Interface design, database process, exception handling, and many other tasks can be examples of responsibilities.



What does MVC look like?

 	Request

 	------->  Controller

 	|	      |

 	|	  Logic File

 	|	      |

      User	    Model

 	|	      |

 	|	    View
|	      |

 	---------------

           Response





Monolithic or Layered Architecture:

 	Examples: Creating database

 	Handling request response

 	UI

 	Message Part

Microservices Architecture:

Model-View-Controller (MVC):

 



##### UML Diagram:

Aggregation: ----<>(white colored)

Composition: ----</>(black colored)

Associations: ---->

 	Inheritance --> Is a Relationship

 	Aggregation --> Has a Relationship

 	Composition --> Part Of Relationship



Unified Modeling Language --> like a blue print (Class and State)

2 Types:

 	Structural Diagram: defects the static aspects of the system, which represent those parts of a diagram forming a main structure and therefore stable

 	Behavioural Diagram:



###### Class Diagram:

 	Important UML diagram used for software application development

 	A class diagram describes the types of objects in the

 	----------->  Association(Straight Line)

 	-----------|> Inheritance(Straight Line)

 	-----------|> Realization / Implementation

 	----------->  Dependency

 	-----------<> Aggregation

 	-----------<//> Composition



1. Create a box
2. Heading should be provided (class name or the entity name)
3. Data Members
4. Behaviour Method



 --------------------------------

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









Home Work: WAP for Cohesion and Coupling for two modules representing high cohesion and tight couple, low cohesion, all the types from worst to best.





\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_X\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_











30-07-2025



### SOLID PRINCIPLES AND DESIGN PRACTICES



 	Tells the way to write a code.

As a software systems grow, they tend to become complex and harder to change. A Small change in one part can cause unexpected issues elsewhere. this is rigidity and fragility in code.



## Common problems in large codebases:

 	Tight Coupling

 	Low Cohesion

 	Code Smells

 	Difficult Testing and Maintenance





##### Birth of SOLID Principles:

 	Developers Start building large scale systems, they noticed these recurring issues.

 	Need for guidelines to make software,



#### SOLID:



## S - Single Responsibility Principle (SRP)

 	- A Class should have a single responsibility

 	- If a class has many responsibility, it increases the possibility of bugs because making changes to one of the it responsibility, could affect the other ones without you knowing

###### Goal:

 	This principle aims to separate behaviours so that if bugs arise as a result of your change, it wont affect other unrelated behaviours.

        Each class has a single responsibility and easily able to extend

        Testing of business logic become easy

 

Home Work:

Case Study : Invoice Processor : SRP

public class InvoiceProcessor{

 	calculateTotal();

 	printInvoice();

 	saveToDBorFile();

 	sendEmailToCustomer();

}





##### O - Open Closed Principle (OCP)

 	- Class should be open for extension but close for modification.

 	- Changing the current behaviour will affect all the systems using that class.

###### Goal:

 	This principles aim to extend a class's behaviour without changing the existing behaviour of that class.
This avoid causing bug wherever the class is being used

Home Work:

Add Invoice:
Add feature following OCP:

New Feature: Send notification using SMS.



##### 

##### L - Liskov Principle (LSP)

 	- When a child class cannot perform the same action as its parent class, this can cause bugs.

 	- The child class should be able to process the same requests and deliver the same result as the parent class or it could deliver a result that is of the same type.



Home Work:

Document Converter Class:

convertToPDF();

convertToWord();

convertToJPEG();





##### I - Interface Segregation Principle (ISP)

 	- Clients should not be forced to depend on methods that they do not use.

 	- Separate the class based on the tasks.



###### Goal:

 	This principle aims at splitting a set of actions into smaller sets so that a class executes only the set of actions it requires.



###### BENIFITS:

 	- Classes are not burdened with unnecessary tasks or methods

 	- Interfaces become role specific

 	- Promotes flexibility, modularity and maintainability



Home Work:

Case Study: Smart Appliances Control Fan, AC, Light

SmartDevice{

 	turnOn();

 	turnOff();

 	setTemperature();

 	dimLight();

 	Speed();

}



##### D - Dependency Inversion Principle

 	- High Level modules should not depend on low-level modules. Both should depend on the abstraction

 	- Abstractions should not depend on details. Details should depend on abstraction

 	- *High-Level Module:* Class that executes an action with a tool.
- *Low-Level Module:* The tool that is needed to execute the action

 	- *Abstraction:* Represents an interface that connects the two classes

 	- *Details:* How the tools works



###### Goal:

 	This principle aims at reducing the dependency of a high-level class on the low-level class by introducing an interface.



Home Work:

Case Study: Notification System for email, whatsapp, SMS



EmailService{

 	(High Level Module) Notification Manager

}





##### Advantages of SOLID Principles:

 	- Achieve the reduction in complexity of the code

 	- Increase readability, extensibility, and maintenance

 	- Increase scalability, code flexibility, and readability

 	- Achieve Better Testability

 	- Reduce tight coupling

 	- Reduce error and implement Reusability

 	- Increase Parallel development









### Inversion of Control: (IoC)

 	- Inverting the control

 	- A principle in software engineering which transfers the control of objects or portions of a program to a container or framework.

 	- As name suggested it is used to invert different kinds of controls in Object Oriented Design to achieve loose coupling. Here, controls refers to any additional responsibility in a class has other its main responsibility

 	- The IoC Principle helps in designing loosely coupled classes which make them testable, maintainable and extendible



###### Types: We have many

Important:

 	1. Dependency Injection (DI)

 		- "What happens when one class directly creates the objects it needs?"

 		  That leads to tight coupling - the main reason we need Dependency Injection

 		public class ReportService{

 			private FileReportSaver saver = new FileReportSaver();

 			public void saveReport(String data){

 				saver.save(data)

 			}

 		}

*NON DI*
class RestaurantManager{

 	public void OrderIngredients{

 		IngredientSupplier supplier = new IngredientSupplier();

 		supplier.DeliverIngredients();

 	}

 	public void ManageKitchen{

 		Chef chef = new Chef();

 		chef.CookPasta();

 		chef.MakePizza();

 	}

}



*DI*

class RestaurantManager{

 	private IngredientSupplier supplier;

 	private Chef chef;

 	public RestaurantManager(IngredientSupplier supplier, Chef chef){

 		this.supplier = supplier;

 		this.chef = chef;

 	}

 	public void OrderIngredients{

 		supplier.DeliverIngredients();

 	}

 	public void ManageKitchen{

 		chef.CookPasta();

 		chef.MakePizza();

 	}

}









##### ANTI-PATTERNS \& CODE SMELLS:

###### 

###### CODE SMELLS:

 	Establish the concept of code smells as indicator of potential issues in the code base, often manifesting as patterns that might lead to maintainability, reusability or performance problems



###### ANTI-PATTERNS:

 	Defines anti-patterns as recurring solutions that initially appear to be beneficial but often result in negative consequence, such as poor scalability





\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_X\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_



31-07-2025



### CORE LLD AND ARCHITECTURE



##### Software Architecture:

 	Software architecture refers to the fundamental structures of a softwsre system and the discipline of creating suvh structure.
It encompasses the set of significant decisions about the organization of a software system, including:

 		Structural elements and their interfaces: Components, modules, services, etc
Behavioural elements: How components interact through interfaces and protocols
Composition: How components are combined to form a complete system

 		Architectural Style: Set of principles and conventions used to create a software architecture.



##### Importance Of Software Architecture

 	-> Foundation for Quality Attributes

 	-> Guides Development

 	-> Facilitates Communication

 	-> Enables Reusability And Extensibility



##### Common Architectural Patterns

 	- *Layered Architecture* --> Separates the system into layers with specific responsibilities, promoting separation of concerns and ease of maintenance

 	- *Microservices Architecture* --> Structures the application as a collection of loosely coupled services, each implementing a specific business capability

 	- *Event - Driven Architecture* --> Uses events to trigger and communicate between decoupled services, enabling real-time processing and responsiveness.



###### *Layered Architecture:*

&nbsp;	Layered architecture is a common architectural pattern used in software development to organize code into horizontal layers into horizontal layers responsible for a specific aspect of the application's functionality. The key characteristics of layered architecture include:

&nbsp;	- Organization  --> the code base is divided into layers with each layer representing a different concern or aspect of the application. These layers are organized hierarchically, typically from bottom to top or from inner to outer layers

&nbsp;	- Separation of Concerns

&nbsp;	- Dependencies

###### 	*Implementation:*

		Layers: Model Layer, Repository/DAO Layer, Service Layer, Presentation/Controller Layer



&nbsp;	   *Flow of Code:*

		Presentation Layer -----> Service Layer -----> Repository Layer -----> Model Layer

&nbsp;	   Ex:  (StudentController)	 (StudentService)     (StudentRepository)      (Student)





DAO - Data Access Object

&nbsp;	- Is a structured pattern used to abstract and encapsulate all access to a data source -  separates the persistence logic from the business logic of the application

&nbsp;	- Why ?

&nbsp;		- To separate concerns 

&nbsp;		- to promote reusability and testability

&nbsp;		- makes it easier to switch between data sources

&nbsp;		- simplifies unit testing by mocking data access

&nbsp;	- When ?

&nbsp;		- Your application interacts with a database or external data source

&nbsp;		- You want to follow best practices like layering

&nbsp;		- You need to perform CRUD operations on entity

&nbsp;	- Common use cases:

&nbsp;		- Employee database

&nbsp;		- Student records

&nbsp;		- Product inventory system	

&nbsp;	

















