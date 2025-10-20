import org.junit.Test;
import service.TestManager;
import java.io.IOException;
import static org.junit.Assert.*;

public class TestManagerTest {
    @Test
    public void testLoadAndExecute() throws IOException {
        TestManager manager = new TestManager();
        manager.loadTestCases("testcases.csv");
        manager.executeTests();
        assertEquals("PASS", manager.getTestCases().get(0).getStatus());
    }
}
