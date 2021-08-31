package taek.springstudy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import taek.springstudy.repository.MemberRepository;
import taek.springstudy.repository.MemoryMemberRepository;
import taek.springstudy.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());

    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
