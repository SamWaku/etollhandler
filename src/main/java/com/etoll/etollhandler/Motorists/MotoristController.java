package com.etoll.etollhandler.Motorists;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/motorist")
public class MotoristController {

    private final MotoristService motoristService;

    public MotoristController(MotoristService motoristService) {
        this.motoristService = motoristService;
    }

    @RequestMapping("/get-motorist")
	public List<Motorists> getMotorists(){
		return motoristService.getMotorists();
	}
}
