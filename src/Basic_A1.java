import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Basic_A1 {

    public static void main(String[] args) {

        try {

            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}