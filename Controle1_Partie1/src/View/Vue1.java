
package View;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Vue1 {

    public float showView(ResultSet result) throws SQLException {
        float tarif=0;

        try {
            System.out.println("Chiffre d'affaire de l'affretement 459629 :");

            while (result.next()) {
                //Traitement requête
                tarif = result.getFloat(1);
                System.out.println(tarif);
            }
        }
        catch(SQLException se) {
            se.getMessage();
        }
        return tarif;
    }
}
