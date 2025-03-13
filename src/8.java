// Generate a random integer between 1 and 100
int randomNumber = (int) (Math.random() * 100 + 1);

// Use the random number to create a random math problem
String problem = "What is " + randomNumber + " multiplied by " + (int) (Math.random() * 10 + 1) + "?";

System.out.println(problem);
