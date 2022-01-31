package baza_bdbt_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
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
        return "redirect:/ofertaAdmin";
    }

    @RequestMapping(value = "/savePracownik",method = RequestMethod.POST)
    public String savePracownik(@ModelAttribute("pracownik") Pracownik pracownik){
        daoPracownik.save(pracownik);
        return "redirect:/pracownicyAdmin";
    }

    @RequestMapping(value = "/saveKlientPrywatny",method = RequestMethod.POST)
    public String saveKlientPrywatny(@ModelAttribute("klientPrywatny") KlientPrywatny klientPrywatny){
        daoKlientPrywatny.save(klientPrywatny);
        return "redirect:/oKlientachPrywatnychAdmin";
    }

    @RequestMapping(value = "/saveFirma",method = RequestMethod.POST)
    public String saveFirma(@ModelAttribute("firma") Firma firma){
        daoFirma.save(firma);
        return "redirect:/oKlientachFirmaAdmin";
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

    @RequestMapping("/newPracownik")
    public String showNewFormPracownik(Model model){
        Pracownik pracownik = new Pracownik();
        model.addAttribute("pracownik",pracownik);
        return "new_worker";
    }

    @RequestMapping("/newKlientPrywatny")
    public String showNewFormKlientPrywatny(Model model){
        KlientPrywatny klientPrywatny = new KlientPrywatny();
        model.addAttribute("klientPrywatny",klientPrywatny);
        return "newKlientPrywatny";
    }

    @RequestMapping("/newKlientFirma")
    public String showNewFormKlientFirma(Model model){
        Firma firma = new Firma();
        model.addAttribute("firma",firma);
        return "newKlientFirma";
    }

    @RequestMapping("/edit/{id_pojazdu}")
    public ModelAndView showEditForm(@PathVariable(name = "id_pojazdu") int id_pojazdu){
        ModelAndView mav = new ModelAndView("edit_form");
        Modele modele = dao.get(id_pojazdu);
        mav.addObject("modele",modele);
        return mav;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(@ModelAttribute("modele") Modele modele){
        dao.update(modele);
        return "redirect:/ofertaAdmin";
    }

    @RequestMapping("/deleteModele/{id_pojazdu}")
    public String delete(@PathVariable(name = "id_pojazdu") int id_pojazdu){
        dao.delete(id_pojazdu);
        return "redirect:/ofertaAdmin";
    }

    @RequestMapping("/deletePracownik/{id_pracownik}")
    public String deletePracownik(@PathVariable(name = "id_pracownik") int id_pracownik){
        daoPracownik.delete(id_pracownik);
        return "redirect:/pracownicyAdmin";
    }
    @RequestMapping("/deleteKlient/{id_klienta}")
    public String deleteKlient(@PathVariable(name = "id_klienta") int id_klienta){
        daoKlientPrywatny.delete(id_klienta);
        return "redirect:/oKlientachPrywatnychAdmin";
    }

    @RequestMapping("/deleteFirma/{id_klienta}")
    public String deleteFirma(@PathVariable(name = "id_klienta") int id_klienta){
        daoFirma.delete(id_klienta);
        return "redirect:/oKlientachFirmaAdmin";
    }







}
