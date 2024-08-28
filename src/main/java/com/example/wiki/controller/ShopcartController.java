package com.example.wiki.controller;

import com.example.wiki.common.vo.ResultVO;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/shopcart")
public class ShopcartController {
    @GetMapping("/list")
    public ResultVO list(String token){
        if(token == null){
            return new ResultVO(400,"请先登录",null);
        }else {
            JwtParser jwtParser = Jwts.parser();
            jwtParser.setSigningKey("secret");
            try {
                jwtParser.parseClaimsJws(token);
                return new ResultVO(200,"success",null);
            }catch (Exception e){
                return new ResultVO(400,"token无效",null);
            }
        }
    }
}
