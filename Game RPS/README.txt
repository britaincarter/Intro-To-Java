This document explains the programs contained in the zip file bic2106programming2.
To run any of the following programs compile (javac [filename.java]) to get their class files previous to running.
Then to run the program type: "java [filename]"
 

Prime:
This programs purpose is to find a prime number using a formula in the form of a method. 
There are no inputs, all the numbers are hardcoded into the program already.
If the program prints out 'false' in front of the number that signifies that it is not a
prime number. If it prints 'true' than it is a prime number. 

RockPaperScissors:
This is a simulation of the game rock paper scissors. The user will be asked to play a minimum of 
10+ rounds before the simulation terminates. Whoever has the best out of 10 wins will win the game.
The inputs are limited to 0, 1, 2 for rock, paper, scissors respectively. 

Statistics:
This program does not have a main argument and hence will not have any output. This is a class for the
sole purpose of containing all the methods which are ran in StatisticsTester.java file. The methods contained
in the class are: findMin, findMode, findMax, findMedian, findStandardDeviation, findMean. All the methods
require an array of doubles to function properly.

StatisticsTester:
The purpose of this program is to find multiple significant statistical items for an array. This program will allow
the user to choose how large of a list they would like to create, and then they will be prompted to fill the array
with the elements of their choosing. Once the array is filled the methods in the Statistics class will be ran on the
array to give the user the mode, minimum, maximum, median, population standard deviation, and mean which will be printed
out to the user once the program terminates.