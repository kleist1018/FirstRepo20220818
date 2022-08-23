package com.softusing.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.softusing.dao.MemberDao;
import com.softusing.domain.Member;
import com.softusing.domain.PageUnitOfMember;
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

    @Override
    public PageUnitOfMember<Member> selectWithConditionByPage(int currentPage, int pageSize, Member member) {
        //wrap the current page and page size for Mybatis plus
        IPage<Member> pageData = new Page<>(currentPage,pageSize);

        //new a wrapper to wrap the condition
        LambdaQueryWrapper<Member> wrapper = new LambdaQueryWrapper<>();
        //name and gender condition
        wrapper.eq(null != member.getName(), Member::getName, member.getName());
        wrapper.eq(null != member.getGender(),Member::getGender, member.getGender());
        //age condition
        wrapper.ge(null != member.getAge(), Member::getAge, member.getAge());
        wrapper.le(null != member.getAgeMax(), Member::getAge, member.getAge());

        memberDao.selectPage(pageData, wrapper);

        //wrap into a return ob
        Integer totalCount = Math.toIntExact(pageData.getTotal());
//        Integer totalCount = (Integer)_totalCount;
        List<Member> memberRowsInPage = pageData.getRecords();
        return new PageUnitOfMember<Member>(totalCount,memberRowsInPage);
    }


}
