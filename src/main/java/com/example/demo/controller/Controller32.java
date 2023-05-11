package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

import jakarta.annotation.*;
import software.amazon.awssdk.auth.credentials.*;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.*;
import software.amazon.awssdk.services.s3.*;
import software.amazon.awssdk.services.s3.model.*;

@Controller
@RequestMapping("sub32")
public class Controller32 {

	@Value("${aws.accessKeyId}")
	private String accessKey;
	@Value("${aws.secretAccessKey}")
	private String secretKey;
	@Value("${aws.s3.bucketName}")
	private String bucketName;
	
	private S3Client s3; 
	
	@PostConstruct
	public void init() {
		Region region = Region.AP_NORTHEAST_2;
		AwsCredentials credentials = AwsBasicCredentials.create(accessKey, secretKey);
		AwsCredentialsProvider provider = StaticCredentialsProvider.create(credentials);
		this.s3 = S3Client.builder()
				.credentialsProvider(provider)
	            .region(region)
	            .build();	
	}
		
	
	@GetMapping("link1")
	public void method1() {
		System.out.println(accessKey);
		System.out.println(secretKey);
		
		// aws s3에 파일 업로드
		
		
	
		
		//key = aws폴더명 + 파일명
		String key = "test/myFile.txt";
		
		String content = "새로운 파일 내용~";
		
		PutObjectRequest objectRequest = PutObjectRequest.builder()
                .bucket(bucketName)
                .acl(ObjectCannedACL.PUBLIC_READ)
                .key(key)
                .build();

        s3.putObject(objectRequest, RequestBody.fromBytes(content.getBytes()));
        
        // aws iam 에서 버킷 권리 관리
		
	}
	
	
	
	@GetMapping("link2")
	public void method2() {
		
			//key = aws폴더명 + 파일명
			String key = "test/myFile.txt";
	        DeleteObjectRequest deleteObjectRequest = DeleteObjectRequest.builder()
	                .bucket(bucketName)
	                .key(key)
	                .build();

	        s3.deleteObject(deleteObjectRequest);
	}
	
	
	@GetMapping("link3")
	public void method3() {
		// 파일 업로드 가능한 폼 있는 뷰로 포워드 
	}
	
	@PostMapping("link4")
	public void method4(@RequestParam("files") MultipartFile[] files) throws Exception {
		// aws s3 업로드
		for (MultipartFile file : files) {
			
			if (file.getSize() > 0) {
				String key = "test/" + file.getOriginalFilename();
				PutObjectRequest por = PutObjectRequest.builder()
						.key(key)
						.acl(ObjectCannedACL.PUBLIC_READ)
						.bucket(bucketName)
						.build();
				
				s3.putObject(por, RequestBody.fromInputStream(file.getInputStream(), file.getSize()));
			}
		}
	}
	
	
	@PostMapping("link5")
	public void method5(String fileName) {
		//파일 이름 받아서 지우기 
		String key = "text/" + fileName;
		
		DeleteObjectRequest dor = DeleteObjectRequest.builder()
				.key(key)
				.bucket(bucketName)
				.build();
		
		s3.deleteObject(dor);
	}
	
}
