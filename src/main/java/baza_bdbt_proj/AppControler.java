package baza_bdbt_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
@Controller
public class AppControler  implements WebMvcConfigurer {
    @Autowired
    private ModeleDAO dao;
    @Autowired
    private MarkiDAO daoMarki;
    @Autowired
    private PracownikDAO daoPracownik;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Modele> listModele = dao.list();
        model.addAttribute("listModele", listModele);
        return "index";

    }

    @RequestMapping("/main")
    public String addTableToMain(Model model) {
        List<Modele> listModele = dao.list();
        model.addAttribute("listModele", listModele);
        return "main";

    }

    @RequestMapping("/mainForUser")
    public String addTableToMainForUser(Model model) {
        List<Modele> listModele = dao.list();
        List<Pracownik> listPracownik = daoPracownik.list();
        model.addAttribute("listModele", listModele);
        model.addAttribute("listPracownik", listPracownik);
        return "mainForUser";

    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("modele") Modele modele,@ModelAttribute("marki") Marki marki){
        dao.save(modele,marki);
        return "redirect: mainForUser";
    }



    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");  //index z pdf to u nas log
        registry.addViewController("/").setViewName("index");    //main z pdf to index u nas
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/mainForAdmin").setViewName("mainForAdmin");
        registry.addViewController("/ofertaUser").setViewName("ofertaUser");
        registry.addViewController("/save").setViewName("save");
        registry.addViewController("/ofertaAdmin").setViewName("ofertaAdmin");
        registry.addViewController("/oKlientachFirmaAdmin").setViewName("oKlientachFirmaAdmin");
        registry.addViewController("/oKlientachPrywatnychAdmin").setViewName("oKlientachPrywatnychAdmin");
        registry.addViewController("/pracownicyAdmin").setViewName("pracownicyAdmin");
        registry.addViewController("/new_form").setViewName("new_form");
        registry.addViewController("/new_worker").setViewName("new_worker");
        registry.addViewController("/errorPage").setViewName("errorPage");
        registry.addViewController("/newKlientFirma").setViewName("newKlientFirma");
        registry.addViewController("/newKlientPrywatny").setViewName("newKlientPrywatny");
    }

    @RequestMapping("/new")
    public String showNewForm(Model model){
        Modele modele = new Modele();
        model.addAttribute("modele",modele);
        return "new_form";
    }





}
