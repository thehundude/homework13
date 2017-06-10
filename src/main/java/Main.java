import homework13.PaymentQueries;
import homework13.TableQueries;

/**
 * Created by tamas on 2017. 06. 10..
 */
public class Main {
    public static void main(String[] args) {
        // PaymentQueries.paymentQuery("amount");
        /* TableQueries.createTable("test_table", "test_column", "int", "NOT NULL",
                "another_test_column", "text", ""); */
        TableQueries.deleteRecord("test_table", "test_column = 1");
    }
}
