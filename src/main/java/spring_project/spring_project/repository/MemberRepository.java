package spring_project.spring_project.repository;

import spring_project.spring_project.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    //반환할 자료형, 메서드 이름, 전달받을 매개변수
    Member save(Member member);
    //optional은 회원이 있을 수도 있고 없을 수도 있다
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
