package hello.controller;

import hello.model.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import hello.repository.ProducerRepository;


@Controller
@RequestMapping("/demo")
public class ProducerController {
    @Autowired
    private ProducerRepository producerRepository;

    @RequestMapping("/list")
    public String producer (Model model) {
        model.addAttribute("doctor", producerRepository.findAll());
        return "doctor";
    }

    @RequestMapping("/add")
    public
    @ResponseBody
    String add(@RequestParam  String scientific_degree, @RequestParam String academic_title, @RequestParam int n_person, @RequestParam String specialty_branch) {
        Producer n = new Producer();
        n.setScientific_degree(scientific_degree);
        n.setAcademic_title(academic_title);
        n.setN_person(n_person);
        n.setSpecialty_branch(specialty_branch);

        producerRepository.save(n);
        return "Saved";
    }
    @RequestMapping("/all")
    public @ResponseBody Iterable<Producer> getAllProducer() {

        return ProducerRepository.findAllProducer();
    }
    @RequestMapping(value="/producer", method= RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("producer", new Producer());
        return "producer";
    }

    @RequestMapping(value="/producer", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Producer n, Model model) {
        producerRepository.save(n);
        model.addAttribute("producer", n);
        return "result";
    }

}
