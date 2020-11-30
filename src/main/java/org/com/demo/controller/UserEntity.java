package org.com.demo.controller;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lijingyang
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/309:27
 */
@Data
public class UserEntity implements Serializable {
    private Long id;
    private String guid;
    private String name;
    private String age;
    private Date createTime;
}
