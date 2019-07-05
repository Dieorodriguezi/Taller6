import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestTaller6 {
    
    public TestTaller6() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test(timeout = 2500)
    public void hilotest(){
        Taller6.hilolargo();
        System.out.println("Test Correcto");
    }

    @Test(expected = ArithmeticException.class)
    public void divtest(){
        Taller6.div(3,0);
    }

}