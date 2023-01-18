package top.code2022;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@MapperScan("top.code2022.mapper")
public class WebNavigateSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebNavigateSpringbootApplication.class, args);
    }

}
