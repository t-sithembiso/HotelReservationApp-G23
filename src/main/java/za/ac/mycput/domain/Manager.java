package za.ac.mycput.domain;
/*Author Oupa Brian Ramoroka
   Student Number: 221013962
 * Date: 26 march 2024  */

import java.util.Objects;

public class Manager {
    private final String staffNo;
    private final String name;
    private final String phoneNo;
    private final String email;


    private Manager(ManagerBuilder managerBuilder) {
        this.staffNo = managerBuilder.staffNo;
        this.name = managerBuilder.name;
        this.phoneNo = managerBuilder.phoneNo;
        this.email = managerBuilder.email;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager manager)) return false;
        return Objects.equals(staffNo, manager.staffNo) && Objects.equals(name, manager.name) && Objects.equals(phoneNo, manager.phoneNo) && Objects.equals(email, manager.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffNo, name, phoneNo, email);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "staffNo='" + staffNo + '\'' +
                ", name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class ManagerBuilder {
        private String staffNo;
        private String name;
        private String phoneNo;
        private String email;

        public ManagerBuilder() {
            this.staffNo = staffNo;
            this.name = name;
            this.staffNo = staffNo;
            this.name = name;

        }


        public ManagerBuilder setStaffNo(String staffNo) {
            this.staffNo = staffNo;
            return this;
        }

        public ManagerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ManagerBuilder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public ManagerBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Manager.ManagerBuilder copy(Manager manager) {
            this.staffNo = manager.staffNo;
            this.name = manager.name;
            this.phoneNo = manager.phoneNo;
            this.email = manager.email;
            return this;
        }

        public Manager build() {
            return new Manager(this);
        }
    }

}

