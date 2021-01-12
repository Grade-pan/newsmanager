package summer2020.newslayui.newsmanger.entity;

import lombok.*;

/**
 * Author: PXY
 * Email: 1817865166@qq.com
 * Date: 2021/1/8
 */
@EqualsAndHashCode//HashCode
@NoArgsConstructor
@AllArgsConstructor//全参构造器
@ToString
@Data//Getter And Setter
public class User {
    /**
     * username:用户名
     * email:电子邮箱
     * password:密码
     * age:年龄
     * Tel:电话
     * address:地址
     * ip:IP地址
     * sex:性别
     * superRoot:是否为管理员
     */
    private String username;
    private String email;
    private String password;
    private String age;
    private String Tel;
    private String address;
    private String ip;
    private String sex;
    private String superRoot;
}
