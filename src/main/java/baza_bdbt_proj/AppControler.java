package baza_bdbt_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
@Controller
public class AppControler  implements WebMvcConfigurer {
    @Autowired
    private ModeleDAO dao;
    private MarkiDAO daoMarki;
    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Modele> listModele = dao.list();
        model.addAttribute("listModele",listModele);
        return "index";

    }
    @RequestMapping("/main")
    public String addTableToMain(Model model){
        List<Modele> listModele = dao.list();
        //List<Marki> listMarki = daoMarki.list();
        model.addAttribute("listModele",listModele);
        //model.addAttribute("listMarki",listMarki);
        return "main";

    }

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");  //index z pdf to u nas log
        registry.addViewController("/").setViewName("index");    //main z pdf to index u nas
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/mainForUser").setViewName("mainForUser");
    }

    @RequestMapping("/new")
    public String showNewForm(Model model){
        Modele modele = new Modele();
        model.addAttribute("modele",modele);

        return "new_form";
    }




}
