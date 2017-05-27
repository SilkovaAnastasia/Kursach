package hello.controller;

import hello.model.Farmacy;
import hello.repository.FarmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        return "farmacies";
    }

    @RequestMapping("/add")
    public @ResponseBody
    String addNewFarmacy(@RequestParam (value = "farmacy_name", required = true) String fName,
                         @RequestParam (value = "director_name", required = true) String fdName,
                         @RequestParam (value = "director_surname", required = true) String fdSurname,
                         @RequestParam (value = "director_middle_name", required = true) String fdMiddleName,
                         @RequestParam (value = "build_number", required = true) int fBuild,
                         @RequestParam (value = "street", required = true) String fStreet,
                         @RequestParam (value = "city", required = true) String fCity,
                         @RequestParam (value = "country", required = true) String fCountry,
                         @RequestParam (value = "index", required = true) int fIndex,
                         Model model) {
        Farmacy n = new Farmacy();
        n.setFName(fName);
        n.setFDSurname(fdSurname);
        n.setFDName(fdName);
	    n.setFDMiddleName(fdMiddleName);
	    n.setFBuild(fBuild);
	    n.setFStreet(fStreet);
	    n.setFCity(fCity);
	    n.setFCountry(fCountry);
	    n.setFIndex(fIndex);

        farmacyRepository.save(n);
        return "farmacies";
    }

    @RequestMapping("/all")
    public @ResponseBody Iterable<Farmacy> getAllFarmacy(){
        return farmacyRepository.findAll();
    }

    @RequestMapping(value="/farmacy", method= RequestMethod.GET)
    public String farmacyForm(Model model) {
        Farmacy f = new Farmacy();
        model.addAttribute("farmacy", f);
        return "main";
    }

    @RequestMapping(value="/farmacy", method=RequestMethod.POST)
    public String farmacySubmit(@ModelAttribute Farmacy n, Model model) {
        farmacyRepository.save(n);
        model.addAttribute("farmacy", n);
        return "main";
    }
}
