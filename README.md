
Sprint Week 1 – Summer 2024

Welcome to Sprint Week everyone! In this sprint you will be tasked with creating two separate Java programs. The first will be a server program that implements an API that is accessible via HTTP, and the second will be a client (can be a simple text-based console application) which connects via http to the server, making use of the API. As always you are encouraged to pitch and implement your own projects, though for clarity here are some general requirements to follow for the sprint:

•	Create a Java server which (for example using SpringBoot) exposes a REST API over HTTP.
•	API should be designed in such a way that it can be tested completely using Postman.
•	Data is to be in-memory only.  No need for a DB yet, pick a Java data structure you feel is best to use (more on Data Structure below).
•	The project should be pushed to GitHub such that you use the PR workflow discussed in class (trunk-based dev flow).
•	Implement a second program which acts as a client for the API you designed. It should connect VIA http to the server you wrote. To be clear, you need to submit two different java programs and repos, such that they could be on separate computers and still work.
•	When designing your tests for the client, the client should mock the server (or at least the connection) for full coverage in J-Unit Testing.
•	In the Client repo make sure to enable the GitHub action for running the unit tests.
•	The team should manage all work in an agile way, for example using a GitHub issues board to work through a 2 week sprint.
•	Share a short (10 min or less) “demo video” of your final solution working! Have the full team join a Teams call and record it!  This deliverable is very important!!!

Project Data Model

We have 4 main entities (with some suggested attributes):
-	Cities (id, name, state, population)
-	Passengers (id, firstName, lastName, phoneNumber)
-	Airports (id, name, code)
-	Aircraft (id, type, airlineName, numberOfPassengers)

You can be creative and feel free to add/modify the suggested fields above as long as you can setup the correct relationships and answer the questions below.

Key relationship information:
-	Cities can have many airports
-	Passengers can fly on many aircraft and live in one city
-	Aircraft can have many passengers and land/take off from many Airports
-	Airports can only be in one city

Questions to answer with command line options:
-	What airports are in what cities?
-	List all aircraft passengers have travelled on?
-	Which airports can aircraft take off from and land at?
-	What airports have passengers used?

Note: Create all example data by making API calls via Postman as we used in class.  No need for a large dataset, 10s of records will be enough to show all the key concepts.

