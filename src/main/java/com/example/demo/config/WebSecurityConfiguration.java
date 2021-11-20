package com.example.demo.config;// Copyright (c) Microsoft Corporation. All rights reserved.

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http.authorizeRequests()
//                .antMatchers(
////                        "/**").permitAll()
////                .antMatchers(
////                        "/home").authenticated()
                .anyRequest().authenticated()
                .and()
                .cors().disable()
                .oauth2Login()
                .and();
    }
}
