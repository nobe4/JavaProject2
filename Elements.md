Requirements
============

* handle modules inscriptions
* graphic application
* module : a teacher & multiple assistants (high class student)
* modules, teacher and students has speciality
* teacher & student has a mandatory module
* complementary modules can be added
* module : 3+ grades (value/coefficient - sum == 1-) and final grade over 20
* student has a tutor (teacher)
* tutor receive an alert if final grade is under 10


Operations
==========

* View/Add/Modify/Remove :
    * module
    * student
    * grade
    * teacher
    * tutor
    * assistant
    * inscriptions


Interfaces
==========

Login
-----
* Login with name+id  and mdp (name id birthday)


Teacher
-------
* View/Add/Remove/Modify :
    * a module
    * a student
    * a grade
    * an assistant
* Set himself as a tutor
* Show alerts

Student
-------
* View grades and alerts


Classes
=======

Model
-----
* Instances :
    * Module        : name(string), year(int)
    * Person        : name(string), email(string), password(string), type("TEACHER"/"STUDENT"), module_id(int)"speciality"
    * Student       : is_assistant(boolean), year(int)
    * Teacher       : is_tutor(boolean)
    * Inscription   : person_id(int), module_id(int)
    * Grade         : value(double), coefficient(double), person_id(int)"student", person_id(int)"teacher", module_id(int)
    * Tutor         : person_id(int)"student", person_id(int)"tutor"
    * Assistant     : person_id(int), module_id(int)
    * Alerts        : person_id(int)"student", person_id(int)"tutor", module_id(int), message(string)
* Collections for each instances, with search by id.
* Interface Editable which is implemented by all classes

View
----
* Login Page
* Teacher Page
* Student Page

Controller
----------
* Database controllers :
    * Add/Modify/Remove at the end
        * module
        * student
        * grade
        * teacher
        * tutor
        * assistant
        * inscriptions
* model controller
    * edit instances
    * add instance in collections

Database
========
* tables :
    * module        : id(int), name(string), year(int)
    * person        : id(int), name(string), email(string), password(email), type("TEACHER"/"STUDENT"), module_id(int)"speciality", year(int)
    * grade         : id(int), value(double), coefficient(double), person_id(int)"student", person_id(int)"teacher", module_id(int)
    * inscription   : id(int), person_id(int), module_id(int)
    * tutor         : id(int), person_id(int)"student", person_id(int)"tutor"
    * assistant     : id(int), person_id(int), module_id(int)
    * alerts        : id(int), person_id(int)"student", person_id(int)"tutor", module_id(int), message(string)

side note : year is the year in the school, so 1 for the first year, 2 for the second ... a teacher does not have a year.