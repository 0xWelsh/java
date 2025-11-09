# Java print variables
## Display variables
to `println()` method is often used to display variables
to combine both text and a variable, use the `+` character:
```
String name = "John";
System.out.println("Hello " + name);
```

in java, the `+` symbol has two meanings:
- for text (strings), it joins them together (called concatenation)
- for numbers, it adds values together

## Mixing text and numbers
be careful when combining text and numbers in the same line of code. without
parenthesis, java will treat the numbers as text after the first string

```
int x = 5;
int y = 6;

System.out.println("The sum is " + x + y); // prints: the sum is 56
System.out.println("The sum is" (x + y)); // prints: the sum is 11
```

