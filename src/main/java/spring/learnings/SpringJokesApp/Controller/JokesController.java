package spring.learnings.SpringJokesApp.Controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import spring.learnings.SpringJokesApp.services.JokesInterface;
import spring.learnings.SpringJokesApp.services.JokesInterfaceImpl;

@Controller
public class JokesController {

    private final JokesInterface jokesInterface;


    public JokesController(JokesInterface jokesInterface) {
        this.jokesInterface = jokesInterface;
    }

    @GetMapping({"/",""})
    private String showJoke(Model model){

        model.addAttribute("joke", jokesInterface.getJoke());
        System.out.println("Joke:"+model.getAttribute("joke"));
        return "index";


    }
}
