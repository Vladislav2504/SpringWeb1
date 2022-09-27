package by.tms.web.servlet;

import by.tms.entity.User;
import by.tms.service.CalculatorService;
import by.tms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/service")
public class CalculatorServlet {




    @Autowired
    private CalculatorService calculatorService;


    @GetMapping("/calculator")
    public String calcGet() {
        return "calc";
    }


    @PostMapping("/calculator")
    public String calcPost(double num1, double num2, String operation, Model model) {

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("operation", operation);

        model.addAttribute("result", calculatorService.getResult(num1, num2, operation));


        return "calc";
    }

}
