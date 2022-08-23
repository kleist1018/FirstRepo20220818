package com.softusing.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("member")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberForCondition extends Member{
    /*
    when query condition has a min age and max age, here is useful
     */

    private Integer ageMax;

    private Integer age;

    private String name;

    private String gender;

}
