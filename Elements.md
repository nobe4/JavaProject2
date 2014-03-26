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
* View grades


Classes
=======

Model
-----
* Person : Abstract class for each human being (student and teacher)
* Student : child of the Person's class
* Teacher : child of the Person's class
* Grade
* Module

View
----
* Login Page
* Teacher Page
* Student Page

Controller
----------
* Database controllers :
    * Add
    * Modify
    * Remove

Database
========

