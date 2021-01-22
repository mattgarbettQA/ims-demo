Coverage: 72.9%

#Inventory Management System

This is a java application that users can use to interact with a Command-Line Interface. The inventory management system can add customers 
and items to be used to create orders. The inputs by the user are collected in a database which you are able to update customers, items 
and orders. Inluding, calculating a cost for your order.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

Firstly you will need to have java installed. This is available here JDK: https://www.oracle.com/uk/java/technologies/javase-downloads.html

Secondly you will need to have maven installed. This is available here: https://maven.apache.org/index.html

For the database I am using mySQL workbench 8.0 to work on locally. This is available here:https://dev.mysql.com/downloads/workbench/

To open and edit files I am using Eclipse. This is available here: https://www.eclipse.org/downloads/

Finally, I am using git for version control. This is available here:https://gitforwindows.org/

### Installing

A step by step series of examples that tell you how to get a development env running

1. Fork this repository so that you have a local copy: https://github.com/mattgarbettQA/ims-demo
This can be done in the top right corner.

2. Go to your own forked repository, press the green code button and code the HTTPS link

3. Open git bash in the folder you will be working on in your project by right clicking and selecting git bash here

4. Once open enter 

git clone HTTPS_link

5. When it has finished cloning you will have all the necessary files for the application. Open Eclipse and create a maven project.

File, Import, Existing Maven Project
Select the folder the project is in.
Click finish.

6. To run locally set the ims.java to 

jdbc:mysql://localhost:3306/ims if you want to use a local database.

7. To run the application right click in runner and select

Run as, Java Application

8. This will welcome you to this example

INFO - What is your username
root
INFO - What is your password
root

9. You can now choose what you would like to use. This is what you will see.

INFO - Which entity would you like to use?
INFO - CUSTOMER: Information about customers
INFO - ITEM: Individual Items
INFO - ORDER: Purchases of items
INFO - STOP: To close the application

10. Next, for an example lets select customer and create a new customer. You will see this.

customer
INFO - What would you like to do with customer:
INFO - CREATE: To save a new item into the database
INFO - READ: To read an item from the database
INFO - UPDATE: To change an item already in the database
INFO - DELETE: To remove an item from the database
INFO - RETURN: To return to domain selection
create

INFO - Please enter a first name
"The first name which you enter"
INFO - Please enter a surname
"The second name which you enter"
INFO - Customer created

11. This will then take you back to the main screen for you to select what to do now.

INFO - Which entity would you like to use?
INFO - CUSTOMER: Information about customers
INFO - ITEM: Individual Items
INFO - ORDER: Purchases of items
INFO - STOP: To close the application

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests 

Unit testing is where you will test the application to make sure the software runs as it is meant to. To do this.

Right click on the src/test/main and select Junit Test. To check the coverage of testing right click on the project as a whole
and click coverage as Juit Test.

## Deployment

Add additional notes about how to deploy this on a live system

1. Open command line or git bash in the project folder
2. Type mvn clean to get rid of old builds then type mvn package.
3. This will package the source code of the java project into the .jar file
4. After this the target folder will pop up and this is where you will run the project from
5. Run the program using command line or git bash and type java -jar name-ims.0.0.1-jar-with-dependencies.jar

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Matt Garbett** - [mattgarbettQA] (https://github.com/mattgarbettQA)

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Aswene, Sivaraj
* Vinesh, Ghela
