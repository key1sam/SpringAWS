package com.example.springaws;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.example.springaws.web.HelloController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)

public class HelloControllerTest {
    @Autowired
    private MockMvc mvc; // 웹 API 테스트할 때 사용하며 스프링 MVC 테스트의 시작점

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello")) // MockMVC를 통해 /hello 주소로 HTTP GET 요청, 체이닝으로 여러 검정 기능 이어서 선언가능
                .andExpect(status().isOk()) // mvc.perform의 결과를 ㄹ검증, 200, 404, 500 등의 상태 검정
                .andExpect(content().string(hello));
    }

}
