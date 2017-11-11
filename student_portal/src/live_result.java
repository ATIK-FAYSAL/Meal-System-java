
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class live_result extends javax.swing.JFrame {
    String profile;
    String combo_text;
    public live_result() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        course = new javax.swing.JButton();
        combo_profile = new javax.swing.JComboBox<>();
        logout = new javax.swing.JButton();
        home = new javax.swing.JButton();
        live_result = new javax.swing.JButton();
        result = new javax.swing.JButton();
        semester = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        course_table = new javax.swing.JTable();
        course_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        result_table = new javax.swing.JTable();
        result1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        course.setBackground(new java.awt.Color(51, 51, 51));
        course.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        course.setForeground(new java.awt.Color(204, 204, 204));
        course.setText("Course");

        combo_profile.setBackground(new java.awt.Color(51, 51, 51));
        combo_profile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        combo_profile.setForeground(new java.awt.Color(204, 204, 204));
        combo_profile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profile", "Edit profile", "Change Password" }));
        combo_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_profileActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(51, 51, 51));
        logout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(204, 204, 204));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(51, 51, 51));
        home.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(204, 204, 204));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        live_result.setBackground(new java.awt.Color(51, 51, 51));
        live_result.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        live_result.setForeground(new java.awt.Color(204, 204, 204));
        live_result.setText("Live Result");

        result.setBackground(new java.awt.Color(51, 51, 51));
        result.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        result.setForeground(new java.awt.Color(204, 204, 204));
        result.setText("Result");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        semester.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Semester", "Spring 2016", "Summer 2016", "Fall 2016", "Spring 2017", "Summer 2017" }));
        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });

        course_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Course Title"
            }
        ));
        course_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                course_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(course_table);

        result_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject", "quiz1", "Quiz 2", "Quiz 3", "Quize Avg", "Midterm", "Final", "Lab", "Assignment", "Presentation", "Attendance"
            }
        ));
        jScrollPane1.setViewportView(result_table);

        result1.setText("RESULT");
        result1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(live_result, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(result1)
                                .addComponent(course_name, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(394, 394, 394)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(live_result, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(course_name))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(result1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_profileActionPerformed
        profile = combo_profile.getSelectedItem().toString();
        combo_profile.setSelectedItem(profile);
        log_in_page log = new log_in_page();
        String str = log.return_email();
        if(profile.equals("Profile"))
        {
            profile_page page = new profile_page();
            page.get_info();
            page.setVisible(true);
            this.dispose();
        }
        else if(profile.equals("Edit profile"))
        {
            edit_profile edit = new edit_profile();
            edit.setVisible(true);
            this.dispose();
        }
        else if(profile.equals("Change Password"))
        {
            change_password change = new change_password();
            change.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_combo_profileActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        log_in_page page = new log_in_page();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        student_home_page page = new student_home_page();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        result res = new result();
        res.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_resultActionPerformed

    private void semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterActionPerformed
        combo_text = semester.getSelectedItem().toString();
        DefaultTableModel model = (DefaultTableModel) course_table.getModel();
        int i;
        try
        {
            if(combo_text.equals("Spring 2016"))
            {
                String[] subject_code = {"MAT121","PHY123","ENG113","PHY121L","CSE131"};
                String[] subject_name = {"Mathematics-2 (Linear Algebra)","Physics-2 Laboratory","English","Physics-2","Discreate Mathematics"};
                for(i=0;i<subject_code.length;i++)
                {
                    model.insertRow(model.getRowCount(),new Object[]{subject_code[i],subject_name[i+1]});
                }
            }
            if(combo_text.equals("Summer 2016"))
            {
                String[] subject_code = {"ECO314","ACC214","CSE213L","CSE213","MATH134"};
                String[] subject_name = {"Economics","Accounting","Algorithm Lab","Mathematics-3"};
                for(i=0;i<subject_code.length;i++)
                {
                    model.insertRow(model.getRowCount(),new Object[]{subject_code[i],subject_name[i+1]});
                }
            }
            if(combo_text.equals("Fall 2016"))
            {
                String[] subject_code = {"MAT223","CSE222","CSE222L","CSE221","MAT211"};
                String[] subject_name = {"Statistic","Objected oriented programing","Object oriented programming lab","Theory of computing","Engineering Mathematics"};
                for(i=0;i<subject_code.length;i++)
                {
                    model.insertRow(model.getRowCount(),new Object[]{subject_code[i],subject_name[i+1]});
                }
            }
            if(combo_text.equals("Spring 2017"))
            {
                String[] subject_code = {"CSE224","CSE224L","CSE232","CSE231","CSE231L"};
                String[] subject_name = {"Electronic device and circuit","Electronic device and circuit lab","Instrumentation and control","Data comunication","Micropocessor and Assembly language","Micropocessor and Assembly Language Lab"};
                for(i=0;i<subject_code.length;i++)
                {
                    model.insertRow(model.getRowCount(),new Object[]{subject_code[i],subject_name[i+1]});
                }
            }
            if(combo_text.equals("Summer 2017"))
            {
                String[] subject_code = {"CSE311","CSE311L","CSE322","CSE313","CSE313L","CSE312"};
                String[] subject_name = {"Database mangement System","Database managment system Lab","Computre Architecture and organization","Computer Network","Computer Network Lab","Numerical method"};
                for(i=0;i<subject_code.length;i++)
                {
                    model.insertRow(model.getRowCount(),new Object[]{subject_code[i],subject_name[i+1]});
                }
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_semesterActionPerformed

    private void course_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_course_tableMouseClicked
        try
        {
            int row = course_table.getSelectedRow();
            String string = (course_table.getModel().getValueAt(row,1).toString());
            course_name.setText(string);
        }catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_course_tableMouseClicked

    private void result1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result1ActionPerformed
        get_result();
    }//GEN-LAST:event_result1ActionPerformed
    private void get_result()
    {
        String id="";
        Connection con=null;
        String email = log_in_page.return_email();
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment","root","root");
            PreparedStatement ps = con.prepareCall("SELECT `id` from student_table WHERE email=?");
            ps.setString(1,email);
            ResultSet rs = ps.executeQuery();         
            while(rs.next())
            {
                id = rs.getString("id");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try
        {
             DefaultTableModel model = (DefaultTableModel) result_table.getModel();
            double quiz,mid,Final,lab,ass,pre,att,sum,quiz1,quiz2,quiz3;
            String sub;
            String string="";
            PreparedStatement ps = con.prepareStatement("SELECT `subject`, `quiz`, `midterm`, `final`,`lab`, `assignment`, `presentation`, `attendance`, `quiz1`, `quiz2`, `quiz3` FROM `mark_table` WHERE id=? and semester=?");
            ps.setString(1,id);
            ps.setString(2,combo_text);
            ResultSet rs = ps.executeQuery();        
            int i;
            while(rs.next())
            {
                sub = rs.getString("subject");
                quiz = rs.getDouble("quiz");
                mid = rs.getDouble("midterm");
                Final = rs.getDouble("final");
                lab = rs.getDouble("lab");
                ass = rs.getDouble("assignment");
                pre = rs.getDouble("presentation");
                att = rs.getDouble("attendance");
                quiz1 = rs.getDouble("quiz1");
                quiz2 = rs.getDouble("quiz2");
                quiz3 = rs.getDouble("quiz3");
                model.insertRow(result_table.getRowCount(),new Object[]{sub,quiz1,quiz2,quiz3,quiz,mid,Final,lab,ass,pre,att});          
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
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
            java.util.logging.Logger.getLogger(live_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(live_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(live_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(live_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new live_result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_profile;
    private javax.swing.JButton course;
    private javax.swing.JTextField course_name;
    private javax.swing.JTable course_table;
    private javax.swing.JButton home;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton live_result;
    private javax.swing.JButton logout;
    private javax.swing.JButton result;
    private javax.swing.JButton result1;
    private javax.swing.JTable result_table;
    private javax.swing.JComboBox<String> semester;
    // End of variables declaration//GEN-END:variables
}
