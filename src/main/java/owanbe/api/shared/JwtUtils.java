package owanbe.api.shared;

import com.nimbusds.jose.JWSObject;
import com.nimbusds.jwt.JWTClaimsSet;

import java.text.ParseException;
import java.util.Objects;

public class JwtUtils {

    public static String getEmailFromToken(final String token) throws ParseException {
        return getAllClaimsFromToken(token);
    }

    private static String getAllClaimsFromToken(String token) throws ParseException {
        JWSObject jwsObject;
        JWTClaimsSet claims;

        jwsObject = JWSObject.parse(token);
        claims = JWTClaimsSet.parse(jwsObject.getPayload().toJSONObject());
        return (String) Objects.requireNonNull(claims).getClaims().get("email");
    }

}
