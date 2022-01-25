package baza_bdbt_proj;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyCustomErrorControler implements ErrorController {

    @RequestMapping("/error")
    @ResponseBody
    public String handleError(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
        return String.format("<html><body><h2>Error Page</h2><div>Status code: <b>%s</b></div>"
                        + "<div>Exception Message: <b>%s</b></div><body></html>" +
                          "<div><a href='/main#home'>Powrot do strony uzytkownika B)</a></div>",
                statusCode, exception==null? "Strona przeznaczona dla Admina pzdr": exception.getMessage());
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
