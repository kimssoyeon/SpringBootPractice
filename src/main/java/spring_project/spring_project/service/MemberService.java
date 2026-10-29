package spring_project.spring_project.service;

import spring_project.spring_project.domain.Member;
import spring_project.spring_project.repository.MemberRepository;
import spring_project.spring_project.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemberRepository memberRepository;

    //외부에서 넣어주도록 바꿈
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }
    /**
    *회원가입
    */
    public Long join(Member member){
        validataDuplicateMember(member);//중복회원검증

        memberRepository.save(member);
        return member.getId();
    }

    //같은 이름이 있는 중복 회원 안됨
    private void validataDuplicateMember(Member member) {
        memberRepository.findByName(member.getName()).ifPresent(m ->{
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
        //get으로 바로 꺼내는걸 권장하지 않음
//        result.ifPresent(m ->{
//            throw new IllegalArgumentException("이미 존재하는 회원입니다.");
//        });
    }

    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
