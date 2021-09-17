package com.spring.bo;
import org.springframework.stereotype.Component;

import com.spring.model.Bill;

//use appropriate annotation
@Component
public class BillBO {
	
	/* This method should calculate the total bill amount and return the same to the BillService class */
	public double calculateTotalBillAmount (Bill bObj) 
	{
		double billAmount=0.0;
		//fill the code
		double quantity=bObj.getHoneyQuantity();
		if(bObj.getHoneyType().equals("Raw")) {
			billAmount=quantity*500;
			
		}else if(bObj.getHoneyType().equals("pasteurized")){
			billAmount=quantity*1000;
		}else if(bObj.getHoneyType().equals("Forest")){
			billAmount=quantity*2000;
		}
			
		return billAmount;
	}

}
