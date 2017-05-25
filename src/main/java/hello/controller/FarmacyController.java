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
    private FarmacyRepository personRepository;


    @RequestMapping("/list")
    public String person (Model model) {
        model.addAttribute("person", personRepository.findAll());
        return "person";
    }

    @RequestMapping("/add")
    public @ResponseBody
    String addNewFarmacy(@RequestParam  String fName, @RequestParam String dName, @RequestParam String dSurname, @RequestParam String dMiddleName, @RequestParam int fBuild) {
        Farmacy n = new Farmacy();
        n.setFName(fName);
        n.setDSurname(dSurname);
        n.setDName(dName);

        personRepository.save(n);
        return "Saved";
    }
    @RequestMapping("/all")
    public @ResponseBody Iterable<Farmacy> getAllFarmacy(){
        return FarmacyRepository.findAllFarmacy();
    }
    @RequestMapping(value="/person", method= RequestMethod.GET)
    public String personForm(Model model) {
        model.addAttribute("person", new Farmacy());
        return "person";
    }

    @RequestMapping(value="/person", method=RequestMethod.POST)
    public String personSubmit(@ModelAttribute Farmacy n, Model model) {
        personRepository.save(n);
        model.addAttribute("person", n);
        return "result";
    }


}