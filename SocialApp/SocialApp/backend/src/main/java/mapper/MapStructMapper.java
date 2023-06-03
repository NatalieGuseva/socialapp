package mapper;



import dto.UpdateUserInfoDto;
import entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MapStructMapper {
    User userUpdateDtoToUser(UpdateUserInfoDto updateUserInfoDto);
}