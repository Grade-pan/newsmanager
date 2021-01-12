package summer2020.newslayui.newsmanger.mapper;

import summer2020.newslayui.newsmanger.entity.News;

import java.util.List;

/**
 * Author: PXY
 * Email: 1817865166@qq.com
 * Date: 2021/1/8
 */
public interface NewsMapper {
    /**
     * 提交新闻
     */
    Boolean submitNews(News news);

    /**
     * 查询新闻
     */
    List<News> selectNews();
}
