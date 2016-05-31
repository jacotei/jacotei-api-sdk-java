package br.com.jacotei.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * O resultado de uma validaÃ§Ã£o de oferta.
 **/
public class Error  {
	
	
	private Long code = null;
	private String message = null;

	
	/**
	 * Codigo do erro
	 **/
	@JsonProperty("code")
	public Long getCode() {
		return code;
	}
	
	public void setCode(Long code) {
		this.code = code;
	}
	
	/**
	 * Mensagem de erro
	 **/
	@JsonProperty("message")
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error {\n");
		
		sb.append("  code: ").append(code).append("\n");
		sb.append("  message: ").append(message).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
