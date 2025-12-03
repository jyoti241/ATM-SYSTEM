package atm.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database{
    Connection connection;
    Statement statement
    public Database(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsysm", "root", "jyoti2412");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
