
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Repository {

    Statement stmt;
    ResultSet result;

    public Repository(Statement stmt) {
        this.stmt = stmt;
        this.result = null;
    }

    public ResultSet requete(Connection conn, String req) {
        try {
            this.stmt = (Statement) conn.createStatement();
            this.result = stmt.executeQuery(req) ;
        }
        catch(Exception e){
            //Traitement erreur
        }
        return this.result;
    }

}