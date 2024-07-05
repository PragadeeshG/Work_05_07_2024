package com.test1;

public class MarketTradeCompliance {
	private Integer marketTradeComplianceCode;
	private Integer custodialAccountEffective;
	private String custodialAccountEffectiveDate;
	private String custodialAccountmarketTradeComplianceDesc;
	private String custodialAccountmarketTradeComplianceShortDesc;
	private Integer custodialAccountDecimalPositions;
	private String custodialAccountmarketTradeComplianceSymbol;
	private String custodialAccountmarketTradeComplianceScale;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public MarketTradeCompliance() {

	}

	public MarketTradeCompliance(Integer marketTradeComplianceCode, Integer custodialAccountEffective,
			String custodialAccountEffectiveDate, String custodialAccountmarketTradeComplianceDesc,
			String custodialAccountmarketTradeComplianceShortDesc, Integer custodialAccountDecimalPositions,
			String custodialAccountmarketTradeComplianceSymbol, String custodialAccountmarketTradeComplianceScale,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.marketTradeComplianceCode = marketTradeComplianceCode;
		this.custodialAccountEffective = custodialAccountEffective;
		this.custodialAccountEffectiveDate = custodialAccountEffectiveDate;
		this.custodialAccountmarketTradeComplianceDesc = custodialAccountmarketTradeComplianceDesc;
		this.custodialAccountmarketTradeComplianceShortDesc = custodialAccountmarketTradeComplianceShortDesc;
		this.custodialAccountDecimalPositions = custodialAccountDecimalPositions;
		this.custodialAccountmarketTradeComplianceSymbol = custodialAccountmarketTradeComplianceSymbol;
		this.custodialAccountmarketTradeComplianceScale = custodialAccountmarketTradeComplianceScale;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getMarketTradeComplianceCode() {
		return marketTradeComplianceCode;
	}

	public void setMarketTradeComplianceCode(Integer marketTradeComplianceCode) {
		this.marketTradeComplianceCode = marketTradeComplianceCode;
	}

	public Integer getCustodialAccountEffective() {
		return custodialAccountEffective;
	}

	public void setCustodialAccountEffective(Integer custodialAccountEffective) {
		this.custodialAccountEffective = custodialAccountEffective;
	}

	public String getCustodialAccountEffectiveDate() {
		return custodialAccountEffectiveDate;
	}

	public void setCustodialAccountEffectiveDate(String custodialAccountEffectiveDate) {
		this.custodialAccountEffectiveDate = custodialAccountEffectiveDate;
	}

	public String getCustodialAccountmarketTradeComplianceDesc() {
		return custodialAccountmarketTradeComplianceDesc;
	}

	public void setCustodialAccountmarketTradeComplianceDesc(String custodialAccountmarketTradeComplianceDesc) {
		this.custodialAccountmarketTradeComplianceDesc = custodialAccountmarketTradeComplianceDesc;
	}

	public String getCustodialAccountmarketTradeComplianceShortDesc() {
		return custodialAccountmarketTradeComplianceShortDesc;
	}

	public void setCustodialAccountmarketTradeComplianceShortDesc(
			String custodialAccountmarketTradeComplianceShortDesc) {
		this.custodialAccountmarketTradeComplianceShortDesc = custodialAccountmarketTradeComplianceShortDesc;
	}

	public Integer getCustodialAccountDecimalPositions() {
		return custodialAccountDecimalPositions;
	}

	public void setCustodialAccountDecimalPositions(Integer custodialAccountDecimalPositions) {
		this.custodialAccountDecimalPositions = custodialAccountDecimalPositions;
	}

	public String getCustodialAccountmarketTradeComplianceSymbol() {
		return custodialAccountmarketTradeComplianceSymbol;
	}

	public void setCustodialAccountmarketTradeComplianceSymbol(String custodialAccountmarketTradeComplianceSymbol) {
		this.custodialAccountmarketTradeComplianceSymbol = custodialAccountmarketTradeComplianceSymbol;
	}

	public String getCustodialAccountmarketTradeComplianceScale() {
		return custodialAccountmarketTradeComplianceScale;
	}

	public void setCustodialAccountmarketTradeComplianceScale(String custodialAccountmarketTradeComplianceScale) {
		this.custodialAccountmarketTradeComplianceScale = custodialAccountmarketTradeComplianceScale;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
