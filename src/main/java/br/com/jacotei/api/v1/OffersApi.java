package br.com.jacotei.api.v1;

import br.com.jacotei.api.v1.client.ApiException;
import br.com.jacotei.api.v1.client.ApiClient;
import br.com.jacotei.api.v1.client.Configuration;

import br.com.jacotei.api.v1.model.*;

import java.util.*;

import br.com.jacotei.api.v1.model.OfferResponse;
import br.com.jacotei.api.v1.model.OfferRequest;
import br.com.jacotei.api.v1.model.Offer;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class OffersApi {

	private ApiClient apiClient;

	public OffersApi() {
		this(Configuration.getDefaultApiClient());
	}

	public OffersApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	
	/**
	 * MÃ©todo de atualizaÃ§Ã£o de ofertas
	 * 
	 * @param offers offerUpdateRequest
	 * @return OfferResponse
	 */
	public OfferResponse updateOffersUsingPOST (OfferRequest offers) throws ApiException {
		
		Object postBody = offers;
		
		// verify the required parameter 'offers' is set
		if (offers == null) {
			throw new ApiException(400, "Missing the required parameter 'offers' when calling updateOffersUsingPOST");
		}
		

		// create path and map variables
		String path = "/offers".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		

		

		final String[] accepts = {
			"application/json"
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			"application/json"
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] { "client_id", "access_token" };
			String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (OfferResponse) apiClient.deserialize(response, "", OfferResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta de ofertas por sku
	 * 
	 * @param sku sku
	 * @return Offer
	 */
	public Offer getOfferUsingGET (String sku) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'sku' is set
		if (sku == null) {
			throw new ApiException(400, "Missing the required parameter 'sku' when calling getOfferUsingGET");
		}
		

		// create path and map variables
		String path = "/offers/{sku}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		

		

		final String[] accepts = {
			"application/json"
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] { "client_id", "access_token" };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (Offer) apiClient.deserialize(response, "", Offer.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
}
