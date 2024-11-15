package animal_shop.community.member.repository;

import animal_shop.community.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);

    boolean existsByUsername(String username);

    Member findByUsernameAndPassword(String username, String password);

    boolean existsByMail(String mail);

    boolean existsByNickname(String nickname);
}
