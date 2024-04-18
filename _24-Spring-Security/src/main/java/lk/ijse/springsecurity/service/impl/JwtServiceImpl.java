package lk.ijse.springsecurity.service.impl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lk.ijse.springsecurity.service.JwtService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.security.Key;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.function.Function;

/**
 * @author : savindaJ
 * @date : 2024-04-18
 * @since : 0.1.0
 **/
@Service
public class JwtServiceImpl implements JwtService {

    //    @Value("${jwt.secret}")
    private final String secretKey = "";

    @Override
    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject); // Extracting the username from the token payload
    }

    @Override
    public String generateToken(UserDetails userDetails) {
        HashMap<String, Object> claims = new HashMap<>();
        claims.put("role", userDetails.getAuthorities());
        var now = new Date();
        var date = new Date(now.getTime() + 1000 * 60 * 60 * 10);
        var accessToken = Jwts.builder().setClaims(claims)
                .setSubject(userDetails.getUsername())
                .signWith(getSignKey())
                .issuedAt(now)
                .setExpiration(date)
                .signWith(getSignKey(), SignatureAlgorithm.HS256)
                .compact();
        return accessToken;
    }

    @Override
    public boolean validateToken(String token, UserDetails userDetails) {
        final String username = extractUsername(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    private boolean isTokenExpired(String token) {
        return extractAllClaims(token).getExpiration().before(new Date());
    }

    private Key getSignKey() {
        byte[] decode = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(decode);
    }

    private Claims extractAllClaims(String token) {
        Claims body = Jwts.parser().setSigningKey(getSignKey()).build().parseClaimsJws(token).getBody();
        return body;
    }

    private <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }
}
