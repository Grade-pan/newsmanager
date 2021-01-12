package summer2020.newslayui.newsmanger.mapper;

import org.springframework.stereotype.Repository;
import summer2020.newslayui.newsmanger.entity.User;

/**
 * Author: PXY
 * Email: 1817865166@qq.com
 * Date: 2021/1/8
 */
@Repository
public interface UserMapper {
    /**
     * 用户登录
     */
    User userLogin();

    /**
     * 用户注册
     */
    boolean userRegister(User user);
}
