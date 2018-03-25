package br.com.jacotei.api.v1.model;

import br.com.jacotei.api.v1.model.OfferPrice;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Uma oferta do Lojista
 **/
public class Offer  {
	
	
	private Boolean available = null;
	private String barcode = null;
	private List<String> images = new ArrayList<String>() ;
	private List<String> categories = new ArrayList<String>() ;
	private String isbn = null;
	private String link = null;
	private List<OfferPrice> prices = new ArrayList<OfferPrice>() ;
	private String sku = null;
	private String title = null;

	
	/**
	 * Produto disponÃ­vel
	 **/
	@JsonProperty("available")
	public Boolean getAvailable() {
		return available;
	}
	
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	/**
	 * cÃ³digo de barras do produto da oferta
	 **/
	@JsonProperty("barcode")
	public String getBarcode() {
		return barcode;
	}
	
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	/**
	 * Imagens dos produtos da oferta
	 **/
	@JsonProperty("images")
	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	/**
	 * Categorias dos produtos da oferta
	 **/
	@JsonProperty("categories")
	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	
	/**
	 * cÃ³digo de barras do livro
	 **/
	@JsonProperty("isbn")
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * link para a pÃ¡gina da oferta
	 **/
	@JsonProperty("link")
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	/**
	 * preÃ§os da oferta
	 **/
	@JsonProperty("prices")
	public List<OfferPrice> getPrices() {
		return prices;
	}
	
	public void setPrices(List<OfferPrice> prices) {
		this.prices = prices;
	}
	
	/**
	 * CÃ³digo de identificaÃ§Ã£o da oferta
	 **/
	@JsonProperty("sku")
	public String getSku() {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	/**
	 * DescriÃ§Ã£o da oferta
	 **/
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class Offer {\n");
		
		sb.append("  available: ").append(available).append("\n");
		sb.append("  barcode: ").append(barcode).append("\n");
		sb.append("  images: ").append(images).append("\n");
		sb.append("  categories: ").append(categories).append("\n");
		sb.append("  isbn: ").append(isbn).append("\n");
		sb.append("  link: ").append(link).append("\n");
		sb.append("  prices: ").append(prices).append("\n");
		sb.append("  sku: ").append(sku).append("\n");
		sb.append("  title: ").append(title).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
