package com.ltp.gradesubmission;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GradeController 
{

    @GetMapping("/grades")
    public String getGrades(Model model) 
    {
        Grade grade = new Grade("Harry", "Potions", "C+");
        model.addAttribute("grade", grade);
        return "grades";
    }
}

    
