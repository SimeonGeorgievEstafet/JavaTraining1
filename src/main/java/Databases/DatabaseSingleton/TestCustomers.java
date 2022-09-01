package Databases.DatabaseSingleton;

import POJO.Customer;
import POJO.CustomerDaoImpl;
import com.fasterxml.jackson.core.JsonProcessingException;


public class TestCustomers {
    public static void main(String[] args) throws JsonProcessingException {
        final String ACTIVATE = "activate";
        final String DEACTIVATE = "deactivate";
        CustomerDaoImpl CDI = new CustomerDaoImpl();
//        CDI.getRandomCustomer();
//        CDI.getByID(CDI.getRandomCustomer());
//        CDI.getAllCustomers();
//        Customer customer = CDI.CreateCustomer();
//        CDI.save(customer);

//        CDI.deleteAll();

//        This will create 15 customers!
//        for (int i = 0; i < 15; i++) {
//            Customer customer2 = CDI.CreateCustomer();
//            CDI.save(customer2);
//        }
//
//        CDI.update(DEACTIVATE, 146);
        CDI.update(ACTIVATE, 146);
//        CDI.delete(CDI.getRandomCustomer());

//        CDI.getRandomIds(5);
//        CDI.getRecordsCount();
//
////        CDI.getByIDs(2);
    }
}
