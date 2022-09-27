package by.tms.web.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hub")
public class HubController {

    @GetMapping("/hub1")
    public String hub() {
        return "hub";
    }

}
