
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class mark_database 
{
    public void Input_Mark(String id,String semister,String subject,double quiz,double midterm,double Final,double quiz1,double quiz2,double quiz3,double lab,double assignment,double presentation,double attendance)
    {
        try
        {
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment","root","root");
           PreparedStatement ps = conn.prepareStatement("insert into mark_table values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
           ps.setString(1,id);
           ps.setString(2,semister);
           ps.setString(3,subject);
           ps.setDouble(4, quiz);
           ps.setDouble(5,midterm);
           ps.setDouble(6,Final);
           ps.setDouble(7,quiz1);
           ps.setDouble(8,quiz2);
           ps.setDouble(9,quiz3);
           ps.setDouble(10,lab);
           ps.setDouble(11,assignment);
           ps.setDouble(12,presentation);
           ps.setDouble(13,attendance);
           
           ps.executeUpdate();
           
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }  
}
