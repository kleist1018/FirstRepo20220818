package com.softusing.service;

import com.softusing.domain.Member;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface MemberService {
    boolean save(Member member);

    List<Member> getAllMember();

    Member getById(Integer id);

    boolean update(Member member);

}
