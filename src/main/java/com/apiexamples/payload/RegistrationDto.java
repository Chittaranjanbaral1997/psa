package com.apiexamples.payload;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RegistrationDto {

    private Long id;

    @Size(min =2,message = "should be more than 2 characters")
    private String name;

    @Email(message = "Invalid email Format")
    private String email;

    @Size(min =10,max=10,message = "should be 10 or more than digits")
    private String mobile;

    private int pageNo;

    private String message;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

