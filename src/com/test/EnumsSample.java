package com.test;

public class EnumsSample {

	public enum Company {
		EBAY, PAYPAL, GOOGLE, YAHOO, ATT
	}

	Company cName;

	public EnumsSample(Company cName) {
		this.cName = cName;
	}

	public void companyDetails() {
		switch (cName) {
		case EBAY:
			System.out.println("EBAY : Biggest Market Place in the World.");
			break;

		case PAYPAL:
			System.out.println("PAYPAL : Simplest way to manage Money.");
			break;

		case YAHOO:
			System.out.println("YAHOO : 1st Web 2.0 Company.");
			break;

		default:
			System.out.println(cName + " :: Company info not found");
			break;
		}
	}

	public static void main(String[] args) {
		EnumsSample ebay = new EnumsSample(Company.EBAY);
		ebay.companyDetails();
		EnumsSample paypal = new EnumsSample(Company.PAYPAL);
		paypal.companyDetails();
		EnumsSample google = new EnumsSample(Company.GOOGLE);
		google.companyDetails();
		EnumsSample yahoo = new EnumsSample(Company.YAHOO);
		yahoo.companyDetails();
		EnumsSample att = new EnumsSample(Company.ATT);
		att.companyDetails();
	}
}
