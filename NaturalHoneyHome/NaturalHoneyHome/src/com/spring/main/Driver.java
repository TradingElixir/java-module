package com.spring.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

import com.spring.config.ApplicationConfig;
import com.spring.service.BillService;

import java.util.Scanner;

public class Driver {
	
public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		double billAmount=0.0;
	ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
	BillService bObj=(BillService)ctx.getBean(BillService.class);
	
	System.out.println("enter the invoice id");
    String invoiceId=in.nextLine();
    System.out.println("customer name");
    String customerName=in.nextLine();
    System.out.println("enter honey qty");
    double honeyQuantity=in.nextDouble();
    in.nextLine();
    System.out.println("enter phone no.");
    String phoneNumber=in.nextLine();
    System.out.println("honey type (Raw/Pasteurized/Forest)");
    String honeyType=in.nextLine();
    System.out.println("paymentType");
    String paymentType=in.nextLine();
    
    billAmount=bObj.calculateTotalBillAmount(invoiceId, customerName, honeyQuantity, phoneNumber, honeyType, paymentType);
    
    System.out.println("Bill amount to be paid"+billAmount);
    
    
}

}
