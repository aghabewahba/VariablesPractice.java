package day48_constrructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObject {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1);//print with defult value that are set in no args
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike" ,2);// creat object and assign value in same statement
        Customer cs3 =new Customer("John Ward III", 4873);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of customers
        Customer[]todaysCustomers ={cs1,cs2,cs3,new Customer("Bashir", 449)};

        //arrayList of Customers object
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir",449));
        customerList.add(new Customer("Suleyman",9763));

        //print ifo of first customer object in array and arrayList
        System.out.println(todaysCustomers[0].toString());
        System.out.println(customerList.get(0).toString());

        System.out.println(customerList);//print  toString () info
        System.out.println("-----For Loop-----");

        for (int i = 0; i <customerList.size() ; i++) {
            System.out.println(customerList.get(i));


        }
        System.out.println("----For Each Loop----");
        for(Customer eachCustomer : customerList){
            System.out.println(eachCustomer);
        }
        System.out.println("----Name of customer----");
        customerList.forEach(each-> System.out.println(each.getName()));
        for (Customer eachCustomer:customerList) {
            System.out.println(eachCustomer.getName());

        }

        }


    }

