import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
public class connection {
    public Connection con = null;
    public void insert_student_value(String name,String id,String email,String password,String photo)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment","root","root");
            PreparedStatement ps = con.prepareStatement("insert into student_table values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            InputStream is = new FileInputStream(new File(photo));
            ps.setString(1, id);
            ps.setString(2,email);
            ps.setString(3,password);
            ps.setString(4,name);
            ps.setString(5,"");
            ps.setString(6,"");
            ps.setString(7,"");
            ps.setString(8,"");
            ps.setString(9,"");
            ps.setString(10,"");
            ps.setString(11,"");
            ps.setString(12,"");
            ps.setString(13,"");
            ps.setString(14,"");
            ps.setString(15,"");
            ps.setString(16,"");
            ps.setString(17,"");
            ps.setBlob(18,is);
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.toString());
        }
    }
    public boolean log_in(String email,String pass)
    {
        String Email=null,Pass=null;
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment","root","root");
            PreparedStatement ps = con.prepareCall("SELECT `email`, `password` from student_table WHERE email=?");
            ResultSet rs;
            ps.setString(1, email);
            rs = ps.executeQuery();
            while(rs.next())
            {
                Email = rs.getString("email");
                Pass  = rs.getString("password");
            }
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        if(Email.equals(email)&&Pass.equals(pass))return true;
        else return false;
    }
   
    public void edit_profile(String name,String dob,String pob,String gender,String status,String bd,String religion,String nationality,String nid,String network,String image_path)
    {
        String Email = log_in_page.return_email();
        System.out.println("Email is : "+Email);
       try
       {
           Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment","root","root");
          PreparedStatement ps1 = conn.prepareStatement("UPDATE `student_table` SET `name`=?,`dob`=?,`pob`=?,`gender`=?,`status`=?,`bd`=?,`religion`=?,`nationality`=?,`nid`=?,`social_network`=? WHERE `email`=?");
          ps1.setString(1,name);
          ps1.setString(2,dob);
          ps1.setString(3,pob);
          ps1.setString(4,gender);
          ps1.setString(5,status);
          ps1.setString(6,bd);
          ps1.setString(7,religion);
          ps1.setString(8,nationality);
          ps1.setString(9,nid);
          ps1.setString(10,network);
          ps1.setString(11,Email);
          ps1.executeUpdate();
          InputStream is = new FileInputStream(new File(image_path));
          //String query = "UPDATE `student_table` SET `name`='"+name+"',`dob`='"+dob+"',`pob`='"+pob+"',`gender`='"+gender+"',`status`='"+status+"',`bd`='"+bd+"',`religion`='"+religion+"',`nationality`='"+nationality+"',`nid`='"+nid+"',`social_network`='"+network+"'WHERE `email`='"+Email+"'";
          //String query = "UPDATE `student_table` SET `name`='"+name+"',`dob`='"+dob+"',`pob`='"+pob+"',`gender`='"+gender+"',`status`='"+status+"',`bd`='"+bd+"',`religion`='"+religion+"',`nationality`='"+nationality+"',`nid`='"+nid+"',`social_network`='"+network+"'WHERE `email`='"+Email+"'";
          PreparedStatement ps = conn.prepareStatement("UPDATE `student_table` SET picture=?  WHERE email=?");
          ps.setBlob(1,is);
          ps.setString(2,Email);
          ps.executeUpdate();
       }
       catch(SQLException e)
       {
           System.out.println(e.toString());
       }
       catch(FileNotFoundException e)
       {
           System.out.println(e.toString());
       }
       catch(Exception e)
       {
           System.out.println(e.toString());
       }
    }
    public boolean change_password(String pass,String new_pass)
    {
        String email = log_in_page.return_email();
        System.out.println("Email is : "+email);
        Connection conn =null;
        String password=null;
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment","root","root");
            PreparedStatement ps = conn.prepareStatement("SELECT `password` FROM `student_table` WHERE email=?");
            ps.setString(1,email);
            ResultSet rs = ps.executeQuery();      
            while(rs.next())password = rs.getString("password");
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        if(password.equals(pass))
        {
            try
            {
                PreparedStatement Ps = conn.prepareStatement("UPDATE `student_table` SET password=?  WHERE email=?");
                Ps.setString(1,new_pass);
                Ps.setString(2,email);
                Ps.executeUpdate();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
            return true;
        }
        else return false;
    }
    
}
