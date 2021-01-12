package summer2020.newslayui.newsmanger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: PXY
 * Email: 1817865166@qq.com
 * Date: 2021/1/12
 */
@RestController
public class PathVaribleTest {
    @GetMapping("/test/{limit}/{page}")
    public Map<String, Object> TestPath(
            @PathVariable Map<String, String> LP,
            @RequestParam Map<String, String> param) {
        Map<String, Object> map = new HashMap<>();
        map.put("LP", LP);
        map.put("param", param);
        return map;
    }
}
