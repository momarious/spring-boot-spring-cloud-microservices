package com.momarious.userservice.config.flter;

public class JWTAuthorizationFilter {
    
}

// public class JWTAuthorizationFilter extends BasicAuthenticationFilter {
//     public JWTAuthorizationFilter(AuthenticationManager authManager) {
//         super(authManager);
//     }

//     @Override
//     protected void doFilterInternal(HttpServletRequest request,
//                                     HttpServletResponse response,
//                                     FilterChain chain) throws IOException, ServletException {

//         String header = request.getHeader(SecurityConstants.HEADER);

//         if (header == null || !header.startsWith(SecurityConstants.TOKEN_PREFIX)) {
//             chain.doFilter(request, response);
//             return;
//         }

//         UsernamePasswordAuthenticationToken authentication = getAuthentication(request);

//         SecurityContextHolder.getContext().setAuthentication(authentication);
//         chain.doFilter(request, response);
//     }

//     private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
//         String token = request.getHeader(SecurityConstants.HEADER);
//         if (token != null) {
//             // parse the token and validate it
//             // extract the user details from the token and create a UserDetails object
//             // return a new UsernamePasswordAuthenticationToken with the user details and the user's roles
//         }
//         return null;
//     }
// }