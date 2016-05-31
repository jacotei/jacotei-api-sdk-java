package br.com.jacotei.api.v1.model;

import java.util.*;
import br.com.jacotei.api.v1.model.Offer;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Uma requisiÃ§Ã£o para atualizaÃ§Ã£o de ofertas.
 **/
public class OfferRequest  {
	
	
	private List<Offer> offers = new ArrayList<Offer>() ;

	
	/**
	 * offers
	 **/
	@JsonProperty("offers")
	public List<Offer> getOffers() {
		return offers;
	}
	
	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class OfferRequest {\n");
		
		sb.append("  offers: ").append(offers).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
