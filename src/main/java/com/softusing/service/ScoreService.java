package com.softusing.service;

import com.softusing.domain.Score;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ScoreService {
    boolean save(Score score);

    List<Score> getAllScore();

    Score getById(Integer id);

    boolean update(Score score);
}
