package com.hhsr.christmas.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by hanhai on 2017/1/6.
 */
@Data
public class UserForm implements Serializable {

    private String userName;

    private String password;

}
