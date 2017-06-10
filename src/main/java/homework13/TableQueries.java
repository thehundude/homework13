package homework13;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by tamas on 2017. 06. 10..
 */
public class TableQueries {
    // ez a metódus 2 oszlopot fog létrehozni
    public static void createTable(String tableName, String column1Name, String column1DataType, String column1Constraint,
                                   String column2Name, String column2DataType, String column2Constraint) {
        Connection connection = DbUtil.getConnection();

        try {
            Statement statement = connection.createStatement();

            statement.executeUpdate("CREATE TABLE " + tableName + " (" + column1Name + " " + column1DataType + " " +
            column1Constraint + ", " + column2Name + " " +column2DataType + " " + column2Constraint + ");");

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // rekord törlése
    public static void deleteRecord(String tableName, String deleteCondition) {
        Connection connection = DbUtil.getConnection();

        try {
            Statement statement = connection.createStatement();

            statement.executeUpdate("DELETE FROM " + tableName + " WHERE " + deleteCondition);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ha az egész táblát szeretnénk törölni
    public static void deleteRecord(String tableName) {
        Connection connection = DbUtil.getConnection();

        try {
            Statement statement = connection.createStatement();

            statement.executeUpdate("DELETE FROM " + tableName);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
