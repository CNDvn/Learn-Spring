package com.cnd.security;

import com.cnd.security.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserService userService;

    @Bean
    public PasswordEncoder passwordEncoder(){
        //Password encoder, để Spring Security sử dụng mã hóa pass người dùng
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService) //Cung cấp userService cho spring security
                .passwordEncoder(passwordEncoder()); //cung cấp password encoder
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/","/home").permitAll() //cho phép tất cả mọi người truy cập vào 2 địa chỉ này
                .anyRequest().authenticated() //Tất cả các request khác đều cần phải xác thực mới được truy cập
                .and()
                .formLogin() //cho phép người dùng xác thực bằng form login
                .defaultSuccessUrl("/hello")
                .permitAll() //tất cả đều truy cập vào địa chỉ này
                .and()
                .logout() //cho phép logout
                .permitAll();
    }
}
