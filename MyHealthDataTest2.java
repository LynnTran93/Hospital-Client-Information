package HealthData;
/**
 * imports static members
 */
import static org.junit.jupiter.api.Assertions.*;

/**
 * imports classes
 */
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * class MyHealthDataTest2
 */
class MyHealthDataTest2 {
    
    private static final double EPSILON = 1E-12;
    
    /**
     * instant variable
     */
    private MyHealthData aHealthData;

    /**
     * method will be executed before
     * @throws Exception
     */
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    /**
     * method will be executed after
     * @throws Exception
     */
    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    /**
     * executed before each test method
     * @throws Exception
     */
    @BeforeEach
    void setUp() throws Exception {
        // Instantiate MyHealthData object before each test
        aHealthData = new MyHealthData("Emmanuel", "Hermanez", "Male", 1989, 2024, 68, 180);
    }

    /**
     * executed after each test method
     * @throws Exception
     */
    @AfterEach
    void tearDown() throws Exception {
    }

    /**
     * tests BMI calculation with information from setUp and rounds to 2 decimal
     * places
     */
    @Test
    void testCalculateBMI() {
        double expectedBMI = 27.37;
        double calculatedBMI = aHealthData.calculateBMI();
        double roundedCalculatedBMI = Math.round(calculatedBMI * 100.0) / 100.0; 
        assertEquals(expectedBMI, roundedCalculatedBMI, EPSILON);
    }
}
