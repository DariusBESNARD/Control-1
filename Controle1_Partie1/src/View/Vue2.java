
package View;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Vue2{

    public void showView(ResultSet result) throws SQLException {


        try {
            System.out.println("Identifiants des bateaux pour lesquels aucun affrètement n’a été enregistré au" +
                    "mois de mars 2021.");

            while (result.next()) {
                //Traitement requête
                int prixunit = result.getInt(1);
                System.out.println(prixunit);
            }
        }
        catch(SQLException se) {
            se.getMessage();
        }
    }
}