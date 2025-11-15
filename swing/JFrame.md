# JFrame
the first step to creating GUI is displaying a window, so you can interact with that instead of the command prompt. the JFrame class is Swing's representation of a window, and it works like this:

```java
import javax.swing.JFrame;

public class MyGui{
    public static void main(String[] args){
        JFrame frame = new JFrame("Happy Coding");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
```

let's take one code at a time:
`JFrame frame = new JFrame("Happy Coding");`

this line of code creates an instance of the JFrame class, passing in a parameter that sets the title of the window.

`frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)`;
this makes it so when you click the X button in the window, you program exits. If you don't do this, your program could continue running in the background even after the window closes, which you probably don't want.

`frame.setSize(300, 300);`
this line of code set's the width and height of the window in pixels. Try passing in different values to change the size of the window.

`frame.setVisible(true);`
finally, this actually pops the window up and shows it to the user. Notice that the program continues running even after our main() functions ends~
