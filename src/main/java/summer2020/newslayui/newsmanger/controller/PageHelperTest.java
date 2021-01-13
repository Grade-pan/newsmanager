package summer2020.newslayui.newsmanger.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import summer2020.newslayui.newsmanger.entity.User;
import summer2020.newslayui.newsmanger.service.UserService;

import java.util.List;

/**
 * Author: PXY
 * Email: 1817865166@qq.com
 * Date: 2021/1/13
 */
@RestController
public class PageHelperTest {

    @Autowired
    private UserService userService;

    @GetMapping("/selectByPage")
    public PageInfo<User> selectByPage(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> list = userService.selectByPage(); //得到从pageNum开始的pageSize条数据
        //如果直接返回list，得到了分页的数据，如果添加下面步骤，返回pageInfo，则能得到包括list在内的分页信息
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
