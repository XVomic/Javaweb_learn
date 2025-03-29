package com.xu.springbootquickstart.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@TableName(value = "user")
public class User {

    @TableId(value = "username",type=IdType.ASSIGN_ID )
    private String username;

    @TableField(value = "password")
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
