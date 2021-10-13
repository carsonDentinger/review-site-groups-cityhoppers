package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.repos.CityRepo;
import org.wecancodeit.reviews.repos.HashRepo;
import org.wecancodeit.reviews.repos.RegionsRepo;


@Controller
public class CityController {
    private CityRepo cityRepo;
    private HashRepo hashRepo;
    private RegionsRepo regionsRepo;

    public CityController(CityRepo cityRepo, HashRepo hashRepo, RegionsRepo regionsRepo) {
        this.cityRepo = cityRepo;
        this.hashRepo = hashRepo;
        this.regionsRepo = regionsRepo;
    }

    @RequestMapping("/")
    public String getHomePage(Model introModel) {
        return "reviewHome";
    }

    @RequestMapping("/CityReviewsList")
    public String getCityReviews(Model cityModel) {
        cityModel.addAttribute("Cities", cityRepo.findAll());
        return "CityReviewList";
    }

    @RequestMapping("/Regions")
    public String getRegions(Model regionModel) {
        regionModel.addAttribute("Regions", regionsRepo.findAll());
        return "Regions";
    }

    @RequestMapping("/Hashtag")
    public String getHashPage(Model hashModel) {
        hashModel.addAttribute("Hashtag", hashRepo.findAll());
        return "Hashtag";
    }

    @RequestMapping("/SubRegion/{id}")
    public String getSubRegion(Model subRegionModel, @PathVariable Long id) {
        subRegionModel.addAttribute("SubRegion", regionsRepo.findById(id).get());
        return "SubRegion";
    }

    @RequestMapping("/SubHashPage/{id}")
    public String getSubHashPage(Model subHashModel, @PathVariable Long id) {
        subHashModel.addAttribute("SubHashPage", hashRepo.findById(id).get());
        return "SubHash";

    }

}
