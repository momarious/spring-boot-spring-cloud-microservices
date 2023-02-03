package com.momarious.userservice.config.flter;

public class JWTAuthenticationFilter {
    
}

// public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

//     private AuthenticationManager authenticationManager;

//     public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
//         this.authenticationManager = authenticationManager;
//     }

//     @Override
//     public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
//             throws AuthenticationException {
//         try {
//             User user = new ObjectMapper().readValue(request.getInputStream(), User.class);

//             return authenticationManager.authenticate(
//                     new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
//         } catch (IOException e) {
//             throw new RuntimeException(e);
//         }
//     }

//     @Override
//     protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response,
//                                             FilterChain chain, Authentication authResult) throws IOException, ServletException {

//         // Create the JWT token and add it to the response headers
//     }
// }
