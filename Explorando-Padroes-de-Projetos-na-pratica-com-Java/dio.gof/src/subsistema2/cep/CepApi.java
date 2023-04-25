package subsistema2.cep;

public class CepApi {
    private static CepApi cepApi = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return cepApi;
    }

    public String recuperarCidade(String cep){
        return "Curitiba";
    }

    public String recuperarEstado(String cep){
        return "PR";
    }
}
