package com.dongnao.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: YuXD
 * @create: 2018-11-09 20:46
 **/
@Data
public class User implements Serializable {

    private Integer id;

    private String name;

    private String mobile;

    private String email;

}
