package com.donsend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //解决静态资源被拦截的问题
        web.ignoring().antMatchers("/css/**","/images/**","/js/**");
    }

    /**
     * http请求方法
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.httpBasic().and().authorizeRequests().anyRequest().authenticated();
        http.formLogin().loginPage("/toLoginPage") //自定义登陆界面
                .loginProcessingUrl("/login") //表单提交的路径
                .usernameParameter("username")
                .passwordParameter("password")
                .successForwardUrl("/")
                .and().authorizeRequests().antMatchers("/toLoginPage").permitAll()
                .anyRequest().authenticated();

        http.csrf().disable();
    }
}
