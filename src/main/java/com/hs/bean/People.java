package com.hs.bean;

import java.io.Serializable;
import lombok.Data;

@Data
public class People implements Serializable {
    private Integer id;

    private String name;

    private Integer age;

    private static final long serialVersionUID = 1L;
}