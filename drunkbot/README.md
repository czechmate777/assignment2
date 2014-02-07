![alt tag](https://raw.github.com/yarko3/assignment2/master/drunkbot/Logo_small.png)


We have decided to implement a chatbot who is somewhat intoxicated but coherent and able to learn from user interaction. This bot will respond to the user based on both pre-programmed sentences, as well as dynamically generated sentences based off user input. A natural language processor will be used to determine parts of speech from user input. 

SDLC: Agile with Scrum
-----------------------------
Management is not required. The chatbot is a small project, so there is no need to elect someone to a management position. Additionally, there are many simple features that can be quickly implemented, meaning that there is not a dependence on complex testing, and additionally the tasks can be completed by individuals working on their own. Because many of the tasks can be completed individually, a simple backlog can be created and members can draw new tasks from it as they complete their current objectives. Work in groups is unnecessary due to the size of team and project, and communication outside of the programming process is all that is necessary.

Phases of SDLC
--------------
* Construct feature set
  * Chatbot with drunk words
  * Take in user input
     * Find suitable library for retrieval verb and noun extractions
     * Use the extracted words to formulate a response
  * Provide a drunken response

* Discuss and agree on coding and design standards
  * Discuss coding and syntactical standards 
  * Agree on standard image sizes and resolution

* Divide features among programmers
  * Discuss the strengths of each member of the team
  * Assign tasks to team members

* Test each implemented feature thoroughly

* Test complete bot

WBS
---


Adam
* Logo


Erin
* Gantt Chart


Ethan

Shayne
* Documentation
   * Expected Time: 30 min
   * Actual Time: 30 min
* Creating a second, simpler bot (just in case)
   * Expected Time: 2 hours
   * Actual Time: 2.5 hours

Yarko
* Implement data pulling from input
* Get natural language parser (OpenNLP)
   * Time Expected: 3 hours
   * Time Actual: 4 hours (need to install using Maven, took more time)
* Get noun and verb from input
   * Time Expected: 30 min
   * Time Actual: 1 hour (needed to work out Eclipse kinks)

*All team members were involved in the testing and expansion of the functional bot


Gantt Chart
-----------

Limitations
-----------
* Cannot develop context-aware responses
* Cannot register colloquialisms
* Can get stuck in loops if user input is not varied


Feature List
-------------
* Natural language processing
* Initial phrase-response dictionary
* Implement learned dictionary based on user input
* Decide appropriate sentence structure for responses
