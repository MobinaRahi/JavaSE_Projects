package javase07;

import javase07.customer.RetailCustomer;
import javase07.customer.WholesaleCustomer;

public class Main {
    public static void main(String[] args) {
        RetailCustomer retailCustomer1=new RetailCustomer("mobina","rahi","0000",000,"0902");
        retailCustomer1.save();
        RetailCustomer.printAll();

        WholesaleCustomer wholesaleCustomer1=new WholesaleCustomer("mobina","rahi","0000",000,"0902",123);
        wholesaleCustomer1.save();
        WholesaleCustomer.printAll();
    }
}
