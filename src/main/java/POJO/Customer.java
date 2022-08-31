package POJO;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@Builder
@Entity

//                        @FieldResult(name = "name", column = "name"),
//                        @FieldResult(name = "email", column = "email"),
//                        @FieldResult(name = "phone", column = "phone"),
//                        @FieldResult(name = "age", column = "age"),
//                        @FieldResult(name = "gdpr", column = "gdpr"),
//                        @FieldResult(name = "customer_profile_status", column = "customer_profile_status"),
//                        @FieldResult(name = "reason", column = "reason"),
//                        @FieldResult(name = "notes", column = "notes"),
//                        @FieldResult(name = "deactivation_date", column = "deactivation_date"),
//                        @FieldResult(name = "activation_date", column = "activation_date")
@SqlResultSetMapping(name="CustomersMapping", classes = {
        @ConstructorResult(targetClass = Customer.class,
                columns = {@ColumnResult(name="customerId")})
})
public class Customer implements Serializable {
    String customerId;
    Date deactivation_date;
    Date activation_date;

    @NotNull
    String name;
    String email;
    String phone;
    int age;
    boolean gdpr;
    boolean customer_profile_status;
    String reason;
    String notes;

    public Customer() {
    }
}
