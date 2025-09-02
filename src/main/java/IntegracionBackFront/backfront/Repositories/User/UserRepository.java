package IntegracionBackFront.backfront.Repositories.User;

import IntegracionBackFront.backfront.Entities.Users.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long>
{
    Optional<UserEntity> findByCorreo(String email);
}
