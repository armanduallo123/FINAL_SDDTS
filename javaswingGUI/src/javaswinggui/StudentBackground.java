/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaswinggui;

import General.ConnectionProvider;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author jetro
 */
public class StudentBackground extends javax.swing.JFrame {
      
      private String studentID;
      private String studentName;
      private String Course;
      private String Age;
      private String Grade_level;
      private String Status;
      private String Section;
      
    
    public StudentBackground() {
        
        initComponents();
        showStudentBackground();
    }
    //===================================FUNCTION===============================================//
    
   
    
    
    
    public void showStudentBackground(){
         try {
            // Create the SQL query with placeholders
            String getQuery = "SELECT * FROM student_background";


            // Create a connection
            ConnectionProvider dbc = new ConnectionProvider();
            String jdbcDriver = dbc.getJdbcDriver();
            String dbConnectionURL = dbc.getDbConnectionURL();
            String dbUsername = dbc.getDbUsername();
            String dbPassword = dbc.getDbPassword();
            Class.forName(jdbcDriver);
            Connection connection = DriverManager.getConnection(dbConnectionURL, dbUsername, dbPassword);

            // Create the PreparedStatement
            PreparedStatement statement = connection.prepareStatement(getQuery);

            statement.executeQuery();
           ResultSet resultSet = statement.executeQuery();
    
    // Process the result set as needed
    if (resultSet.next()) {
        this.studentID = resultSet.getString("student_id");
        this.studentName = resultSet.getString("student_name");
        this.Course = resultSet.getString("course");
        this.Age = resultSet.getString("age");
        this.Grade_level = resultSet.getString("year_level");
        this.Status = resultSet.getString("status");
        this.Section = resultSet.getString("section");

        // Display the retrieved data
        System.out.println("student_Id: " + this.studentID);
        System.out.println("Student_name: " + this.studentName);
        System.out.println("course: " + this.Course);
        System.out.println("age: " + this.Age);
        System.out.println("year_level: " + this.Grade_level);
        System.out.println("status: " + this.Status);
        System.out.println("section: " + this.Section);

        // Create a table model to store data
        DefaultTableModel tableModel = new DefaultTableModel();
           // Override isCellEditable method to make all cells non-editable
            tableModel = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    // Make all cells non-editable
                    return false;
                }
            };
        jTable2.setModel(tableModel);
          
         
         
             // Set the row height
            int rowHeight = 30; // Set your desired row height
            this.jTable2.setRowHeight(rowHeight);
           

        // Get column names and add them to the table model
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = metaData.getColumnName(i);
            if (columnName.equals("student_id") || columnName.equals("student_name") ||
                    columnName.equals("course") || columnName.equals("age") || columnName.equals("year_level")
                    || columnName.equals("status") || columnName.equals("section")) {
                columnName = columnName.toUpperCase();
                tableModel.addColumn(columnName);
               
            }
        }

        // Add rows to the table model
        do {
            Object[] rowData = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                rowData[i - 1] = resultSet.getObject(i);
            }
            tableModel.addRow(rowData);
        } while (resultSet.next());

    } else {
        System.out.println("No matching records found.");
        JOptionPane.showMessageDialog(null, "No record found!");
    }

    // Close resources
    resultSet.close();
    statement.close();
    connection.close();

            System.out.println("Retrieved Successfully!");

        } catch (ClassNotFoundException | SQLException e) {
          JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
          e.printStackTrace();
        }
    }
    
    
    //===========================================================================================//


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        student_id_field = new javax.swing.JTextField();
        student_name_field = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        course_field = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        age_field = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        section_field = new javax.swing.JTextField();
        status_field = new javax.swing.JTextField();
        grade_level_field = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        search = new javax.swing.JButton();
        searchTF = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "student_id", "student_name", "course", "age", "grade_level", "status", "section"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("STUDENT ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        student_id_field.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        student_id_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_id_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_id_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(student_id_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 320, -1));

        student_name_field.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        student_name_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_name_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(student_name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 320, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FULL NAME");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("COURSE");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        course_field.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        course_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        course_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(course_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 320, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("AGE");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        age_field.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        age_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(age_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 320, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SECTION");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        section_field.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        section_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(section_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 320, -1));

        status_field.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        status_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(status_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 320, -1));

        grade_level_field.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        grade_level_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(grade_level_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 320, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("GRADE LEVEL");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("STATUS");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "student_id", "student_name", "course", "age", "grade_level", "status", "section"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 880, 330));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 150, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENT BACKGROUND");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 430, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 100));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("INSERT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 150, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 150, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 150, -1));

        search.setBackground(new java.awt.Color(255, 204, 153));
        search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("SEARCH");
        search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 90, 30));
        jPanel1.add(searchTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 320, 30));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("RESET");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 150, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void student_id_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_id_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_id_fieldActionPerformed

    private void student_name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_name_fieldActionPerformed

    private void course_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_fieldActionPerformed
