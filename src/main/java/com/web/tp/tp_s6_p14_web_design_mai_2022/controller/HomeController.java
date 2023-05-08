package com.web.tp.tp_s6_p14_web_design_mai_2022.controller;


import com.web.tp.tp_s6_p14_web_design_mai_2022.repository.AdminRepository;
import com.web.tp.tp_s6_p14_web_design_mai_2022.repository.PublicationRepository;
import com.web.tp.tp_s6_p14_web_design_mai_2022.repository.Type_pubRepository;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.web.tp.tp_s6_p14_web_design_mai_2022.models.Admin;
import com.web.tp.tp_s6_p14_web_design_mai_2022.models.Type_pub;
import com.web.tp.tp_s6_p14_web_design_mai_2022.models.Publication;

import java.sql.Date;
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


    //FrontOffice
    @GetMapping("/list/*")
    public ModelAndView list() {
        ModelAndView modelAndView= new ModelAndView("Acceuil");
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



    @GetMapping("/list/{id}")
    public ModelAndView details(@PathVariable Integer id){
        ModelAndView modelAndView= new ModelAndView();
        List<Publication> pub= publicationRepository.findWhere(id);
        modelAndView.addObject("pub",pub);
        modelAndView.setViewName("details");
        return modelAndView;
    }

}
