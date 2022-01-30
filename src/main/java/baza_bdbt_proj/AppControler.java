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
    private PracownikDAO daoPracownik;
    @Autowired
    private KlientPrywatnyDAO daoKlientPrywatny;
    @Autowired
    private FirmaDAO daoFirma;

    @RequestMapping("/pracownicyAdmin")
    public String viewHomePage(Model model) {
        List<Pracownik> listPracownik = daoPracownik.list();
        model.addAttribute("listPracownik", listPracownik);
        return "pracownicyAdmin";

    }

    @RequestMapping("/main")
    public String addTableToMain(Model model) {
        List<Modele> listModele = dao.list();
        model.addAttribute("listModele", listModele);
        return "main";

    }
    @RequestMapping("/ofertaUser")
    public String addTableOfertaUser(Model model) {
        List<Modele> listModele = dao.list();
        //List<Pracownik> listPracownik = daoPracownik.list();
        model.addAttribute("listModele", listModele);
        //model.addAttribute("listPracownik", listPracownik);
        return "ofertaUser";

    }

    @RequestMapping("/ofertaAdmin")
    public String addTableToOfertaAdmin(Model model) {
        List<Modele> listModele = dao.list();
        List<Pracownik> listPracownik = daoPracownik.list();
        model.addAttribute("listModele", listModele);
        model.addAttribute("listPracownik", listPracownik);
        return "ofertaAdmin";

    }

    @RequestMapping("/oKlientachPrywatnychAdmin")
    public String addTabletoOKlientachPrywatnychAdmin(Model model) {
        List<KlientPrywatny> listKlientPrywatny = daoKlientPrywatny.list();
        model.addAttribute("listKlientPrywatny", listKlientPrywatny);
        return "oKlientachPrywatnychAdmin";

    }
    @RequestMapping("/oKlientachFirmaAdmin")
    public String addTabletoOKlientachFirmaAdmin(Model model) {
        List<Firma> listFirma = daoFirma.list();
        model.addAttribute("listFirma", listFirma);
        return "oKlientachFirmaAdmin";

    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("modele") Modele modele){
        dao.save(modele);
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
