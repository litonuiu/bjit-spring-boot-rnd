package com.example.springbootrnd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Md. Liton Miah
 * Created on April 12, 2023 at 9:16 AM
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactModel {
    private Long id;
    private String operatorName;
    private String contactNumber;
    private String packageName;
    private String simType;
}
