package com.nicocam.nicocamapi.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/nicocam/api/cam")
public class CamController {

    @PostMapping()
    public @ResponseBody String RotateCam(@RequestParam("orientation") String orientation,
                                          @RequestParam("angle") int angle)  {



        return "cam rotated to " + orientation + " " + angle + " degrees";
    }

}



