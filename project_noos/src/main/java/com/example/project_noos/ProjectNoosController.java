package com.example.project_noos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller // 컨트롤러 어노테이션 명시
public class ProjectNoosController {
    @GetMapping("/project_noos") // GET 요청 매핑
    public String projectNoos(
            @RequestParam(name="name", required=false, defaultValue="홍길동") String name,
            Model model) {
        model.addAttribute("name", name); // 뷰에 전달할 데이터 설정
        return "project_noos"; // templates/project_noos.html 뷰 이름 반환
    }
}