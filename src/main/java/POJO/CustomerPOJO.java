package POJO;

import java.io.Serializable;

public class CustomerPOJO implements Serializable {
    String name;
    String email;
    String phone;
    int age;
    boolean gdpr;
    boolean customer_profile_status;
    String deactivation_date;
    String reason;
    String notes;
    String activation_date;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gdpr=" + gdpr +
                ", customer_profile_status=" + customer_profile_status +
                ", deactivation_date=" + deactivation_date +
                ", reason='" + reason + '\'' +
                ", notes='" + notes + '\'' +
                ", activation_date=" + activation_date +
                '}';
    }

    public CustomerPOJO(){
    }

    public CustomerPOJO(String name, String email, String phone, int age, boolean gdpr, boolean customer_profile_status, String deactivation_date, String reason, String notes, String activation_date) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.gdpr = gdpr;
        this.customer_profile_status = customer_profile_status;
        this.deactivation_date = deactivation_date;
        this.reason = reason;
        this.notes = notes;
        this.activation_date = activation_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGdpr() {
        return gdpr;
    }

    public void setGdpr(boolean gdpr) {
        this.gdpr = gdpr;
    }

    public boolean isCustomer_profile_status() {
        return customer_profile_status;
    }

    public void setCustomer_profile_status(boolean customer_profile_status) {
        this.customer_profile_status = customer_profile_status;
    }

    public String getDeactivation_date() {
        return deactivation_date;
    }

    public void setDeactivation_date(String deactivation_date) {
        this.deactivation_date = deactivation_date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getActivation_date() {
        return activation_date;
    }

    public void setActivation_date(String activation_date) {
        this.activation_date = activation_date;
    }
}
