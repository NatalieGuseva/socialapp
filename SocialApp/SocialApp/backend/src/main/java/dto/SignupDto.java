package dto;



import annotation.PasswordRepeatEqual;
import annotation.ValidEmail;
import annotation.ValidPassword;
import lombok.*;

import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@PasswordRepeatEqual(
        passwordFieldFirst = "password",
        passwordFieldSecond = "passwordRepeat"
)
public class SignupDto {
    @ValidEmail
    private String email;

    @ValidPassword
    private String password;
    private String passwordRepeat;

    @Size(max = 64)
    private String firstName;

    @Size(max = 64)
    private String lastName;
}
