package com.ltp.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkbookController {
    @GetMapping ("/")
    public String getShows() {
        return "shows";
    }
    
}
