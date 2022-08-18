package com.softusing.service.impl;

import com.softusing.dao.MemberDao;
import com.softusing.dao.ScoreDao;
import com.softusing.domain.Member;
import com.softusing.domain.Score;
import com.softusing.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreDao scoreDao;

    @Override
    public boolean save(Score score) {
        return scoreDao.insert(score) > 0;
    }

    @Override
    public List<Score> getAllScore() {
        return scoreDao.selectList(null);

    }

    @Override
    public Score getById(Integer id) {
        return scoreDao.selectById(id);
    }

    @Override
    public boolean update(Score score) {
        return scoreDao.updateById(score) > 0;
    }

}
