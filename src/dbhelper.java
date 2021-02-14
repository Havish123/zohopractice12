import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbhelper {
    public static void connection(){
        Statement stmt=null;
        Connection con=null;
        try {
            Class.forName("org.postgresql.Driver");
            con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres","10107");
            System.out.println("Open database successfully");
            stmt=con.createStatement();
            String sql=" CREATE TABLE USERDB(ID INT PRIMARY KEY NOT NULL" +
                    ",USERNAME TEXT NOT NULL,PASSWORD TEXT NOT NULL) ";
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Open da successfully");
    }

    public static void main(String[] args) {
        connection();
    }
}
