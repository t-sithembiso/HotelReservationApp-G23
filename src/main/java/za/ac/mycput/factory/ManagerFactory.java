package za.ac.mycput.factory;
/*Author Oupa Brian Ramoroka
   Student Number: 221013962
 * Date: 26 march 2024
 https://github.com/Brian-obr/HotelReservationApp-G23*/

import za.ac.mycput.domain.Manager;
import za.ac.mycput.util.Helper;

public interface ManagerFactory {
    static Manager buildManager(String staffNo, String name, String phoneNo, String email) {

        if (Helper.isNullorEmpty(staffNo) || Helper.isNullorEmpty(name)
                || Helper.isNullorEmpty(phoneNo) || Helper.isNullorEmpty(email))
            return null;

        return new Manager.ManagerBuilder().setStaffNo(staffNo)
                .setName(name)
                .setPhoneNo(phoneNo)
                .setEmail(email)
                .build();
    }

    static Manager buildManager(String name, String phoneNo, String email) {
        if (Helper.isNullorEmpty(name) || Helper.isNullorEmpty(phoneNo)
                || Helper.isNullorEmpty(email))
            return null;

        String staffNo = Helper.generateStaffNo();
        return new Manager.ManagerBuilder().setStaffNo(staffNo)
                .setName(name)
                .setPhoneNo(phoneNo)
                .setEmail(email)
                .build();
    }
}
