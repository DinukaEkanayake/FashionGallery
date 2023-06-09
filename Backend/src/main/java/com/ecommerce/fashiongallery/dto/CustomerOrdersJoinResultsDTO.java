package com.ecommerce.fashiongallery.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerOrdersJoinResultsDTO {

    private Long orderID;
    private Long customerID;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String province;
    private Integer zipcode;
    private String orderAmount;
    private String orderDate;
}
