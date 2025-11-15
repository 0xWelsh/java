# A Brief History
Java contains three different GUI libraries, which are each just a bunch
of classes in the java API that you can use. Trying to understand how all
these classes fit together can be confusing, so here's a brief summary of
how they work:
---
1. The Abstract Windows Toolkit, or AWT, has been a part of Java since day
one, way back in 1996.AWT works by passing in "native" calls to your computer
So if you create a checkbox in AWT, you're really telling the operating
system to create a checkbox. All of the AWT classes are in the **java.awt**
package.

2. The downside of that approach is that your program will look different
computers: a checkbox on Linux looks different from a checkbox on Windows.
This can make it harder to layout your program or have a consistent experien-
ce across different platforms. To fix this, **swing** was added in 1998. The
idea behind Swing is that instead of telling your computer to create a 
checkbox, Swing draws the checkbox itself.
That way, the checkbox will look the same on different operating systems.
The Swing classes are in the **java.swing** package. But Swing was built on
top of AWT, so you'll see Swing code using classes from the **java.awt**
package as well.

3. JavaFX was originally developed as an external library in 2008, and it was
included in Java in 2014. JavaFX focuses on modern GUI features, like more
animations, CSS styling, and using a computer's graphics card to handle the
rendering. JavaFX classes are in the **javafx** package, which is in a **.jar**
 file that comes with Java

Even though JavaFX is newer, we're focusing on Swing for a couple reasons:
- the benefit of Swing being around longer is that there are a ton of 
resources more about it. if you're wondering how to do something in Swing,
chances are somebody has ased your question on stack overflow

- Swing is a great way to become more comfortable with OOP, inheritance, and
general program flow. So even if your goal with programming isn't Swing, it's
good idea to spend some time here because it'll help you learn other stuff
you need to be learning


