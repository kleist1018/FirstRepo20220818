package com.softusing.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.softusing.domain.Score;
import org.apache.ibatis.annotations.Mapper;

//late we through this interface to use Mybatis Plus methods
@Mapper
public interface ScoreDao extends BaseMapper<Score> {
}
