import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
class ToDoApp {
    private JFrame frame;
    private JTextField taskField;
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;

    public ToDoApp() {
        JFrame  frame=new JFrame();
        frame.setTitle("TO DO LIST");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Task input field

        taskField = new JTextField();
        frame.add(taskField, BorderLayout.NORTH);

        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        frame.add(new JScrollPane(taskList), BorderLayout.CENTER);
        // Buttons panel

        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add Task");
        JButton deleteButton = new JButton("Delete Task");
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);

       // Text Input
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText().trim();
                if (!task.isEmpty()) {
                    taskListModel.addElement(task);
                    taskField.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Task cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        // Delete task action
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    taskListModel.remove(selectedIndex);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a task to delete!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

}
