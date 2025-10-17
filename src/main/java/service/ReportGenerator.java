package service;

import model.TestCase;
import java.io.*;
import java.util.*;

public class ReportGenerator {
    public void generateReport(List<TestCase> testCases, String fileName) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int pass = 0, fail = 0;

        bw.write("===== TEST EXECUTION REPORT =====\n");
        bw.write(String.format("%-10s %-25s %-10s %-10s %-10s\n", 
                "ID", "Description", "Expected", "Actual", "Status"));
        bw.write("-------------------------------------------------------------\n");

        for (TestCase t : testCases) {
            bw.write(String.format("%-10s %-25s %-10s %-10s %-10s\n",
                    t.getId(), t.getDescription(), t.getExpected(), t.getActual(), t.getStatus()));
            if (t.getStatus().equals("PASS")) pass++; else fail++;
        }

        bw.write("\nSummary:\n");
        bw.write("Total: " + testCases.size() + ", Passed: " + pass + ", Failed: " + fail);
        bw.close();
    }
}
