## Primitive Data Types
A primitive data type specifies the type of a variable and the kind
of values it can hold.

**byte**: stores whole numbers from -128 to 127
**short**: stores whole numbers from -32,768 to 32,767
**int**: stores whole numbers from -2,147,483,648 to 2,147,483,647
**long**: stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
**float**: stores fractional numbers. sufficient to storing 6 to 7 decimal
digits
**double**: stores fractional numbers. sufficient for storing 15 to 16
decimal digits.
**boolean**: stores true or false values
**char**: stores a single character/letter or ASCII values

You cannot change the type
once a variable is declared wih a type, it cannot change to another type
later in the program:

`Note`: this rule makes Java safer, because the compiler will stop you if
you try to mix up types by mistake.
If you really need to change between types, you must use type casting or
conversion methods (for example, turning an `int` into a `double`).
