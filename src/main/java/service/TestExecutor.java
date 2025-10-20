package service;

import model.TestCase;

public class TestExecutor {

    public static String runTest(TestCase test) {
        switch (test.getId()) {
            case "TC01":
                return verifyLogin();
            case "TC02":
                return validateErrorMessage();
            case "TC03":
                return checkHomePageLoad();
            default:
                return "UNKNOWN";
        }
    }

    private static String verifyLogin() {
        // Mock test logic
        boolean success = true;
        return success ? "PASS" : "FAIL";
    }

    private static String validateErrorMessage() {
        boolean success = false;
        return success ? "PASS" : "FAIL";
    }

    private static String checkHomePageLoad() {
        boolean success = true;
        return success ? "PASS" : "FAIL";
    }
}
