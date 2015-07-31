Mars Rover
===============

A squad of robotic rovers are to be landed by NASA on a plateau on Mars.
This plateau, which is curiously rectangular, must be navigated by the rovers so that their on-board cameras can get a complete view of the surrounding terrain to send back to Earth.
A rover’s position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.
In order to control a rover , NASA sends a simple string of letters. The possible letters are ‘L’, ‘R’ and ‘M’. ‘L’ and ‘R’ makes the rover spin 90 degrees left or right respectively, without moving from its current spot. ‘M’ means move forward one grid point, and maintain the same heading.Assume that the square directly North from (x, y) is (x, y+1).
Requirements
=============

The requirements of this application are:

[1] IntelliJ IDEA

[2] Ant

[3] JUnit 4.11

[4] Hamcrest Core 1.3

Input
=============

The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0.
The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input.
The first line gives the rover’s position, and the second line is a series of instructions telling the rover how to explore the plateau.
The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover’s orientation.
Each rover will be finished sequentially, which means that the second rover won’t start to move until the first one has finished moving.

Output
========

The output for each rover should be its final co-ordinates and heading.

How to Run?
============

To run the application in your system, just open the application in IntelliJ IDEA,
then goto Run -> Run or you can press options+shift+F10

How to Build
=============

This application using the Ant Build System. You can change your build settings by changing
the **build.xml** present in the project directory. To build the application, just type following
command in your shell:

    $ ant run