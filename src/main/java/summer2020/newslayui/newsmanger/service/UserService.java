package summer2020.newslayui.newsmanger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import summer2020.newslayui.newsmanger.entity.User;
import summer2020.newslayui.newsmanger.mapper.UserMapper;

/**
 * Author: PXY
 * Email: 1817865166@qq.com
 * Date: 2021/1/9
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User userLogin() {
        return userMapper.userLogin();
    }
}
