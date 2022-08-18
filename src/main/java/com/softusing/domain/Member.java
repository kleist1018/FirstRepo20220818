package com.softusing.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("member")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private char gender;
    private int age;
    private String tel;
    private String address;

}
