package Tannus.Kim.tannus_spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class SigninReqDto {
    private String password;
    private String email;
}
