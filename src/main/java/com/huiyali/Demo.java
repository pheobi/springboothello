package com.huiyali;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 这是一个测试实体类
*@Author:YahuiLi
*@Description:
*@param
*@Date:15:27 2018/6/20
*/
public class Demo {
    private Integer id;
    private String name;
    //import com.alibaba.fastjson.annotation.JSONField;
    @JSONField(format = "yyyy-MM-dd")//若输出字段已被格式化为此形式 说明底层已使用fastJson格式化
    private Date createTime;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
