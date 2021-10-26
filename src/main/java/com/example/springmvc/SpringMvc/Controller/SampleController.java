package com.example.springmvc.SpringMvc.Controller;

import com.example.springmvc.SpringMvc.Entity.UserInfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

    @GetMapping("/showhome")
    public String showHome(){
        return "result";
    }

    @PostMapping("/process-homepage")
//    public String process(@RequestParam("userName") String userName1,
//                          @RequestParam("crushName") String crushName1, Model model){
     //       public String process(UserInfoDTO userInfoDTO,Model model){


      //  model.addAttribute("user",userInfoDTO);

    public String process(@ModelAttribute("user") UserInfoDTO userInfoDTO){

        return "home";
    }
}
