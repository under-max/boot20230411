package com.example.demo.config;

import java.util.*;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.method.configuration.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.core.authority.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.userdetails.User.*;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.security.crypto.password.*;
import org.springframework.security.provisioning.*;
import org.springframework.security.web.*;
import org.springframework.security.web.access.expression.*;

@Configuration
@EnableMethodSecurity
public class MyConfig2 {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { //필터설정
		http.formLogin()
		.loginPage("/sub33/mylogin") //직접만든 login page 로 이동 
		.defaultSuccessUrl("/sub33/loginSuccess", true) //login filter설정 성공시 root로 redirect, default 설정시 로그인 성공하면 url값으로 redirect
		.usernameParameter("id") //기본값 username
		.passwordParameter("pw");  // 기본값 password
		// true일 경우 어디서 로그인 하던 default 값으로 redirect 함 
		
		http.csrf().disable(); //disable 하면 jsp에서 입력한 csrf 구현 무시 csrf값이 없는 상태로 웹페이지 운영됨
		//csrf형식일시 로그아웃을 하려면 post방식으로 logout으로 해야함 이때 csrf 난수값을 들고가야 로그아웃 가능 
		
		http.authorizeHttpRequests().requestMatchers("/abc").authenticated(); //이제부터 해당 주소값은 로그인이 필요함
		
		
		 //게시물 작성한 사람과 변경하려는 사람이 같은지 확인하는 로직
		// 이런 이름을 가진 스프링 빈이 있다면 실행 위 component에 등록된 bean 에 의해서 등록 접근 불가 가능해짐 
		
		
		
		http.authorizeHttpRequests().anyRequest().permitAll(); // 로그인 필요한곳 말고 허용
		
		return http.build(); //http를 통해서 구현가능 상위 build된 내용들 적용하여 반환 
	}
	
	@Bean
	public UserDetailsService userDetailsService () { //비교용
		
		PasswordEncoder encoder = passwordEncoder();
		
		String pw1 = encoder.encode("pw1");
		String pw2 = encoder.encode("pw2");
		
		System.out.println("pw1" + pw1);
		System.out.println("pw2" + pw2);
				
		UserDetails user1 = User.builder()
				.username("user1")
				.password(pw1)
				.authorities(List.of(
						new SimpleGrantedAuthority("admin"),
						new SimpleGrantedAuthority("manager"))) //권한
				.build();
		UserDetails user2 = User.builder()
				.username("user2")
				.password(pw2)
				.authorities(List.of(
						new SimpleGrantedAuthority("manager"),
						new SimpleGrantedAuthority("user")))
				.build();
		
		return new InMemoryUserDetailsManager(user1, user2);
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() { //password 암호화
		
		return new BCryptPasswordEncoder();
	}
	
	
}
