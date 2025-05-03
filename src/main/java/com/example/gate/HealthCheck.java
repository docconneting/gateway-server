package com.example.gate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/actuator/health")
public class HealthCheck {

    public ResponseEntity<String> health() {
        return ResponseEntity.ok("현재 시간 " + LocalDateTime.now() + " 기준 서버가 정상 작동 중입니다!");
    }
}