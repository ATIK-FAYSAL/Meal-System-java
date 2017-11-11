
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.*;

public class teacher_information {
    public boolean save_teacher_information(String name,String id,String email,String password,String picture)
    {
        boolean flag = true;
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment","root","root");
            PreparedStatement ps = con.prepareStatement("insert into teacher_table values(?,?,?,?,?)");
            InputStream is = new FileInputStream(new File(picture));
            ps.setString(1,name);
            ps.setString(2,id);
            ps.setString(3,email);
            ps.setString(4,password);
            ps.setBlob(5,is);       
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            flag = false;
            System.out.println(e.toString());
        }
        if(flag ==true)return true;
        else return false;
    }
    public boolean log_in(String email,String pass)
    {
        String Email=null,Pass=null;
        try
        {
            Connection con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment","root","root");
            PreparedStatement ps = con.prepareCall("SELECT `email`, `password` from teacher_table WHERE email=?");
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
}
