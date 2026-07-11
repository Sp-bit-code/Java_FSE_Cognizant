public class MyService {


    private ExternalApi externalApi;


    // Constructor injection
    public MyService(ExternalApi externalApi) {

        this.externalApi = externalApi;

    }


    // This method calls external API
    public String fetchData() {

        return externalApi.getData();

    }


}
