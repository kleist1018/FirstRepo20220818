package com.softusing.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.softusing.domain.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

//late we through this interface to use Mybatis Plus methods
@Mapper
public interface MemberDao extends BaseMapper<Member> {
//    @Insert("insert into softusing_new_member_management.member (name,gender,age,tel,address) values (#{name},#{gender},#{age},#{tel},#{address})")
//    int save(Member member);
//
//    @Update("update softusing_new_member_management.member set name = #{name}, gender=#{gender}, age=#{age}, tel=#{tel},address=#{address}  where id = #{id}")
//    int update(Member member);
//    @Select("select * from softusing_new_member_management.member where id = #{id}")
//    Member getById(Integer id);
//    @Select("select * from softusing_new_member_management.member")
//    List<Member> getAll();
}
