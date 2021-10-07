package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class CityController {

    @Resource
    private CityRepository cityRepo;

    public CityController (CityRepository cityRepo){
        this.cityRepo = cityRepo;
    }

    @RequestMapping("/")
    public String getHomePage(Model introModel){
        return null;
    }

    @RequestMapping("/CityReviews")
    public String getCityRepo(Model cityModel){
        cityModel.addAttribute("City", cityRepo.getById(1l));
        cityModel.addAttribute("Cities", cityRepo.getCities().values());
        return "CityLists";
    }


}
