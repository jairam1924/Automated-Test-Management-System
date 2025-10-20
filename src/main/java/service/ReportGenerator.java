package service;

import model.TestCase;
import java.io.*;
import java.util.*;

public class ReportGenerator {
   public void generateHTMLReport(List<TestCase> testCases, String fileName) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
    int pass = 0, fail = 0;

    bw.write("<html><head><title>Test Report</title></head><body>");
    bw.write("<h2>Automated Test Execution Report</h2>");
    bw.write("<table border='1' cellpadding='5'><tr><th>ID</th><th>Description</th><th>Expected</th><th>Actual</th><th>Status</th></tr>");

    for (TestCase t : testCases) {
        bw.write("<tr>");
        bw.write("<td>" + t.getId() + "</td>");
        bw.write("<td>" + t.getDescription() + "</td>");
        bw.write("<td>" + t.getExpected() + "</td>");
        bw.write("<td>" + t.getActual() + "</td>");
        bw.write("<td style='color:" + (t.getStatus().equals("PASS") ? "green" : "red") + "'>" + t.getStatus() + "</td>");
        bw.write("</tr>");
        if (t.getStatus().equals("PASS")) pass++; else fail++;
    }

    bw.write("</table>");
    bw.write("<p><b>Total:</b> " + testCases.size() + " | <b>Passed:</b> " + pass + " | <b>Failed:</b> " + fail + "</p>");
    bw.write("</body></html>");
    bw.close();
}

}
