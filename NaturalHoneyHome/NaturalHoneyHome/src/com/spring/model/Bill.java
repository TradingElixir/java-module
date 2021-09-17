package com.spring.model;
import org.springframework.stereotype.Component;

//use appropriate annotation
@Component
public class Bill {
	
	private String invoiceId;
	private String customerName;
	private double honeyQuantity;
	private String phoneNumber;
	private String honeyType;
	private String paymentType;
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getHoneyQuantity() {
		return honeyQuantity;
	}
	public void setHoneyQuantity(double honeyQuantity) {
		this.honeyQuantity = honeyQuantity;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHoneyType() {
		return honeyType;
	}
	public void setHoneyType(String honeyType) {
		this.honeyType = honeyType;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	

}
