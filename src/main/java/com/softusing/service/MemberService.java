package com.softusing.service;

import com.softusing.domain.Member;
import com.softusing.domain.MemberForCondition;
import com.softusing.domain.PageUnitOfMember;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface MemberService {
    boolean save(Member member);

    List<Member> getAllMember();

    Member getById(Integer id);

    boolean update(Member member);

    PageUnitOfMember<Member> selectWithConditionByPage(int currentPage, int pageSize, Member member);

}
