
import javax.swing.table.DefaultTableModel;


public class course extends javax.swing.JFrame {
    String profile,combo_text;
    public course() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        live_result = new javax.swing.JButton();
        result = new javax.swing.JButton();
        course = new javax.swing.JButton();
        combo_profile = new javax.swing.JComboBox<>();
        logout = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        course_table = new javax.swing.JTable();
        semester = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        live_result.setBackground(new java.awt.Color(51, 51, 51));
        live_result.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        live_result.setForeground(new java.awt.Color(204, 204, 204));
        live_result.setText("Live Result");
        live_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                live_resultActionPerformed(evt);
            }
        });

        result.setBackground(new java.awt.Color(51, 51, 51));
        result.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        result.setForeground(new java.awt.Color(204, 204, 204));
        result.setText("Result");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

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

        course_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(course_table);

        semester.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Semester", "Spring 2016", "Summer 2016", "Fall 2016", "Spring 2017", "Summer 2017" }));
        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(live_result, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGap(18, 18, 18)
                .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void live_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_live_resultActionPerformed
        live_result live = new live_result();
        live.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_live_resultActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        result res =  new result();
        res.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_resultActionPerformed

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

    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_profile;
    private javax.swing.JButton course;
    private javax.swing.JTable course_table;
    private javax.swing.JButton home;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton live_result;
    private javax.swing.JButton logout;
    private javax.swing.JButton result;
    private javax.swing.JComboBox<String> semester;
    // End of variables declaration//GEN-END:variables
}
