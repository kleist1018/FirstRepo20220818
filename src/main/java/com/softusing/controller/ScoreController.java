package com.softusing.controller;

import com.softusing.domain.Score;
import com.softusing.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PostMapping
    public Result save(@RequestBody Score score){
        boolean flag = scoreService.save(score);
        return new Result(flag, flag ? Code.SAVE_OK : Code.SAVE_ERR);
    }

    @GetMapping
    public Result getAllMember(){
        List<Score> allScore = scoreService.getAllScore();
        Integer code = allScore != null ? Code.GET_OK :Code.GET_ERR;
        String msg =  allScore != null ? "" : "データ読込失敗、もう一度やり直してください。";
        return new Result(allScore,code,msg);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        Score score = scoreService.getById(id);
        Integer code = score != null ? Code.GET_OK : Code.GET_ERR;
        String msg = score != null ? "" : "データ読込失敗、もう一度やり直してください。";
        return new Result(score,code,msg);
    }

    @PutMapping
    public Result update(@RequestBody Score score){
        boolean flag = scoreService.update(score);
        return new Result(flag, flag ? Code.UPDATE_OK : Code.UPDATE_ERR);
    }
}
