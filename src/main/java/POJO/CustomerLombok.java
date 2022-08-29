package POJO;

import com.github.javafaker.Faker;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Getter
@ToString
public class CustomerLombok implements Serializable {

    Faker faker = new Faker();
    Date date = Calendar.getInstance().getTime();
    SimpleDateFormat ft =
            new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

    @NotNull
    @Builder.Default
    String name = faker.name().name();
    String email = faker.internet().emailAddress();
    String phone = faker.phoneNumber().phoneNumber();
    int age = faker.random().nextInt(18, 99);
    boolean gdpr = faker.random().nextBoolean();
    boolean customer_profile_status = faker.random().nextBoolean();
    String deactivation_date = ft.format(date);
    String reason = faker.lorem().fixedString(10);
    String notes = faker.lorem().fixedString(10);
    String activation_date = ft.format(date);
}
