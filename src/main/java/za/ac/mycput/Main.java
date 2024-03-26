package za.ac.mycput;
import za.ac.mycput.domain.Manager;
import za.ac.mycput.domain.Reservation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Reservation reserve= new Reservation.Builder().setReservationID("22104")
                .setStartDate("12 march")
                .setEndDate("14 march")
                .setRoomNumber(121)
                .build();
        System.out.println(reserve.toString());

        Manager man = new Manager.ManagerBuilder().setStaffNo("123")
                .setName("Tebogo")
                .setPhoneNo("0813798635")
                .setEmail("221013962@mycput.ac.za")
                .build();
        System.out.println(man);

        }
    }
