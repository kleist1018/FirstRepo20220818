package com.softusing.controller;

import com.softusing.domain.Member;
import com.softusing.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping
    public Result save(@RequestBody Member member){
        boolean flag = memberService.save(member);
        return new Result(flag, flag ? Code.SAVE_OK : Code.SAVE_ERR);
    }

    @GetMapping
    public Result getAllMember(){
        List<Member> allMember = memberService.getAllMember();
        Integer code = allMember != null ? Code.GET_OK :Code.GET_ERR;
        String msg =  allMember != null ? "" : "データ読込失敗、もう一度やり直してください。";
        return new Result(allMember,code,msg);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        Member member = memberService.getById(id);
        Integer code = member != null ? Code.GET_OK : Code.GET_ERR;
        String msg = member != null ? "" : "データ読込失敗、もう一度やり直してください。";
        return new Result(member,code,msg);
    }

    @PutMapping
    public Result update(@RequestBody Member member){
        boolean flag = memberService.update(member);
        return new Result(flag, flag ? Code.UPDATE_OK : Code.UPDATE_ERR);
    }
}
