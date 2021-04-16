package org.datayoo.brackets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName BracketsApp
 * @Description TODO
 * @Author BLADE
 * @Date 2021/4/5 17:49
 * @Version 1.0
 **/
@SpringBootApplication
public class BracketsApp {
  public static void main(String[] args) {
    ConfigurableApplicationContext applicationContext = SpringApplication
        .run(BracketsApp.class, args);
  }
}
