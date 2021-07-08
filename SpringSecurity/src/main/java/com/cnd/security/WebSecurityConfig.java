package com.cnd.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        //tạo ra user trong bộ nhớ
        //note: chỉ dùng cách này để minh họa
        //còn thực tế ta phải kiểm tra trong csdl
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(
                User.withDefaultPasswordEncoder() //Sử dụng mã hóa pass đơn giản
                .username("cnd")
                .password("123")
                .roles("USER")
                .build()
        );
        return manager;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                authorizeRequests()
                    .antMatchers("/","home").permitAll() //Cho phép tất cả mọi người truy cập vào 2 địa chỉ này
                    .anyRequest().authenticated() //Tất cả các req khác đều cần phải xác thực mới được truy cập
                    .and()
                .formLogin() //cho phép người dùng xác thực bằng form login
                    .defaultSuccessUrl("/hello")
                    .permitAll() //Tất cả đều được truy cập vào địa chỉ này
                    .and()
                .logout() //cho phép logout
                    .permitAll();
    }
}
