import static org.mockito.Mockito.verify;


import org.junit.jupiter.api.Test;

import org.mockito.Mockito;


public class MyServiceTest {


    @Test
    public void testVerifyInteraction() {


        // 1. Create mock object
        ExternalApi mockApi =
                Mockito.mock(ExternalApi.class);


        // 2. Pass mock object to service
        MyService service =
                new MyService(mockApi);


        // 3. Call service method
        service.fetchData();


        // 4. Verify that getData() method was called
        verify(mockApi).getData();


    }


}
