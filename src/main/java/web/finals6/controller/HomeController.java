package web.finals6.controller;


import web.finals6.models.Publication;
import web.finals6.repository.AdminRepository;
import web.finals6.repository.PublicationRepository;
import web.finals6.repository.Type_pubRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PublicationRepository publicationRepository;


    @Autowired
    private Type_pubRepository typePubRepository;
    private SessionFactory sessionFactory;

    @GetMapping("/")
    public ModelAndView index(){
        return this.list();
    }

    //FrontOffice
    @GetMapping("/list/*")
    public ModelAndView list() {
        ModelAndView modelAndView= new ModelAndView("List");
        List<Publication> lp1= publicationRepository.findAllById(1);
        List<Publication> lp2= publicationRepository.findAllById(2);
        List<Publication> lp3= publicationRepository.findAllById(3);
        List<Publication> lp4= publicationRepository.findAllById(4);

        modelAndView.addObject("lp1",lp1);
        modelAndView.addObject("lp2",lp2);
        modelAndView.addObject("lp3",lp3);
        modelAndView.addObject("lp4",lp4);

        return modelAndView;
    }

    @GetMapping("/list/{id}/*")
    public ModelAndView details(@PathVariable Integer id){
        ModelAndView modelAndView= new ModelAndView();
        List<Publication> pub= publicationRepository.findWhere(id);
        modelAndView.addObject("pub",pub);
        modelAndView.setViewName("details");
        return modelAndView;
    }

}
