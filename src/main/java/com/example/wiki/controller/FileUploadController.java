package com.example.wiki.controller;

import com.example.wiki.common.vo.ResultVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class FileUploadController {
    private static final String UPLOAD_PATH = "C:\\Users\\16340\\Desktop\\upload";
    @PostMapping("/upload")
    public ResultVO upload(MultipartFile file ) {
        if(file.isEmpty()){
            return new ResultVO(500,"文件为空",null);
        }
        try {
            String fileName = file.getOriginalFilename();
            Path path = Paths.get(UPLOAD_PATH).resolve(fileName);
            Files.copy(file.getInputStream(),path);
            return new ResultVO(200,"上传成功",path.toString());

        } catch (IOException e) {
            e.printStackTrace();
            return new ResultVO(500,"上传失败",null);
        }

    }
}
