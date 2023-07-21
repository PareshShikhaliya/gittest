package class27;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystemUI extends JFrame {
    private List<Student> students;
    private JTextField idField;
    private JTextField nameField;
    private JTextField ageField;
    private JTextArea studentTextArea;

    public StudentManagementSystemUI() {
        students = new ArrayList<>();

        setTitle("Student Management System");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField();
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField();

        inputPanel.add(idLabel);
        inputPanel.add(idField);
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(ageLabel);
        inputPanel.add(ageField);

        JButton addButton = new JButton("Add Student");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                Student student = new Student(id, name, age);
                students.add(student);
                updateStudentList();
                clearFields();
            }
        });

        JButton removeButton = new JButton("Remove Student");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                removeStudent(id);
                clearFields();
            }
        });

        JButton updateButton = new JButton("Update Student Details");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                updateStudentDetails(id, name, age);
                clearFields();
            }
        });

        JButton searchButton = new JButton("Search Student");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                searchStudent(id);
                clearFields();
            }
        });

        JButton printButton = new JButton("Print Students");
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateStudentList();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(printButton);

        JPanel studentListPanel = new JPanel(new BorderLayout());
        studentTextArea = new JTextArea();
        studentTextArea.setEditable(false);
        studentListPanel.add(new JScrollPane(studentTextArea), BorderLayout.CENTER);

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(studentListPanel, BorderLayout.SOUTH);
    }

    public void removeStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                updateStudentList();
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Student with ID " + id + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void updateStudentDetails(int id, String newName, int newAge) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(newName);
                student.setAge(newAge);
                updateStudentList();
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Student with ID " + id + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                JOptionPane.showMessageDialog(this, "Student Found:\n" + student.toString(), "Search Result", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Student with ID " + id + " not found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public void updateStudentList() {
        studentTextArea.setText("");
        for (Student student : students) {
            studentTextArea.append("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge() + "\n");
        }
    }

    public void clearFields() {
        idField.setText("");
        nameField.setText("");
        ageField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                StudentManagementSystemUI ui = new StudentManagementSystemUI();
                ui.setVisible(true);
            }
        });
    }
}
