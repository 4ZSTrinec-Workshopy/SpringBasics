package workshop.spring.SpringBasics.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model)
    {
        double random = Math.random() * 1000;

        model.addAttribute("cislo", random);

        return "index";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about()
    {
        return "O nás...";
    }

}
