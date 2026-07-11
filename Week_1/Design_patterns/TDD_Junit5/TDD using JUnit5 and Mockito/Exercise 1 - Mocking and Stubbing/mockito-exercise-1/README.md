# Mockito Exercise 1: Mocking and Stubbing

## Scenario

We need to test a service that depends on an external API.

Instead of calling the real external API, we create a mock object using Mockito.

---

## Files

ExternalApi.java

MyService.java

MyServiceTest.java

---

## Mockito Concepts Used

Mockito.mock()

when()

thenReturn()

---

## Test Logic

1. Create mock object for ExternalApi.
2. Stub mockApi.getData().
3. Return predefined value "Mock Data".
4. Call service.fetchData().
5. Check result using assertEquals().

---

## Run Command

mvn test

---

## Expected Result

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

BUILD SUCCESS
