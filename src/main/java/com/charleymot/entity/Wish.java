package com.charleymot.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

@Data
public class Wish {
    private Integer id;

    private String name;

    private String description;

    private Date date;
    private Date createdate;

    private String isrealized;

    public Wish() {
    }

    public Wish(String name, String desc, Date createdate, String isrealized) {
        this.name = name;
        this.description = desc;
        this.createdate = createdate;
        this.isrealized = isrealized;
    }
}