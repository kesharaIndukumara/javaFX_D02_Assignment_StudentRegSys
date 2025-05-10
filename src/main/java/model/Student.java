package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Student {
    private String id;
    private String fName;
    private String Email;
    private String phoneNumber;
    private String address;
    private String password;
}
