package com.hongchai.controller;


import com.hongchai.dao.UserMapper;
import com.hongchai.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  @RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper  userMapper;
    private static  final  String  USER="User";
    private static final String  USERLIST="ListUsers";

    @RequestMapping("/userList")
    public String showListOfUsers(Model model){
        model.addAttribute("userList",userMapper.getAllUsers());
        return USERLIST;

    }
    @RequestMapping("userAdd")
   public String  addUser(Model model){
        model.addAttribute("user",new User());
        return USER;
   }

   @RequestMapping("saveProcess")
   public String  saveUser(@ModelAttribute("user") User user){
     if(user.getId()==null){
          userMapper.saveUser(user);
     } else{
         userMapper.updateUser(user);
     }

     return "redirect:/user/userList";
   }
   @RequestMapping("displayUpdate")
   public String   showUpdate(@RequestParam("userId") int userId,Model model){

         model.addAttribute("user",userMapper.findById(userId));
         return  USER;
   }

   public String showDelete(@RequestParam("userId") int userId){
         userMapper.deleteUser(userId);
         return "redirect:/user/userList";
   }

}
