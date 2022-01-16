package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController
{

    @GetMapping("hello")    // "hello"가 URL로 요청되면 호출되는 메소드
    public String hello(Model model)
    {
        model.addAttribute("data","spring!!");  // data에 spring!!을 매핑해준다.
        return "hello";     // hello.html 페이지를 띄운다.
    }

    @GetMapping("hello-mvc")    // "hello-mvc"가 URL로 요청되면 호출되는 메소드
    public String helloMvc(@RequestParam("name") String name, Model model)  // 파라미터 하나를 요청한다.
    {
        model.addAttribute("name",name);    // "name"에 입력받은 String 파라미터를 매핑한다.
        return "hello-template";    // "hello-template.html" 페이지를 띄운다.
    }
}
