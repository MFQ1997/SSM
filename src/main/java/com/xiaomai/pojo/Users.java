package com.xiaomai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private String username;
    private String password;
    private int sex;
    private String phone;
    private String email;
    private String address;
    private String abstracts;
}
