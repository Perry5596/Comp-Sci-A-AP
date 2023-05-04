# Air Trafic Control Tower

In this assignment, you will be simulating an Air Traffic Control tower. This program uses data of the Airplane class type. This is a custom class that you will use for this activity. 

Each Airplane object represents an actual airplane that is detected by the tower at a particular instance in time. The Airplane object has a number of fields: a horizontal distance in miles from the tower (as a positive decimal number), a bearing (compass direction) from the tower (as an integer from 0 to 360), a positive altitude (height) in feet (as a positive integer) and a call-sign which consists of letters, numbers, and symbols.

The Airplane class has the following constructors and methods:

## Constructors

- `Airplane()` - Creates an Airplane with call sign “AAA01” located on the landing strip: 1 mile due north (0°) of the tower at an altitude of 0 feet.
- `Airplane(String cs, double dist, int dir, int alt)` - Creates an Airplane with call-sign cs dist miles from the tower on a bearing of dir degrees, at an altitude of alt feet. Notes: alt and dist will always be read as absolute values (non-negative). If dir is not between 0 and 360, the bearing will be set to dir % 360.
 
## Methods

- `move(double dist, int dir)` - Void method. Changes the Airplane position by dist miles on a heading of dir degrees.
- `gainAlt()` - Void method. Increases the altitude of the Airplane by 1000 feet.
- `loseAlt()` - Void method. Decreases the altitude of the Airplane by 1000 feet, or to 0 if altitude is less than 1000 feet.
- `getAlt()` - Returns an int representing the altitude of the Airplane.
- `toString()` - Returns a String representation of the Airplane including all fields. For example: AAL123 - 110.5 miles away at bearing 059°, altitude 4500 feet
- `distTo(Airplane other)` - Returns a double representing the distance in miles between this Airplane and the Airplane other

You will first write code to create a plane, "Airplane 1",  with the default callsign of AAA01, starting in the default position of 1 mile due north (0°) of the tower at an altitude of 0 feet.

Your program will then create a second plane, “Airplane 2”, with the callsign of AAA02, starting at a position of 15.8 miles due north (128°) of the tower at an altitude of 30,000 feet.

Next, your program should ask the user to input the details of a third airplane, "Airplane 3", detected by the tower. This will consist of the call-sign, distance, direction and altitude. Once these inputs have been entered, your program should convert the callsign to use uppercase letters, then create Airplane 3 using these details.

Now, your program should make the following changes to the positions of the airplanes:

- Move Airplane 1 a distance that is equal to the initial distance between Airplane 2 and Airplane 3 on a heading of 65°. In other words, if the distance between Airplane 2 and Airplane 3 is 4.6 miles, then we should move Airplane 4.6 miles on a heading of 65°.
- Move Airplane 2 a distance of 8.0 miles on a heading of 135°.
- Move Airplane 3 a distance of 5.0 miles on a heading 55°.
- Increase the altitude of Airplane 1 by 3,000 feet.
- Decrease the altitude of Airplane 2 by 2,000 feet.
- Decrease the altitude of Airplane 3 by 4,000 feet.

After this, your program should print the details of the planes with their new positions, the new distances between each of the airplanes, and the new differences in height between each of the airplanes.

You should carefully follow the format shown below in the sample runs when you create your program: make sure your program produces the exact same output when you input the sample data into it.

## Milestones

### Milestone 1: 

Write a constructor call to create the first default plane. Write a constructor call to create a second plane with the non-default values. Then write code to get inputs of the correct type for each field for the third plane. Convert the callsign to uppercase and use this data to create Airplane 3.

### Milestone 2: 

Write code that prints the relevant details for all three airplanes. Calculates the distance between each of the airplanes and the (positive) difference in altitude between each of the airplanes, then prints these values.

### Milestone 3: 

Write code that moves the planes as desired (the first airplane up 3000 feet, the second down 2000 feet, and the third down 4,000 feet, then move the first airplane by the initial distance between the second and third on a heading of 65°, the second 8.0 miles on a heading of 135°, and the third 5.0 miles on a heading of 55°). Repeat the code from milestone 2 to print the new positions.

## Sample Runs

### Sample Run 1

```
Enter the details of the third airplane (call-sign, distance, bearing and altitude):
UaL256
12.8
200
22000

Initial Positions:
"Airplane 1": AAA01 - 1.0 miles away at bearing 000°, altitude 0 feet
"Airplane 2": AAA02 - 15.8 miles away at bearing 128°, altitude 30000 feet
"Airplane 3": UAL256 - 12.8 miles away at bearing 200°, altitude 22000 feet

Initial Distances:
The distance between Airplane 1 and Airplane 2 is 16.43 miles.
The distance between Airplane 1 and Airplane 3 is 13.74 miles.
The distance between Airplane 2 and Airplane 3 is 16.98 miles.

Initial Height Differences:
The difference in height between Airplane 1 and Airplane 2 is 30000 feet.
The difference in height between Airplane 1 and Airplane 3 is 22000 feet.
The difference in height between Airplane 2 and Airplane 3 is 8000 feet.

New Positions: 
"Airplane 1": AAA01 - 17.43 miles away at bearing 062°, altitude 3000 feet
"Airplane 2": AAA02 - 23.76 miles away at bearing 130°, altitude 28000 feet
"Airplane 3": UAL256 - 9.16 miles away at bearing 182°, altitude 18000 feet

New Distances:
The distance between Airplane 1 and Airplane 2 is 23.62 miles.
The distance between Airplane 1 and Airplane 3 is 23.4 miles.
The distance between Airplane 2 and Airplane 3 is 19.5 miles.

New Height Differences:
The difference in height between Airplane 1 and Airplane 2 is 25000 feet.
The difference in height between Airplane 1 and Airplane 3 is 15000 feet.
The difference in height between Airplane 2 and Airplane 3 is 10000 feet.
```

### Sample Run 2

```
Enter the details of the third airplane (call-sign, distance, bearing and altitude):
aca549
25.3
305
1000

Initial Positions:
"Airplane 1": AAA01 - 1.0 miles away at bearing 000°, altitude 0 feet
"Airplane 2": AAA02 - 15.8 miles away at bearing 128°, altitude 30000 feet
"Airplane 3": ACA549 - 25.3 miles away at bearing 305°, altitude 1000 feet

Initial Distances:
The distance between Airplane 1 and Airplane 2 is 16.43 miles.
The distance between Airplane 1 and Airplane 3 is 24.74 miles.
The distance between Airplane 2 and Airplane 3 is 41.09 miles.

Initial Height Differences:
The difference in height between Airplane 1 and Airplane 2 is 30000 feet.
The difference in height between Airplane 1 and Airplane 3 is 1000 feet.
The difference in height between Airplane 2 and Airplane 3 is 29000 feet.

New Positions: 
"Airplane 1": AAA01 - 41.52 miles away at bearing 064°, altitude 3000 feet
"Airplane 2": AAA02 - 23.76 miles away at bearing 130°, altitude 28000 feet
"Airplane 3": ACA549 - 24.05 miles away at bearing 316°, altitude 0 feet

New Distances:
The distance between Airplane 1 and Airplane 2 is 38.55 miles.
The distance between Airplane 1 and Airplane 3 is 54.04 miles.
The distance between Airplane 2 and Airplane 3 is 47.75 miles.

New Height Differences:
The difference in height between Airplane 1 and Airplane 2 is 25000 feet.
The difference in height between Airplane 1 and Airplane 3 is 3000 feet.
The difference in height between Airplane 2 and Airplane 3 is 28000 feet.
```
