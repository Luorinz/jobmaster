package com.webdev20spr.javaisthebestlanguage.jobmaster.model.request;

import lombok.Data;

/**
 * @author Anda Luo
 * 2020-4-21
 */
@Data
public class UserRequest {
    private String username;
    private String email;
    private String password;
    private String role;
}
