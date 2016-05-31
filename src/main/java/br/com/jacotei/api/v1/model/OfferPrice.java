package br.com.jacotei.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Um preÃ§o de uma oferta.
 **/
public class OfferPrice  {
	
	
	private Integer installment = null;
	private Double installmentValue = null;
	private Double price = null;
	private String type = null;

	
	/**
	 * Quantidade de parcelas
	 **/
	@JsonProperty("installment")
	public Integer getInstallment() {
		return installment;
	}
	
	public void setInstallment(Integer installment) {
		this.installment = installment;
	}
	
	/**
	 * valor de cada parcela
	 **/
	@JsonProperty("installmentValue")
	public Double getInstallmentValue() {
		return installmentValue;
	}
	
	public void setInstallmentValue(Double installmentValue) {
		this.installmentValue = installmentValue;
	}
	
	/**
	 * preÃ§o total do produto
	 **/
	@JsonProperty("price")
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	/**
	 * Forma de pagamento
	 **/
	@JsonProperty("type")
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class OfferPrice {\n");
		
		sb.append("  installment: ").append(installment).append("\n");
		sb.append("  installmentValue: ").append(installmentValue).append("\n");
		sb.append("  price: ").append(price).append("\n");
		sb.append("  type: ").append(type).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
