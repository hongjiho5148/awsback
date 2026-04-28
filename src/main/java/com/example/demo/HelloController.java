package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
// 프론트엔드에서 오는 API 요청을 허용하기 위한 CORS 설정
@CrossOrigin(origins = "*") 
public class HelloController {
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Private Subnet! 3-Tier 아키텍처 백엔드 호출에 성공했습니다. 🚀";
    }

    // 1. 단순 서버 생존 확인용 (L7 로드 밸런서 헬스 체크용)
    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }
}