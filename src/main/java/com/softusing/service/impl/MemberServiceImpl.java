package com.softusing.service.impl;

import com.softusing.dao.MemberDao;
import com.softusing.domain.Member;
import com.softusing.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public boolean save(Member member) {
        return memberDao.insert(member) > 0;
    }

    @Override
    public List<Member> getAllMember() {
        return memberDao.selectList(null);

    }

    @Override
    public Member getById(Integer id) {
        return memberDao.selectById(id);
    }

    @Override
    public boolean update(Member member) {
        return memberDao.updateById(member) > 0;
    }
}
