package summer2020.newslayui.newsmanger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import summer2020.newslayui.newsmanger.entity.User;
import summer2020.newslayui.newsmanger.error.ResultMe;
import summer2020.newslayui.newsmanger.error.ResultEnumMe;
import summer2020.newslayui.newsmanger.service.UserService;

/**
 * Author: PXY
 * Email: 1817865166@qq.com
 * Date: 2021/1/8
 */
@Controller
public class UserDo {
    @RequestMapping("/login")
    public String userLoginHtml() {
        return "Root/login";
    }


    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/userLogin")
    public ResultMe<User> userLogin(@RequestBody User user) {
        System.out.println(user);
//        userService.userLogin();
        return new ResultMe<>(ResultEnumMe.SUCCESS);
    }
}
