package com.example.backend.controller;

import com.example.backend.model.request.LoginRequest;
import com.example.backend.model.request.SearchRequest;
import com.example.backend.model.request.FriendRequest;
import com.example.backend.model.request.RegisterRequest;

import com.example.backend.service.LoginService;
import com.example.backend.service.FriendService;
import com.example.backend.service.RegisterService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class RegisterController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private RegisterService registerService;

    @Autowired
    private FriendService friendRequestService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegisterRequest request) {
        try {
            return ResponseEntity.ok(this.registerService.register(request));
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest request) {
        try {
            return ResponseEntity.ok(this.loginService.login(request));
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PostMapping("/search")
    public ResponseEntity<?> searchUserByUsername(@RequestBody SearchRequest username) {
        try {
            return ResponseEntity.ok(this.loginService.search(username));
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/sendFriendRequest")
    public ResponseEntity<?> sendFriendRequest(@RequestBody FriendRequest request) {
        try {
            boolean requestSent = this.friendRequestService.sendFriendRequest(request);

            if (requestSent) {
                return ResponseEntity.ok().body("Friend request sent successfully.");
            }
            else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to send friend request.");
            }
        }
        catch(Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}