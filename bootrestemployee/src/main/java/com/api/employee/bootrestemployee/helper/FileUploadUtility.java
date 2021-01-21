package com.api.employee.bootrestemployee.helper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadUtility {

    public final String UPLOAD_DIR = "D:\\Spring Boot Workspace\\bootrestemployee\\src\\main\\resources\\static";

    public boolean uploadFile(MultipartFile multipartFile) {

        boolean result = false;

        try {

            Files.copy(multipartFile.getInputStream(),
                    Paths.get(UPLOAD_DIR + File.separator + multipartFile.getOriginalFilename()),
                    StandardCopyOption.REPLACE_EXISTING);

            result = true;

        } catch (Exception e) {

            e.printStackTrace();

        }

        return result;

    }

}
