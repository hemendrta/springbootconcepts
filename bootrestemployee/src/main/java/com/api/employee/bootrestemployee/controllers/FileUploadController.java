package com.api.employee.bootrestemployee.controllers;

import com.api.employee.bootrestemployee.helper.FileUploadUtility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/*

Configuration in application.properties file:

# multipart configuration

# enabling multipart uploads
spring.servlet.multipart.enabled = true

# maximum file size allowed
spring.servlet.multipart.max-file-size = 200MB

# minimum file size
spring.servlet.multipart.file-size-threshold = 2KB

*/

@RestController
public class FileUploadController {

    @Autowired
    private FileUploadUtility fileUploadUtility;

    @PostMapping("/uploadFile")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
       
        try{

             fileUploadUtility.uploadFile(file);
             return new ResponseEntity<String>("File uploaded successfully!!!", HttpStatus.OK);

        }catch(Exception e){

            e.printStackTrace();
            return new ResponseEntity<String>("No File Selected!!!", HttpStatus.BAD_REQUEST);

        }
        
    }

}
