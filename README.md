# jacotei-api-sdk-java
SDK para acesso da API de publicação JáCotei


## Instalando o Pacote ##

Execute o seguinte comando no diretório do sdk para instalar a SDK java no repositório local:

```
mvn clean compile install
```

Depois você já pode utilizá-la no seu projeto maven:
``` 
<dependency>
    <groupId>br.com.jacotei</groupId>
    <artifactId>sdk-api-v1-jacotei</artifactId>
    <version>1.0.0</version>
</dependency>
```

Ou Gradle:
```
compile 'br.com.jacotei:sdk-api-v1-jacotei:1.0.0'
```


### Exemplos ###

Envio de 1000 ofertas:
```Java
import br.com.jacotei.api.v1.OffersApi;
import br.com.jacotei.api.v1.client.ApiClient;
import br.com.jacotei.api.v1.client.ApiException;
import br.com.jacotei.api.v1.client.auth.ApiKeyAuth;
import br.com.jacotei.api.v1.model.Offer;
import br.com.jacotei.api.v1.model.OfferPrice;
import br.com.jacotei.api.v1.model.OfferRequest;
import br.com.jacotei.api.v1.model.OfferResponse;

import java.util.ArrayList;
import java.util.List;

public class OfertasPost {
    public static void main (String[] args){
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("https://webapisb.jacotei.com.br/publisher/v1"); // Sandbox
        //apiClient.setBasePath("https://webapi.jacotei.com.br/publisher/v1"); // Producao

        apiClient.setDebugging(true);

        // Alterar a chave informada com o valor de client_id da sua APP
        ((ApiKeyAuth)apiClient.getAuthentication("client_id")).setApiKey("xxxx");

        // Alterar a chave informada com o valor de access_token disponível
        ((ApiKeyAuth)apiClient.getAuthentication("access_token")).setApiKey("xxxx");

        OffersApi offersApi = new OffersApi(apiClient);

        List<Offer> offerList = new ArrayList<Offer>();

        for(int i = 0; i < 1000; i++){
            String sku = String.format("%s", i);
            Offer offer = new Offer();
            offer.setAvailable(true);
            offer.setSku(sku);
            offer.setTitle("Oferta "+sku);
            offer.setLink("http://foo.com/"+sku);

            List<OfferPrice> offerPrices = new ArrayList<OfferPrice>();
            OfferPrice offerPrice = new OfferPrice();
            offerPrice.setPrice(1.99);
            offerPrice.setInstallment(1);
            offerPrice.setInstallmentValue(1.99);
            offerPrices.add(offerPrice);

            List<String> images = new ArrayList<String>();
            images.add("http://foo.com/"+sku+".jpg");

            offer.setImages(images);
            offer.setPrices(offerPrices);
            offerList.add(offer);
        }

        OfferRequest offerRequest = new OfferRequest();
        offerRequest.setOffers(offerList);

        try {
            OfferResponse offerResponse = offersApi.updateOffersUsingPOST(offerRequest);
            System.out.println(offerResponse);
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```
