package com.hr.project.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.ConstructorArgs;

@Data
public class UserVO {
    private int id;
    private String name;
    private String email;
}
