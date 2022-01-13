package baza_bdbt_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class AppControler {
    @Autowired
    private ModeleDAO dao;
    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Modele> listModele = dao.list();
        model.addAttribute("listModel",listModele);
        return "index";

    }
}
