package com.momarious.userservice.config;

public class UserDetailsServiceImpl {
    
}

// @Service
// public class UserDetailsServiceImpl implements UserDetailsService {
//     private final UserRepository userRepository;

//     public UserDetailsServiceImpl(UserRepository userRepository) {
//         this.userRepository = userRepository;
//     }

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         User user = userRepository.findByUsername(username);
//         if (user == null) {
//             throw new UsernameNotFoundException(username);
//         }
//         return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
//     }
// }
