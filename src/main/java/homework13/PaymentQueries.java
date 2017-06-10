package homework13;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by tamas on 2017. 06. 10..
 */
public class PaymentQueries {
    public static void paymentQuery(String column) {
        Connection connection = DbUtil.getConnection();

        ArrayList<String> queryResult = new ArrayList();

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT " + column + " FROM payment");

            // megnézi, hogy a payment tábla lehetséges oszlopai közül melyiket kérdezzük le, és aszerint íratja ki az
            // eredményt a resultSet-ből
            if (column.equals("amount")) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getDouble(column));
                }

            } else if (column.equals("payment_date")) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getString(column));
                }

            } else {
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(column));
                }

            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
