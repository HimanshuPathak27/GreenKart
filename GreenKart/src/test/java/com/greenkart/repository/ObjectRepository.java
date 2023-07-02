package com.greenkart.repository;

public class ObjectRepository {
	
	//Home Page
	public static final String searchboxXpath = "//input[@placeholder='Search for Vegetables and Fruits']";
	public static final String searchButtonXpath = "//button[@type='submit']";
	public static final String topDealsLink = "Top Deals";
	public static final String flightBookingLink = "Flight Booking";
	public static final String cartButtonXpath = "//img[@alt='Cart']";
	public static final String addMoreButtonXpath = "//a[normalize-space()='+']";
	public static final String addToCartXpath = "//button[normalize-space()='ADD TO CART']";
	public static final String proceedToCheckOutButtonXpath = "//button[normalize-space()='PROCEED TO CHECKOUT']";
	
	public static final String productNameXpath = "//div[@class='product']//h4";
}