package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by studio on 2017/2/25.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
