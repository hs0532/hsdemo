package com.hs.bean;

import java.io.Serializable;
import lombok.Data;

@Data
public class SysUser implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private static final long serialVersionUID = 1L;
}