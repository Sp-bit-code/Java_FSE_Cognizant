public class MyService {


    private ExternalApi externalApi;


    // Constructor injection
    public MyService(ExternalApi externalApi) {

        this.externalApi = externalApi;

    }


    // Method under test
    public String fetchData() {

        return externalApi.getData();

    }


}
