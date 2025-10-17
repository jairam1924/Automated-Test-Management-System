import model.TestCase;
import service.TestManager;
import service.ReportGenerator;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        TestManager manager = new TestManager();
        manager.loadTestCases("testcases.csv");
        manager.executeTests();

        ReportGenerator generator = new ReportGenerator();
        generator.generateReport(manager.getTestCases(), "test-report.txt");

        System.out.println("✅ Test execution complete. Report generated: test-report.txt");
    }
}
