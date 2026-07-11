# Mockito Exercise 2: Verifying Interactions

## Scenario

We need to ensure that a method is called during testing.

---

## Files

ExternalApi.java

MyService.java

MyServiceTest.java

---

## Mockito Concept Used

verify()

---

## Test Logic

1. Create mock object of ExternalApi.
2. Pass mock object to MyService.
3. Call service.fetchData().
4. Verify that mockApi.getData() was called.

---

## Main Verification Line

verify(mockApi).getData();

---

## Run Command

mvn test

---

## Expected Result

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

BUILD SUCCESS
