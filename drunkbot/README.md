![alt tag](https://raw.github.com/yarko3/assignment2/master/drunkbot/Logo_small.png)


 We have decided to implement a chatbot who is somewhat intoxicated but coherent and able to learn from user interaction. This bot will interact with the user based on pre-programmed sentence structures as dynamically generated responses based on user input through the use of natural language processing.

SDLC: Agile with Scrum
-----------------------------
![alt tag](https://raw.github.com/yarko3/assignment2/master/drunkbot/SCRUM-Final-small.png)


 Management is not required. Because the bot is not a large project there is no need to elect someone to a manager type position. Additionally, there are many trivial features that can be quickly implemented by individual team members. This means that there is not a dependence on complex testing. As a result, a simple backlog can be created and members can draw new tasks from it as they complete their current objectives. Work in groups is unnecessary due to the size of team and project, and communication outside of the programming process is all that is necessary.

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
  * Decide on user interface

* Divide features among programmers
  * Discuss the strengths of each member of the team
  * Assign tasks to team members
  * Discuss and share features implemented with team members

* Test each implemented feature thoroughly
  *  Run multiple tests to see if features work together

* Test complete bot
  * Run program
  * Record/document a conversation of 30 tries for submission 

WBS
---


Adam
* Logo
 * Time Expected: 1 hour
 * Time Actual: 45 minutes
* Documentation
 * Time Expected: 1 hours
 * Time Actual: 1 hours
* Bottle of SCRUM
 * Time Expected: 2 hour
 * Time Actual: 3 hours


Erin
* Gantt Chart
 * Time Expected: 30 minutes
 * Time Actual: 2 hours (confusing)
* Documentation
 * Time Expected: 1 hour
 * Time Actual: 1.5 hours


Ethan
* Organize project, manage source code
   * Time Expected: 2 hours
   * Actual Time: 2 hours
* Create chat environment
   * Construct sentences based OpenNLP output
   * Adapt to missing parts of speech
      * Answers based on missing verbs or nouns
   * Choosing best sentence structure to use
   * Time expected: 3 hours
   * Actual Time: 4 hours
* Add to key:value dictionary

Shayne
* Documentation
 * Time Expected: 30 min
 * Actual Time : 1 hour
* Coding possible extra features for the bot
 * Time Expected: 2 hours
 * Actual Time: 2.5 hours

Yarko
* Implement data pulling from input
* Get natural language parser (OpenNLP)
   * Time Expected: 3 hours
   * Time Actual: 4 hours (need to install using Maven, took more time)
* Get noun and verb from input
   * Time Expected: 30 min
   * Time Actual: 1 hour (needed to work out Eclipse kinks)
* Create base dictionary of fixed input and answer pairs

* All team members were involved in the testing and expansion of the functional bot

Gantt Chart
-----------

![alt tag](https://raw.github.com/yarko3/assignment2/master/drunkbot/ganttchart.png)

The above chart summarizes the tasks completed over the course of the project time frame. It is noted that the sub groups show the dependences of related tasks.

Limitations
-----------
* Cannot develop context-aware responses
* Cannot register colloquialisms
* 

Meetings
--------
* January 27, 2014 - 1.5 hours
* January 29, 2014 - 2 hours
* January 31, 2014 - 1 hour
* Feburary 1, 2014 - 2 hours
* Feburary 6, 2014 - 1.5 hour
* Feburary 7, 2014 - 1 hour


Feature List
-------------
* Natural language processing
* Initial phrase-response dictionary
* Implement learned dictionary based on user input
* Decide appropriate sentence structure for responses
