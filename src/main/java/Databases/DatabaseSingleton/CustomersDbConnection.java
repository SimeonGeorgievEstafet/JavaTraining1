package Databases.DatabaseSingleton;

import POJO.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.ResultSet;

public class CustomersDbConnection {

    Database database = Database.getInstance();

    public ResultSet getAllCustomers() {
        return database.executeQuery(SQLQuery.getAllResultsFromTable("customers_1"));
    }

    public void saveCustomer(Customer customer) throws JsonProcessingException {

        database.executeQuery(SQLQuery.saveCustomer(customer));
        ObjectMapper mapper = new ObjectMapper();
//        Converting the Object to JSONString
        String jsonString = mapper.writeValueAsString(customer);
        System.out.println(jsonString);
    }
    public ResultSet updateCustomer(String status, int customerId)  {
        if (status.equals("deactivate")){
            return database.executeQuery(SQLQuery.deactivateCustomer(customerId));
        } else if (status.equals("activate")){
            return database.executeQuery(SQLQuery.activateCustomer(customerId));
        }else {
            System.out.println("User cannot be updated!");
        }
        return null;
    }

    public ResultSet deleteCustomer(int customerId)  {
        return database.executeQuery(SQLQuery.deleteCustomer(customerId));
    }

    public ResultSet getRandomCustomer()  {
        return database.executeQuery(SQLQuery.getRandomCustomer());
    }

    public ResultSet getCustomerById(int i)  {
        return database.executeQuery(SQLQuery.getCustomerById(i));
    }


    public void deleteAll() {
        try {
            database.executeQuery(SQLQuery.deleteAll());
        } catch (Exception e) {
            System.out.println("Table was deleted!");
        }
    }

    public ResultSet getRecordsCount(){
        return database.executeQuery(SQLQuery.getRecordsCount());
    }
}
