package za.ac.mycput.domain;

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
        private final String staffNo;
        private final String name;
        private String phoneNo;
        private String email;

        public ManagerBuilder(String staffNo, String name) {
            this.staffNo = staffNo;
            this.name = name;

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

        public ManagerBuilder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public ManagerBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Manager build() {
            return new Manager(this);
        }
    }

}

