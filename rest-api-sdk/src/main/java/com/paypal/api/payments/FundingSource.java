package com.paypal.api.payments;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class FundingSource extends FundingInstrument {

	/**
	 * specifies funding mode of the instrument
	 */
	private String fundingMode;

	/**
	 * Instrument type for this funding source
	 */
	private String fundingInstrumentType;

	/**
	 * Soft descriptor used when charging this funding source.
	 */
	private String softDescriptor;

	/**
	 * Total anticipated amount of money to be pulled from instrument.
	 */
	private Currency amount;

	/**
	 * Additional amount to be pulled from the instrument to recover a negative balance on the buyer's account that is owed to PayPal.
	 */
	private Currency negativeBalanceAmount;

	/**
	 * Localized legal text relevant to funding source.
	 */
	private String legalText;

	/**
	 * URL to legal terms relevant to funding source.
	 */
	private String terms;

	/**
	 * Additional detail of the funding.
	 */
	private FundingDetail fundingDetail;

	/**
	 * Additional text relevant to funding source.
	 */
	private String additionalText;

	/**
	 * 
	 */
	private List<DefinitionsLinkdescription> links;

	/**
	 * Default Constructor
	 */
	public FundingSource() {
	}

}
