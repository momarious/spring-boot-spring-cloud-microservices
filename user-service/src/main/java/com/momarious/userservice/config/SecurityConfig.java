package com.momarious.userservice.config;

public class SecurityConfig {
    
}

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig extends WebSecurityConfigurerAdapter {
//     private final UserDetailsService userDetailsService;

//     public SecurityConfig(UserDetailsService userDetailsService) {
//         this.userDetailsService = userDetailsService;
//     }

//     @Autowired
//     public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//         auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//     }

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }

//     @Bean
//     public JWTAuthenticationFilter jwtAuthenticationFilter() {
//         return new JWTAuthenticationFilter(authenticationManager());
//     }

//     @Bean
//     public JWTAuthorizationFilter jwtAuthorizationFilter() {
//         return new JWTAuthorizationFilter(authenticationManager());
//     }

//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http.cors().and().csrf().disable().authorizeRequests()
//                 .antMatchers("/authenticate").permitAll()
//                 .anyRequest().authenticated()
//                 .and()
//                 .addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
//                 .addFilterBefore(jwtAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
//     }
// }
