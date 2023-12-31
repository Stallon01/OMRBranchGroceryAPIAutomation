package com.omrbranch.pojo.cart;

import java.util.ArrayList;

public class GetCartItems_Output_Pojo {
	private int status;
    public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public ArrayList<GetCartItemsData> getData() {
		return data;
	}
	public void setData(ArrayList<GetCartItemsData> data) {
		this.data = data;
	}
	public int getCart_count() {
		return cart_count;
	}
	public void setCart_count(int cart_count) {
		this.cart_count = cart_count;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getWallet() {
		return wallet;
	}
	public void setWallet(String wallet) {
		this.wallet = wallet;
	}
	public String getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}
	public String getCoupon_discount() {
		return coupon_discount;
	}
	public void setCoupon_discount(String coupon_discount) {
		this.coupon_discount = coupon_discount;
	}
	public String getShipping_fee() {
		return shipping_fee;
	}
	public void setShipping_fee(String shipping_fee) {
		this.shipping_fee = shipping_fee;
	}
	public String getGrand_total() {
		return grand_total;
	}
	public void setGrand_total(String grand_total) {
		this.grand_total = grand_total;
	}
	public String getSavings() {
		return savings;
	}
	public void setSavings(String savings) {
		this.savings = savings;
	}
	public int getCredit_usage() {
		return credit_usage;
	}
	public void setCredit_usage(int credit_usage) {
		this.credit_usage = credit_usage;
	}
	public String getCredits_used() {
		return credits_used;
	}
	public void setCredits_used(String credits_used) {
		this.credits_used = credits_used;
	}
	public String getPayment_key() {
		return payment_key;
	}
	public void setPayment_key(String payment_key) {
		this.payment_key = payment_key;
	}
	public GetCartItemsAddress getAddress() {
		return address;
	}
	public void setAddress(GetCartItemsAddress address) {
		this.address = address;
	}
	private String message;
    private String currency;
    private ArrayList<GetCartItemsData> data;
    private int cart_count;
    private String payment;
    private String wallet;
    private String total_amount;
    private String coupon_discount;
    private String shipping_fee;
    private String grand_total;
    private String savings;
    private int credit_usage;
    private String credits_used;
    private String payment_key;
    private GetCartItemsAddress address;
}
