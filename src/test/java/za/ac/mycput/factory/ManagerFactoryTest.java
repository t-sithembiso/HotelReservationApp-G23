package za.ac.mycput.factory;
/*Author Oupa Brian Ramoroka
   Student Number: 221013962
 * Date: 26 march 2024  */

import org.junit.jupiter.api.Test;
import za.ac.mycput.domain.Manager;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ManagerFactoryTest {

    void testBuildManager() {
        Manager man = ManagerFactory.buildManager("0198", "Brian", "0813798635", "22101@mycput.ac.za");
        assertNotNull(man);
        System.out.println(man);
    }

    @Test
    void testBuildManagerFail() {
        Manager man = ManagerFactory.buildManager("", "", "", "");
        assertNotNull(man);
        System.out.println(man);
    }
}