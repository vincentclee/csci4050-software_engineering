import java.util.Date;


public class Company {
	private String name;
	private String exchange;
	private String symbol;
	private String industry;
	private Date addedOn;
	private Double price;
	
	/**
	 * Constructor
	 * @param name
	 * @param exchange
	 * @param symbol
	 * @param industry
	 * @param addedOn
	 * @param price
	 */
	public Company(String name, String exchange, String symbol, String industry, Date addedOn, Double price) {
		this.name = name;
		this.exchange = exchange;
		this.symbol = symbol;
		this.industry = industry;
		this.addedOn = addedOn;
		this.price = price;
	}
	
	/**
	 * Default Constructor
	 */
	public Company() {
		this.name = "";
		this.exchange = "";
		this.symbol = "";
		this.industry = "";
		this.addedOn = new Date();
		this.price = 0.0;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the exchange
	 */
	public String getExchange() {
		return exchange;
	}

	/**
	 * @param exchange the exchange to set
	 */
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the industry
	 */
	public String getIndustry() {
		return industry;
	}

	/**
	 * @param industry the industry to set
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	/**
	 * @return the addedOn
	 */
	public Date getAddedOn() {
		return addedOn;
	}

	/**
	 * @param addedOn the addedOn to set
	 */
	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String toString() {
		return "[" + name + ", " + exchange + ", " + industry + ", " + addedOn + ", " + price + "]";
	}
}
