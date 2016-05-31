package br.com.jacotei.api.v1.model;

import java.util.*;
import br.com.jacotei.api.v1.model.Offer;
import br.com.jacotei.api.v1.model.Error;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * O resultado de uma validaÃ§Ã£o de oferta.
 **/
public class OfferRejected  {
	
	
	private Offer offer = null;
	private List<Error> validationErrors = new ArrayList<Error>() ;

	
	/**
	 **/
	@JsonProperty("offer")
	public Offer getOffer() {
		return offer;
	}
	
	public void setOffer(Offer offer) {
		this.offer = offer;
	}
	
	/**
	 **/
	@JsonProperty("validationErrors")
	public List<Error> getValidationErrors() {
		return validationErrors;
	}
	
	public void setValidationErrors(List<Error> validationErrors) {
		this.validationErrors = validationErrors;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class OfferRejected {\n");
		
		sb.append("  offer: ").append(offer).append("\n");
		sb.append("  validationErrors: ").append(validationErrors).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
