package lk.ijse.springsecurity.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.ijse.springsecurity.service.JwtService;
import lk.ijse.springsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * @author : savindaJ
 * @date : 2024-04-18
 * @since : 0.1.0
 **/
@Configuration
@RequiredArgsConstructor
public class JwtSecurityConfig extends OncePerRequestFilter {

    private final JwtService jwtService;

    private final UserService userService;

    // invoke one time per request
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authorization = request.getHeader("Authorization");
        if (authorization != null && authorization.startsWith("Bearer ")) {
            String jwt = authorization.substring(7);
            System.out.println(jwt);
            String username = jwtService.extractUsername(jwt);
            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                var userDetails = userService.userDetailsService().loadUserByUsername(username);
                if (jwtService.validateToken(jwt, userDetails)) {
                    UsernamePasswordAuthenticationToken newUser = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    newUser.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(newUser);
                }
            }
        }
        filterChain.doFilter(request, response);
    }
}