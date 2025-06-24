package com.snhu.sslserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

@RestController
public class HashController {

    @GetMapping("/hash")
    public String getChecksum() throws Exception {
        String data = "Hello World Welcome to Test Screen!"; 
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
        String checksum = Base64.getEncoder().encodeToString(hash);
//Check Sum
        return "Data: " + data + "<br>Checksum (SHA-256): " + checksum;
    }
}
