package com.asifekbal.management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.asifekbal.management.Service.DevServiceImplement;
import com.asifekbal.management.Shema.Dev;

@Controller
public class DevController {
    @Autowired
    private DevServiceImplement devServiceImplement;

    @GetMapping("/getDev")
    public String viewAllDev(Model model) {

        model.addAttribute("allemplist", devServiceImplement.getDev());

        return "devTable";
    }

    @GetMapping("/addNewDev")
    public String addNewDev(Model model) {
        Dev dev = new Dev();
        model.addAttribute("dev", dev);
        return "newDev";
    }

    @PostMapping("/saveDev")
    public String saveDev(Dev dev) {

        devServiceImplement.addDev(dev);
        return "redirect:/getDev";
    }

    @GetMapping("/updateDev/{Id}")
    public String updateDevById(@PathVariable(value = "Id")long Id, Model model) {
        Dev dev = devServiceImplement.updateDevById(Id);
        model.addAttribute("dev", dev);
        return "updateDev";
    }

    @GetMapping("/deleteDev/{Id}")
    public String deleteDevById(@PathVariable(value = "Id")long Id) {
        this.devServiceImplement.deleteDevById(Id);
        return "redirect:/getDev";
    }

}
