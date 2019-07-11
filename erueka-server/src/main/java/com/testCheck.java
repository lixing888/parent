package com;

import com.dqw.annotation.Empty;
import com.dqw.annotation.NotNull;
import com.dqw.annotation.Regular;
import com.dqw.check.Check;
import lombok.Data;

public class testCheck {

    public static void main(String[] args) {
        User user =new User();
        user.setName("li");
        user.setSex("12a");
        user.setAge("12");
        Check.exe(user);
    }
}
@Data
class User {
    @NotNull(msg = "姓名不能为空",group = "1")
    private String name;
    @Regular(value = "^[0-9]*$",msg = "性别只能是数字",group = {"1","2"})
    private String sex;
    @NotNull(msg = "年龄不能为空")
    private String age;
    @Empty(msg = "身份证号码不能为空")
    private String idNo;
}
