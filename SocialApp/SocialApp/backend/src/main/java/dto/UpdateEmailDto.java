package dto;



import annotation.ValidEmail;
import annotation.ValidPassword;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateEmailDto {
    @ValidEmail
    private String email;

    @ValidPassword
    private String password;
}
