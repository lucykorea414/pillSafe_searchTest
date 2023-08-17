package com.pillsafe.pillsafe_searchtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/board")
    public String board(){
        return "board";
    }

    @GetMapping("/board/write")
    public String boardWrite(){
        return "boardWrite";
    }

    @GetMapping("/board/list")
    public String boardList(){
        return "boardList";
    }

    @GetMapping("/board/detail")
    public String boardDetail(){
        return "boardDetail";
    }
}
