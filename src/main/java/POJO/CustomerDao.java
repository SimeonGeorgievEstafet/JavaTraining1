package POJO;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public interface CustomerDao {

    List<Customer> getAllCustomers();

    void save(Customer customer) throws JsonProcessingException;

    void update(String status, int customerId);

    void delete(int customerId);

    ArrayList<Integer> getRandomIds(int i);

    void deleteAll();
    int getRandomCustomer();

    int getRecordsCount();
    Customer getByID(int i);

//    List<Customer> getByIDs(int i);
}
