package com.example.wiki.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private String username;
    private String nickname;
    private List<OrderDto> orders;
}
