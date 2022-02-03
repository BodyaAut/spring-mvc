package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        CarService carService = new CarService();
        model.addAttribute("cars", carService.getSomeCars(count));
        return "cars";
    }
}
