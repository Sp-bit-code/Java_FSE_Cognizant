import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Test;

import org.mockito.Mockito;


public class MyServiceTest {


    @Test
    public void testExternalApi() {


        // 1. Create mock object for ExternalApi
        ExternalApi mockApi =
                Mockito.mock(ExternalApi.class);


        // 2. Stub the method
        // When getData() is called, return "Mock Data"
        when(
                mockApi.getData()
        ).thenReturn(
                "Mock Data"
        );


        // 3. Pass mock object to MyService
        MyService service =
                new MyService(mockApi);


        // 4. Call the service method
        String result =
                service.fetchData();


        // 5. Check expected result
        assertEquals(
                "Mock Data",
                result
        );


    }


}
