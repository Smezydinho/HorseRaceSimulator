# Three-Horse Race Simulator

This Java program simulates a three-horse race, where each horse runs in its own lane for a given distance. The horses move forward based on their confidence level, and there's a small chance they might fall during the race. The race continues until one of the horses reaches the finish line.

## Classes

### Horse

The Horse class represents a horse participating in the race. It has the following instance variables:

symbol: The symbol representing the horse.
name: The name of the horse.
confidence: The confidence level of the horse (0.0 - 1.0).
distance: The distance traveled by the horse.
fallen: A boolean indicating whether the horse has fallen during the race.
The class has methods to manipulate and retrieve the values of these instance variables.

### Race

The Race class manages the race and contains the following instance variables:

raceLength: The length of the racetrack.
lane1Horse, lane2Horse, lane3Horse: The horses participating in the race, each in their respective lanes.
The class has methods to manage the race, such as adding horses, starting the race, and determining the winner.

## Usage
To run the program, compile and execute the Race.java file. The program will start a race with three pre-defined horses and display the race progress on the console.

$ javac Race.java
$ java Race

The output will display the race progress, showing each horse's position, symbol, and confidence level. The race continues until one of the horses reaches the finish line, at which point the winner is announced.

## Contributors

Smyan Singh (https://github.com/Smezydinho)