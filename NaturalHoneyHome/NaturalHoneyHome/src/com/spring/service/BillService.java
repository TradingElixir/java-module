package com.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.bo.BillBO;
import com.spring.config.ApplicationConfig;
import com.spring.model.Bill;

//use appropriate annotation
@Component
public class BillService {
	
	private BillBO billBoObj;

	public BillBO getBillBoObj() {
		return billBoObj;
	}

	public void setBillBoObj(BillBO billBoObj) {
		this.billBoObj = billBoObj;
	}
	//use appropriate annotation
	@Autowired
	public BillService(BillBO billBoObj) {
		super();
		this.billBoObj = billBoObj;
	}
	
	/* This method has to assign the values of invoiceId, customerName, honeyQuantity, phoneNumber, honeyType and paymentType to the Bill object sObj 
	and invoke calculateTotalBillAmount method in BillBO class by passing Bill object sObj */
	
	public double calculateTotalBillAmount (String invoiceId, String customerName, double honeyQuantity, String phoneNumber, String honeyType, String paymentType)
	{
		double billAmount=0.0;
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Bill sObj=(Bill)ctx.getBean("bill");
		//fill the code
		sObj.setInvoiceId(invoiceId);
		sObj.setCustomerName(customerName);
		sObj.setHoneyQuantity(honeyQuantity);
		sObj.setPhoneNumber(phoneNumber);
		sObj.getHoneyType();
		sObj.setPaymentType(paymentType);
		
		billAmount=billBoObj.calculateTotalBillAmount(sObj);
		
		
		return billAmount;
	}

}
