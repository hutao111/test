package test.a.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import test.a.entity.Java8;
import test.a.service.Java8Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hutao123
 * @since 2019-04-13
 */
@RestController
public class Java8Comtroller {


    @Autowired
    Java8Service java8Service;

    @PostMapping ("/add")
    public Boolean add() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Java8 java8 = new Java8();
        java8.setId(23);
        java8.setJava8Date(localDate);
        java8.setJava8DateTime(localDateTime);
        java8.setJava8Time(localTime);
        Boolean a = java8Service.insert(java8);
        System.out.println(a);
        return a;

    }

}

