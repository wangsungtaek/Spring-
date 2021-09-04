package taek.springstudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taek.springstudy.domain.Member;

import java.util.Optional;

public interface SpringDataJapMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);
}
