package com.armardbellamy.main;

import java.util.*;

/**
 * Created by armardbellamy on 11/26/16.
 */
public class CommonStringsBetweenTwoArrays {
    public static class  Customer{
        String name;
        String email;
        List customers = new ArrayList<Customer>(
        );

        public Customer(String name, String email){
            this.name = name;
            this.email = email;
        }
    }

    public static void main(String[] args) {
        Customer cust1 = new Customer("Rachel", "rachel@example.com");
        Customer cust2 = new Customer("Armard", "armard@example.com");
        Customer cust3 = new Customer("Sara", "sara@exampe.com");

        Customer cust4 = new Customer("Erica", "erica@example.com");
        Customer cust5 = new Customer("Armard", "armard@example.com");
        Customer cust6 = new Customer("Megan", "megan@exampe.com");

        Customer cust7 = new Customer("Rachel", "rachel@example.com");
        Customer cust8 = new Customer("Jennifer", "jennifer@example.com");
        Customer cust9 = new Customer("Elizabeth", "elizabeth@exampe.com");

        Customer[] customerList1 = {cust1, cust2, cust3};
        Customer[] customerList2 = {cust4, cust5, cust6};
        Customer[] customerList3 = {cust7, cust8, cust9};

        TreeSet<Customer> finalCustomerList = new TreeSet<>();




        for(int i = 0; i < customerList1.length; i++){
            finalCustomerList.add(customerList1[i]);
        }

        for(int i = 0; i < customerList2.length; i++){
            finalCustomerList.add(customerList2[i]);
        }

        for(int i = 0; i < customerList3.length; i++){
            finalCustomerList.add(customerList3[i]);
        }



        for(Customer cus: finalCustomerList){
            System.out.println(cus);
        }





    }




}
