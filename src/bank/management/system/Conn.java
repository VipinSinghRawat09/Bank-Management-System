
package bank.management.system;

import java.sql.*;
public class Conn {
Connection c;
Statement s;
public Conn(){
    try{

        c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem05", "root", "Vipin@tg2831");
        s = c.createStatement();

    }catch(Exception e){
        System.out.println(e);
    }
}

} 