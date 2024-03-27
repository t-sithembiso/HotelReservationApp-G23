package za.ac.mycput.util;
import java.util.UUID;
/*Author Thalitha Sithembiso-221123598 (Team lead)
Sibusiso Kubalo 218316038
 * Date: 21 march 2024  */

public class Helper {
    public static boolean isNullorEmpty(String st){
        if(st==null|| st.isEmpty())
            return true;
            return false;




    }    public static String generateReservationId(){
        return UUID.randomUUID().toString();

    }

    public static String generatePaymentId() {
        return UUID.randomUUID().toString();
    }


    public static String generateStaffNo(){
        return UUID.randomUUID().toString();// Keeping the implementation from master

    }

}
