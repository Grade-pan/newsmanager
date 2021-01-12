package summer2020.newslayui.newsmanger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("summer2020.newslayui.newsmanger.mapper")
public class NewsmangerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsmangerApplication.class, args);
    }

}
