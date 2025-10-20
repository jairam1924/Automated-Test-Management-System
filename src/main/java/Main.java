import model.TestCase;
import service.TestManager;
import service.ReportGenerator;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        TestManager manager = new TestManager();
        manager.loadTestCases("testcases.csv");
        manager.executeTests();

        ReportGenerator generator = new ReportGenerator();
        generator.generateHTMLReport(manager.getTestCases(), "test_reports/test-report.html");

        System.out.println("✅ Test execution complete. Report generated: test-report.html");
    }
}
