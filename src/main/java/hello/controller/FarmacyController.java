package hello.controller;

import hello.repository.FarmacyRepository;
import hello.model.Farmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/demo")
public class FarmacyController {
    @Autowired
    private FarmacyRepository farmacyRepository;


    @RequestMapping("/list")
    public String farmacy (Model model) {
        model.addAttribute("farmacy", farmacyRepository.findAll());
        return "Main";
    }

    @RequestMapping("/add")
    public @ResponseBody
    String addNewFarmacy(@RequestParam  String fName, @RequestParam String fdName, @RequestParam String fdSurname, @RequestParam String fdMiddleName, @RequestParam int fBuild, @RequestParam String fStreet, @RequestParam String fCity, @RequestParam String fCountry, @RequestParam int fIndex) {
        Farmacy n = new Farmacy();
        n.setFName(fName);
        n.setFDSurname(fdSurname);
        n.setFDName(fdName);
	n.setFDMiddleName(fdMiddleName);

        farmacyRepository.save(n);
        return "Saved";
    }
    @RequestMapping("/all")
    public @ResponseBody Iterable<Farmacy> getAllFarmacy(){
        return farmacyRepository.findAll();
    }
    @RequestMapping(value="/farmacy", method= RequestMethod.GET)
    public String farmacyForm(Model model) {
        model.addAttribute("farmacy", new Farmacy());
        return "Main";
    }

    @RequestMapping(value="/farmacy, method=RequestMethod.POST)
    public String farmacySubmit(@ModelAttribute Farmacy n, Model model) {
        farmacyRepository.save(n);
        model.addAttribute("farmacy", n);
        return "result"; //тоже html
    }
}