package com.softusing.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("score")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Score {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String subject;
    private String grade;

}
