package za.ac.mycput.repository;
/*Author Oupa Brian Ramoroka
   Student Number: 221013962
 * Date: 26 march 2024  */

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.mycput.domain.Manager;
import za.ac.mycput.factory.ManagerFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ManagerRepositoryTest {
    private static final IManagerRepository repository = ManagerRepository.getRepository();

    private final Manager manager = ManagerFactory.buildManager("0118", "Neo", "08912", "Neo@srig.ac.za");

    @Order(1)
    void create() {
        Manager managerCreated = repository.create(manager);
        assertNotNull(managerCreated);
        System.out.println("Reservation:" + managerCreated);
    }

    @Order(2)
    void read() {
        Manager readManager = repository.read(manager.getStaffNo());
        assertNotNull(readManager);
        System.out.println("Reservation:" + readManager);
    }

    @Order(3)
    void update() {
        Manager newManager = new Manager.ManagerBuilder().copy(manager).setName("Angel").build();
        Manager updatedManagerDetails = repository.update(newManager);
        assertNotNull(updatedManagerDetails);
        System.out.println("Reservation updated:" + updatedManagerDetails);
    }

    @Order(4)
    void delete() {
        assertTrue(repository.delete(manager.getStaffNo()));
        System.out.println("Manager deleted successfully");
    }

    @Order(5)
    @Test

    public void getall() {
    }
}