package by.tms.controller;

import by.tms.entity.Operation;
import by.tms.entity.User;
import by.tms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/hello") //GET localhost:8080/hello
public class HelloController {

	@Autowired
	private UserService userService;

	@GetMapping("/world") // GET localhost:8080/hello/world
	public String helloWorld(
			@RequestParam String name
//													 @RequestParam(defaultValue = "0") int age, Model model
	){
//		model.addAttribute("name", name);
//		model.addAttribute("age", age);
		if (name.equals("Test")) {
			throw new RuntimeException();
		}
		return "world"; // /pages/world.jsp
	}

	@GetMapping("/test/{name}/{age}") // GET localhost:8080/hello/test/{name}/{age}
	public ModelAndView helloTest(@PathVariable String name, @PathVariable int age, ModelAndView modelAndView){
		modelAndView.setViewName("test");
		modelAndView.addObject("name", name);
		modelAndView.addObject("age", age);
		return modelAndView;
		//		model.addAttribute("name", name);
//		model.addAttribute("age", age);
//		return "test";
	}

	@PostMapping("/world") // POST localhost:8080/hello/world
	public String helloWorld(User user, Model model) {
		model.addAttribute("user", user);
		userService.save(user);
		return "world";
	}

	@GetMapping("/test") // GET localhost:8080/hello/test
	public String helloTest(){
		return "redirect:/";
	}
}
