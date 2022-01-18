package baza_bdbt_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
@Controller
public class AppControler  implements WebMvcConfigurer {
    @Autowired
    private ModeleDAO dao;
    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Modele> listModele = dao.list();
        model.addAttribute("listModele",listModele);
        return "index";

    }

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/log").setViewName("log");
        registry.addViewController("/").setViewName("log");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/login").setViewName("login");
    }




}
