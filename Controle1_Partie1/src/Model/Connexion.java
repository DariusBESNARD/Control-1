package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Connexion {

    public static Connection getConnexion(String url, Properties props) {
        try {
            Class.forName("com.mysql.jdbc.Driver") ;
        }
        catch (ClassNotFoundException e){
            System.out.println("Erreur lors du chargement "+e.getMessage()) ;
        }

        Connection objConn = null ;

        try {
            objConn = DriverManager.getConnection(url,props) ;
        }
        catch (SQLException e) {
            // Traitement des exceptions
        }
        return objConn;
    }
}