private JFrame frame;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 frame = new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","MySQL connector",
               JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
       {
          
           this.dispose();
       }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                try {
            
            // Create the SQL query with placeholders
            String insertQuery = "INSERT INTO student_background(student_id,student_name,course,age,year_level,status,section) VALUE (?,?,?,?,?,?,?)";


            // Create a connection
            ConnectionProvider dbc = new ConnectionProvider();
            String jdbcDriver = dbc.getJdbcDriver();
            String dbConnectionURL = dbc.getDbConnectionURL();
            String dbUsername = dbc.getDbUsername();
            String dbPassword = dbc.getDbPassword();
            Class.forName(jdbcDriver);
            Connection connection = DriverManager.getConnection(dbConnectionURL, dbUsername, dbPassword);

            // Create the PreparedStatement
            PreparedStatement statement = connection.prepareStatement(insertQuery);

            statement.setString(1, student_id_field.getText());
            statement.setString(2, student_name_field.getText());
            statement.setString(3, course_field.getText());
            statement.setString(4, age_field.getText());
            statement.setString(5, grade_level_field.getText());
            statement.setString(6, status_field.getText());
            statement.setString(7, section_field.getText());
            
            statement.executeUpdate();
            
            this.student_id_field.setText("");
            this.student_name_field.setText("");
            this.course_field.setText("");
            this.age_field.setText("");
            this.grade_level_field.setText("");
            this.status_field.setText("");
            this.section_field.setText("");
            
             DefaultTableModel tableModel = new DefaultTableModel();
             jTable2.setModel(tableModel);    
            showStudentBackground();
            
            System.out.println("Add Successfully!");

        } catch (ClassNotFoundException | SQLException e) {
           JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
    // Create the SQL query for update
    String updateQuery = "UPDATE student_background SET student_name='" + student_name_field.getText() +
            "', course='" + course_field.getText() +
            "', age='" + age_field.getText() +
            "', year_level='" + grade_level_field.getText() +
            "', status='" + status_field.getText() +
            "', section='" + section_field.getText() +
            "' WHERE student_id='" + student_id_field.getText() + "'";

    // Create a connection
    ConnectionProvider dbc = new ConnectionProvider();
    String jdbcDriver = dbc.getJdbcDriver();
    String dbConnectionURL = dbc.getDbConnectionURL();
    String dbUsername = dbc.getDbUsername();
    String dbPassword = dbc.getDbPassword();
    Class.forName(jdbcDriver);
    Connection connection = DriverManager.getConnection(dbConnectionURL, dbUsername, dbPassword);

    // Create the Statement
    Statement statement = connection.createStatement();

    // Execute the UPDATE query
    int rowsAffected = statement.executeUpdate(updateQuery);

    if (rowsAffected > 0) {
        // Clear the input fields
        this.student_id_field.setText("");
        this.student_name_field.setText("");
        this.course_field.setText("");
        this.age_field.setText("");
        this.grade_level_field.setText("");
        this.status_field.setText("");
        this.section_field.setText("");

        JOptionPane.showMessageDialog(this, "Record has been successfully updated");
    } else {
        JOptionPane.showMessageDialog(this, "No record found with the given student_id.");
    }

    // Refresh the table with updated data
    DefaultTableModel tableModel = new DefaultTableModel();
    jTable2.setModel(tableModel);
    showStudentBackground();

    System.out.println("Update Successfully!");

} catch (ClassNotFoundException | SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    e.printStackTrace();
}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // Delete function
int deleteItem;
DefaultTableModel RecordTable = (DefaultTableModel) jTable2.getModel();
int SelectedRows = jTable2.getSelectedRow();
try {
    student_id_field.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
    deleteItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete item ", "warning", JOptionPane.YES_NO_OPTION);

    if (deleteItem == JOptionPane.YES_OPTION) {

        // Create the SQL query with placeholders
        String deleteQuery = "DELETE FROM student_background WHERE student_id = ?";

        // Create a connection
        ConnectionProvider dbc = new ConnectionProvider();
        String jdbcDriver = dbc.getJdbcDriver();
        String dbConnectionURL = dbc.getDbConnectionURL();
        String dbUsername = dbc.getDbUsername();
        String dbPassword = dbc.getDbPassword();
        Class.forName(jdbcDriver);
        Connection connection = DriverManager.getConnection(dbConnectionURL, dbUsername, dbPassword);

        // Create the PreparedStatement
        PreparedStatement statement = connection.prepareStatement(deleteQuery);

        // Bind the parameter
        statement.setString(1, student_id_field.getText());

        // Execute the DELETE query
        int rowsAffected = statement.executeUpdate();

        if (rowsAffected > 0) {
       // Clear the input fields
        this.student_id_field.setText("");
        this.student_name_field.setText("");
        this.course_field.setText("");
        this.age_field.setText("");
        this.grade_level_field.setText("");
        this.status_field.setText("");
        this.section_field.setText("");
        JOptionPane.showMessageDialog(this,"Record has been successfully deleted");
        } else {
            JOptionPane.showMessageDialog(this,"No record found with the given id_number.");
        }
        // Refresh the table with updated data
        DefaultTableModel tableModel = new DefaultTableModel();
        jTable2.setModel(tableModel);
        showStudentBackground();
    }
} catch (ClassNotFoundException | SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    e.printStackTrace();
}

    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    try {
    // Create the SQL query with placeholders
    String searchQuery = "SELECT * FROM student_background WHERE student_id LIKE ? OR student_name LIKE ? OR course LIKE ? OR age LIKE ? OR year_level LIKE ? OR status LIKE ? OR section LIKE ?";
    
    // Create a connection
    ConnectionProvider dbc = new ConnectionProvider();
    String jdbcDriver = dbc.getJdbcDriver();
    String dbConnectionURL = dbc.getDbConnectionURL();
    String dbUsername = dbc.getDbUsername();
    String dbPassword = dbc.getDbPassword();
    Class.forName(jdbcDriver);
    Connection connection = DriverManager.getConnection(dbConnectionURL, dbUsername, dbPassword);
    
    // Create the PreparedStatement
    PreparedStatement statement = connection.prepareStatement(searchQuery);
    
    // Set search parameters
    String searchKeyword = "%" + searchTF.getText() + "%";
    for (int i = 1; i <= 7; i++) {
        statement.setString(i, searchKeyword);
    }
    
    // Execute the query
    ResultSet resultSet = statement.executeQuery();
    
    // Process the result set as needed
    if (resultSet.next()) {
        this.studentID = resultSet.getString("student_id");
        this.studentName = resultSet.getString("student_name");
        this.Course = resultSet.getString("course");
        this.Age = resultSet.getString("age");
        this.Grade_level = resultSet.getString("year_level");
        this.Status = resultSet.getString("status");
        this.Section = resultSet.getString("section");

        // Display the retrieved data
        System.out.println("student_Id: " + this.studentID);
        System.out.println("Student_name: " + this.studentName);
        System.out.println("course: " + this.Course);
        System.out.println("age: " + this.Age);
        System.out.println("year_level: " + this.Grade_level);
        System.out.println("status: " + this.Status);
        System.out.println("section: " + this.Section);

        // Create a table model to store data
        DefaultTableModel tableModel = new DefaultTableModel();
        jTable2.setModel(tableModel);

        // Get column names and add them to the table model
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = metaData.getColumnName(i);
            if (columnName.equals("student_id") || columnName.equals("student_name") ||
                    columnName.equals("course") || columnName.equals("age") || columnName.equals("year_level")
                    || columnName.equals("status") || columnName.equals("section")) {
                tableModel.addColumn(columnName);
            }
        }

        // Add rows to the table model
        do {
            Object[] rowData = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                rowData[i - 1] = resultSet.getObject(i);
            }
            tableModel.addRow(rowData);
        } while (resultSet.next());

    } else {
        System.out.println("No matching records found.");
        JOptionPane.showMessageDialog(null, "No record found!");
    }

    // Close resources
    resultSet.close();
    statement.close();
    connection.close();
} catch (ClassNotFoundException | SQLException e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_searchActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
            DefaultTableModel RecordTable = (DefaultTableModel) jTable2.getModel();
    int SelectedRows = jTable2.getSelectedRow();
    student_id_field.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
    student_name_field.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
    course_field.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
    age_field.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
    grade_level_field.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
    status_field.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
    section_field.setText(RecordTable.getValueAt(SelectedRows, 6).toString());

    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.student_id_field.setText("");
        this.student_name_field.setText("");
        this.course_field.setText("");
        this.age_field.setText("");
        this.grade_level_field.setText("");
        this.status_field.setText("");
        this.section_field.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        HomePage home = new HomePage();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentBackground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentBackground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentBackground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentBackground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentBackground().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age_field;
    private javax.swing.JTextField course_field;
    private javax.swing.JTextField grade_level_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchTF;
    private javax.swing.JTextField section_field;
    private javax.swing.JTextField status_field;
    private javax.swing.JTextField student_id_field;
    private javax.swing.JTextField student_name_field;
    // End of variables declaration//GEN-END:variables
}
