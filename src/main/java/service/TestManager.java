package service;

import model.TestCase;
import java.io.*;
import java.util.*;

public class TestManager {
    private List<TestCase> testCases = new ArrayList<>();

    public void loadTestCases(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 3)
                testCases.add(new TestCase(parts[0], parts[1], parts[2]));
        }
        br.close();
    }

    public void executeTests() {
        for (TestCase t : testCases) {
            String actual = t.getExpected().equalsIgnoreCase("PASS") ? "PASS" : "FAIL";
            t.setActual(actual);
            t.setStatus(actual.equals(t.getExpected()) ? "PASS" : "FAIL");
        }
    }

    public List<TestCase> getTestCases() {
        return testCases;
    }
}
