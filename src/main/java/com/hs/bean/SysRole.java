package com.hs.bean;

import java.io.Serializable;
import lombok.Data;

@Data
public class SysRole implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}