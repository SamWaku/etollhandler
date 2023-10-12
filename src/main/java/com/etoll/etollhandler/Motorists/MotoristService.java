package com.etoll.etollhandler.Motorists;
import org.springframework.stereotype.Service;


import java.util.List;

@Service

public class MotoristService {
    public List<Motorists> getMotorists(){
		return List.of(
			new Motorists(
					1L,
					"1",
					"prius",
					"BAD123"
			)
		);
	}
}
