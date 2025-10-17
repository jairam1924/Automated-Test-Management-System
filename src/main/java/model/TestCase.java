package model;

public class TestCase {
    private String id;
    private String description;
    private String expected;
    private String actual;
    private String status;

    public TestCase(String id, String description, String expected) {
        this.id = id;
        this.description = description;
        this.expected = expected;
    }

    public String getId() { return id; }
    public String getDescription() { return description; }
    public String getExpected() { return expected; }
    public String getActual() { return actual; }
    public String getStatus() { return status; }

    public void setActual(String actual) { this.actual = actual; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return id + "," + description + "," + expected + "," + actual + "," + status;
    }
}
