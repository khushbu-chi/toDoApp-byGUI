import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ToDoApp  toDoApp=new ToDoApp();
            }
        });
       // SwingUtilities.invokeLater(ToDoApp::new);
        }
    }
