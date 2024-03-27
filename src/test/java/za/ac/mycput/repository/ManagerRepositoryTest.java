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
    @Test
    public void create() {
        Manager newManager = repository.create(manager);
        assertNotNull(newManager);
        System.out.println("Manager :" + newManager);
    }

    @Order(2)
    @Test
    public void read() {
        Manager viewManager = repository.read(manager.getStaffNo());
        assertNotNull(viewManager);
        System.out.println("Manager:" + viewManager);
    }

    @Order(3)
    @Test
    public void update() {
        Manager updateManager = new Manager.ManagerBuilder().copy(manager).setName("Angel").build();
        Manager updatedManagerDetails = repository.update(updateManager);
        assertNotNull(updatedManagerDetails);
        System.out.println("Manager updated list:" + updatedManagerDetails);
    }

    @Order(4)
    @Test
    public void delete() {
        assertTrue(repository.delete(manager.getStaffNo()));
        System.out.println("Manager deleted successfully");
    }

    @Order(5)
    @Test

    public void getall() {
        System.out.println(repository.getall());
    }
}