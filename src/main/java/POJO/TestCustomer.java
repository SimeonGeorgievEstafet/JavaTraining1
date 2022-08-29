package POJO;


import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCustomer {
    public static void main(String[] args) {

        Faker faker = new Faker();
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat ft =
                new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        CustomerPOJO customerPOJO = new CustomerPOJO(
                faker.name().name(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.random().nextInt(18, 99),
                faker.random().nextBoolean(),
                faker.random().nextBoolean(),
                ft.format(date),
                faker.lorem().fixedString(10),
                faker.lorem().fixedString(10),
                ft.format(date)
        );
        System.out.println(customerPOJO);

        CustomerLombok customerLombok = new CustomerLombok();
        System.out.println(customerLombok);
    }
}
