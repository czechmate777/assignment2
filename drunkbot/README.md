![alt tag](https://raw.github.com/yarko3/assignment2/master/drunkbot/Logo_small.png)


Summary
-------
 We have decided to implement a chatbot who is somewhat intoxicated but coherent and able to learn from user interaction. This bot will interact with the user based on pre-programmed sentence structures as dynamically generated responses based on user input through the use of natural language processing.
 
 The latest updates are listed at the end of this readme document.

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
 * Time Expected: 2 hours
 * Time Actual: 3 hours
* Bottle of SCRUM
 * Time Expected: 2 hours
 * Time Actual: 3 hours
* Sockets client functionality
 * Time Expected: 3 hours
 * Time Actual: 4 hours
* POS
 * Time Expected: 3 hours
 * Time Actual: 3 hours
* DFDs
 * Time Expected: 1-2 hours
 * Time Actual: 2 hours


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
 * User> I am != not a computer
 * Bot> I also like to am computer when I drink.
* Cannot identify if real words are used
 * Bot> Heyyy, how you doin'?
 * User> ARSTARDARDHQWDH#
 * Bot> I loooooove ARSTARDARDHQWDH.
    
* Sometimes does not detect valid sentences
 * User> That much I have gathered but could you give me the particulars of the beverages you are ingesting.
 * Bot> I... what? What do you mean by ingesting and beverages? 
    
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


Assignment 3 updates:
---------------------
* Additions
 * More topics (2 points)
  * There are now more things to talk about with DrunkBot. Not only does DrunkBot have drunkenly responses to many witty questions, but likes to tell the user about his favorite movies and actors. Manny canned responses were added to the dictionary about these topics, aswell as name and age responses.
 Sample Topic:
<pre><code>bot> Heyyy, how you doin'?
user> good, you?
bot> good. wanna drink?
user> yes
bot> me too.
user> What's your favorite movie?
bot> you know that one with the girl? she has the hair and that walk.. yeah.
user> no
bot> then you should buy me a drink!
user> okay
bot> fine.
user> Who's your favorite actress?
bot> i like judi dench. it's too bad she had to die in james bond.
user> Who's your favorite actor?
bot> deffffinitely jesus. oh wait, i'm thinking about something else...
</code></pre>

 * Reasonable Responses (3 points)
  * When a user inputs a phrase that is not in the dictionary of pre-made responses, the drunk bot is able to generate a response based on a simple verb and noun tagging system. DrunkBot will try to stay coherent to the topic the user initiates by using a noun and verb pulled from the input. This can also produce some very humerous (and drunkenly) responses, adding to the effect of a drunka nd disorderly computer.
 Example generated responses:
<pre><code>user> So, what did you do this weekend?
bot> Who are you, comrade question?
user> Sorry, just making conversation.
bot> Such conversation. Very making. Wow.
user> If you say so.
bot> Well fine then.
user> Someone is feeling grumpy...
bot> I also like to feeling Someone when I drink.
user> Not what I meant!
bot> Computers don't often meant, do they?
user> I guess not.
bot> Who are we talking about, you?
user> no.
bot> So.. do you have any plans for the weekend?
user> Yeah! I wanted to go biking
bot> I also like to go biking when I drink.
</code></pre>
There are many other responses that DrunkBot can easily peice together, which results in fluid, drunk conversation.

 * POS tagging - Stanford toolkit (10 points)
  * Parts of speach tagging was implemented using the Stanford toolkit, available here: http://nlp.stanford.edu/software/tagger.shtml. This allows DrunkBot to identify and use different parts of speach from the user's input. More specifically, DrunkBot pulls a verb and noun from the user's input and based on these will respond accordingly. Though the correct parts extracted from the input phrase, DrunkBot does not conjugate the verb to fit correctly into the response sentence. This can result in some interesting results, but more often than not just sounds drunkenly.
 Tagging Sample with relevant words that are carried over to the response in **bold**:
<pre><code>input   > I like **jumping** around often.
response> I loooooove **jumping**. I also love this scotch! Scotch is good.<br/>
input   > This **beer** is really great!
response> Oh yeah, absolutely. What do you think of **beer**?<br/>
input   > How often do you **run**?
response> You really need to try **run**. It goes great with scotch.<br/>
input   > Did you just **eat** that **napkin**?
response> I... what? What do you mean by **eat** and **napkin**?<br/>
input   > This **place** **is** really cold
response> Such **place**. Very **is**. Wow.<br/>
input   > Maybe we should **go** somewhere else
response> You really need to try **go**. It goes great with scotch.
</code></pre>

 * Sockets (15 points)
  * Sockets were implemented to allow DrunkBot to talk to another DrunkBot, or any other bot using the same system. A simple IP-based system was implemented to allow the user of the client side to type in the address of the server. Output and input is passed as objects, as this proved to be the most efficient solution.
 Sample Output:
<pre><code>Act as client using sockets?
yes
Please enter server IP address: 206.87.12.13
CLIENT: Heyyy, how you doin'?
SERVER: Yeah, I can go doin with you.
CLIENT: Oh yeah, absolutely. What do you think of Yeah?
SERVER: Yeah, I can go think with you.
CLIENT: Maybe next time I'll think your mom.... hue hue hue hueeeeeeee.
</code></pre>
* Data Flow Diagrams
 * Level 0:
 ![alt tag](https://raw.github.com/yarko3/assignment2/master/drunkbot/Level0.png)
 This is a basic visualization of the dataflow to and from DrunkBot. The user can interact with the console which then interfaces with the bot. Drunkbot can also talk to another chatbot on an external server. It will also refference the dictionary of canned responses when necessary.
 * Level 1:
 ![alt tag](https://raw.github.com/yarko3/assignment2/master/drunkbot/Level1.png)
 The more detailed level 1 dataflow above shows the inner workings of Drunkbot. The user can enter input into the console which will then be read by the bot. Alternatively, input in the form of objects can be accepted from a server bot. The input is then checked against the canned responses. These are pulled from the dictionary file, and if the string is matched up the coresponding response will be sent to the console (and the server if need be). If no canned response exists, the input is passed into the parts of speach tagger. There, the different parts of speach are tagged and sent off to be checked for a question. A sentence is then chosen based on its verb and noun status (if they exist within the input) and weather it is a question. The response is constructed and then sent off to the console (and the server via socket if need be) in the form of a string. While this process can be rather confusing at first, it provides a great modular system into which new peices can be added.
