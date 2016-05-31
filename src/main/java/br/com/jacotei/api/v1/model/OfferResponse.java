package br.com.jacotei.api.v1.model;

import java.util.*;
import br.com.jacotei.api.v1.model.OfferRejected;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A resposta para uma requisiÃ§Ã£o de atualizaÃ§Ã£o de ofertas.
 **/
public class OfferResponse  {
	
	
	private Long acceptedOffersCount = null;
	private Long totalOffersCount = null;
	private List<OfferRejected> offersRejected = new ArrayList<OfferRejected>() ;

	
	/**
	 * quantidade de ofertas aceitas
	 **/
	@JsonProperty("acceptedOffersCount")
	public Long getAcceptedOffersCount() {
		return acceptedOffersCount;
	}
	
	public void setAcceptedOffersCount(Long acceptedOffersCount) {
		this.acceptedOffersCount = acceptedOffersCount;
	}
	
	/**
	 * quantidade total de ofertas enviadas
	 **/
	@JsonProperty("totalOffersCount")
	public Long getTotalOffersCount() {
		return totalOffersCount;
	}
	
	public void setTotalOffersCount(Long totalOffersCount) {
		this.totalOffersCount = totalOffersCount;
	}
	
	/**
	 * lista de ofertas rejeitadas
	 **/
	@JsonProperty("offersRejected")
	public List<OfferRejected> getOffersRejected() {
		return offersRejected;
	}
	
	public void setOffersRejected(List<OfferRejected> offersRejected) {
		this.offersRejected = offersRejected;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class OfferResponse {\n");
		
		sb.append("  acceptedOffersCount: ").append(acceptedOffersCount).append("\n");
		sb.append("  totalOffersCount: ").append(totalOffersCount).append("\n");
		sb.append("  offersRejected: ").append(offersRejected).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
