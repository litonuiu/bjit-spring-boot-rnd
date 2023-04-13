package com.example.springbootrnd.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.List;

/**
 * Created by Md. Liton Miah
 * Created on April 04, 2023 at 3:53 PM
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String contactNo;

    private List<ContactModel> contactList;
}
