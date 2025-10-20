# Automated Test Management System

### 🧠 Problem
Manual test case tracking often leads to missed test results, inconsistent reporting, and limited visibility of pass/fail status across builds.

### 💡 Solution
Developed a Java-based Automated Test Management System that reads test cases from CSV files, executes simulated test runs, and generates structured HTML test reports.
This system improves testing efficiency and transparency by automatically calculating results and producing well-formatted summaries.

### 🎯 Objective
A simple Java-based framework to manage and execute test cases, then generate formatted reports automatically.

### ⚙️ Tech Stack
- Java 11.0.14.1
- File I/O (BufferedReader/Writer)
- OOP Design
- Collections
- JUnit 4.13.2
- Maven 

### 📁 Features
-📄 Import test cases from CSV
-🧪 Manage and simulate test executions
-📊 Auto-generate HTML test reports summarizing results
-✅ Integrated with JUnit for unit testing
-🧰 Built with Maven for dependency management and build automation

### 🚀 Run
```bash
mvn clean test
mvn exec:java -Dexec.mainClass="Main"
```

### Sample Output Report
<img width="1005" height="544" alt="Screenshot 2025-10-20 103958" src="https://github.com/user-attachments/assets/b44941bc-dacf-4f8c-a764-6e801e58b73d" />
