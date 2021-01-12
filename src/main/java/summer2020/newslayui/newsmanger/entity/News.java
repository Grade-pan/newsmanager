package summer2020.newslayui.newsmanger.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Author: PXY
 * Email: 1817865166@qq.com
 * Date: 2021/1/8
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class News {
    /**
     * ID:主键
     * title:标题
     * author:作者
     * type:类型
     * date:日期
     * content:内容
     * imgUrl:配图链接
     */
    private int ID;
    private String title;
    private String author;
    private String type;
    private String date;
    private String content;
    private String imgUrl;

}
