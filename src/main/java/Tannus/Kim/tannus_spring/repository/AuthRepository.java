package Tannus.Kim.tannus_spring.repository;

import Tannus.Kim.tannus_spring.dto.SignupReqDto;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AuthRepository {
    private final Map<String, String> userDb = new HashMap<>();

    public AuthRepository() {
        userDb.put("luppy1004@naver.com", "김준태");
    }
    public int findByEmail(String email) {
        if (userDb.containsKey(email)) {
            return 0;
        }else {
            return 1;
        }
    }
    public int addUser(SignupReqDto signupReqDto) {
        userDb.put(signupReqDto.getEmail(), signupReqDto.getUsername());
        return 1;
    }
}
