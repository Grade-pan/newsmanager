package summer2020.newslayui.newsmanger;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import summer2020.newslayui.newsmanger.entity.User;
import summer2020.newslayui.newsmanger.error.ResultMe;
import summer2020.newslayui.newsmanger.error.ResultEnumMe;

/**
 * Author: PXY
 * Email: 1817865166@qq.com
 * Date: 2021/1/9
 */
@RestController
public class Controller {
    @GetMapping("user")
    @Test
    public ResultMe<User> getUser() {
        User user = new User();
        user.setAddress("sds");
        return new ResultMe<>(ResultEnumMe.SUCCESS, user);
    }
}
