package dto;



import annotation.PasswordRepeatEqual;
import annotation.ValidPassword;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@PasswordRepeatEqual(
        passwordFieldFirst = "password",
        passwordFieldSecond = "passwordRepeat"
)
public class UpdatePasswordDto {
    @ValidPassword
    private String password;
    private String passwordRepeat;

    private String oldPassword;
}