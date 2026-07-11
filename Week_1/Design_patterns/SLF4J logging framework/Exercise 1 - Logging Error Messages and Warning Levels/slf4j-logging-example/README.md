# Exercise 1: Logging Error Messages and Warning Levels

## Task

Write a Java application that demonstrates logging error messages and warning levels using SLF4J.

---

## Dependencies Used

1. slf4j-api
2. logback-classic

---

## Java Class

LoggingExample.java

---

## Log Methods Used

logger.error("This is an error message");

logger.warn("This is a warning message");

---

## Run Command

mvn clean compile exec:java

---

## Expected Output

ERROR LoggingExample - This is an error message

WARN  LoggingExample - This is a warning message
