package wannaapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import wannaapp.model.User;
import wannaapp.service.UserService;

@Controller
public class AppController {
	 
	@Autowired
	private UserService service;
	
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<User> users=service.listAll();
		model.addAttribute("listUsers", users);
        model.addAttribute("test", "test");
		System.out.println("passed");
		return "index";
	}
   @RequestMapping("/new")
   public String  addUserPage(Model model) {
	   User  user=new User();
	   model.addAttribute("user",user);
	    
	   return  "new_user";
	   
   }
   @RequestMapping(value = "/save",method = RequestMethod.POST)
   public String saveUser(@ModelAttribute("user") User  user) {
	   service.save(user);
	   return  "redirect:/";
   }
   

@RequestMapping(value = "/edit/{id}")
public ModelAndView editUser(@PathVariable(name="id") int id) {
	 
	ModelAndView mav=new ModelAndView("edit_user");
	User user=service.get(id);
	mav.addObject("user",user);
	return mav;
}
@RequestMapping("/delete/{id}")
public String deleteUser( int id) {
	service.delete(id);
	return "redirect:/";
}

   
   
}
