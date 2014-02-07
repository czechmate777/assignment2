![alt tag](https://raw.github.com/yarko3/assignment2/master/drunkbot/Logo_small.png)


We have decided to implement a chatbot who is somewhat intoxicated but coherent and able to learn from user interaction. This bot will interact with the user based on pre-programmed sentence structures as well as learned response constructs. Natural language processing will be used to determine parts of speech from user input. 

SDLC: Agile with Scrum
-----------------------------
![alt tag](https://raw.github.com/yarko3/assignment2/master/drunkbot/SCRUM-Final-small.png)


Management is not required. The chatbot is a small project, and there is no need for anyone to have a place at the table as a manager or PM. Additionally, there are many, mostly non-complex or trivial, features that can be quickly implemented. This can be accomplished quickly, and means that there is not a dependence on complex testing, and additionally the tasks can be completed by individuals working on their own. Most features can be completed and implemented independent of the group so a simple backlog can be created and members can draw new tasks from it as they complete tasks. Work in groups is unnecessary due to the size of team and project, and communication outside of the programming process is all that is necessary.

Phases of SDLC
--------------
* Construct feature set
  * Chatbot with drunk words
  * Take in user input
     * Find suitable library for retrieval verb and noun extractions
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
 * Time Expected: 1 hour
 * Time Actual: 2 hours

Yarko
* Implement data pulling from input
* get natural language parser (OpenNLP)
   * Time Expected: 3 hours
   * Time Actual: 4 hours (need to install using Maven, took more time)
* get noun and verb from input
   * Time Expected: 30 min
   * Time Actual: 1 hour (needed to work out Eclipse kinks)
* Create base dictionary of fixed input and answer pairs

Gantt Chart
-----------

Limitations
-----------
* cannot develop context-aware responses
* cannot register colloquialisms


Feature List
-------------
* natural language processing
* initial phrase-response dictionary
* implement learned dictionary based on user input
* decide appropriate sentence structure for responses
