package com.kata.gbsuftblai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.kata.gbsuftblai.services.GbsuFtbLaiService;


@RestController
@RequestMapping("/gbsu-ftb-lai")
public class GbsuFtbLaiController {

	@Autowired
	private GbsuFtbLaiService gbsuFtbLaiService;
	
	
    @GetMapping(value = "/{inputNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = {"http://localhost:8090", "http://localhost:4200"})
    public ResultDto convertNumber(@PathVariable(name = "inputNumber") int inputNumber) {
        return new ResultDto(gbsuFtbLaiService.convertNumber(inputNumber));
    }

    class ResultDto {
    	private String result;
    	
    	ResultDto(String result) {
    		this.setResult(result);
    	}

		public String getResult() {
			return result;
		}

		public void setResult(String result) {
			this.result = result;
		}
    }

}
