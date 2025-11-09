every line of code that runs in java must be inside a `class`
the class name should always start with an uppercase first letter. 
in our example, we names the class `Main`
---
`Note`: java is case sensitive.

the name of the java file must match the class name.
so if your class is called `Main`, the file must be saved as `Main.java`
this is because Java uses the class name to find and run your code.
if names don't match, java will give an error and the program will not run
---

# The main method
the `main()` method is required in every Java program. it is where the
program starts running:

```
public static void main(String[] args)
```
any code placed inside the `main()` method will be executed.

---
# System.out.println()
inside the `main()` method, we can use the `println()` method to print a line
of text to the screen.

example
```
public static void main(String[] args) {
	System.out.println("Hello World");
}
```
`Note:` The curly braces mark the beginning and the end of a block of code.
---
# Java Statements
## Statements
A computer program is a list of "instructions" to be "executed" by a computer.
In a programming language, these programming instructions are called 
statements

the following instructs the computer to print the text "Java is fun!" to the
screen:
```
System.out.println("Java is fun!")
```

it is important you end the statements with a semicolon `;`


