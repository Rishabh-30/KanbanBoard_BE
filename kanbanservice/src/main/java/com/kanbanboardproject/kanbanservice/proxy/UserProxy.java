package com.kanbanboardproject.kanbanservice.proxy;

import com.kanbanboardproject.kanbanservice.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-authentication-service",url = "http://localhost:8081")

public interface UserProxy {
        @PostMapping("/api/v1/register")
    ResponseEntity<?> saveUser(@RequestBody User user);

}
