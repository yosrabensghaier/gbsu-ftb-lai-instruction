package com.kata.gbsuftblai.services;

import org.springframework.stereotype.Component;

@Component
public class GbsuFtbLaiService {

	public String convertNumber(int inputNumber) {
		String input = String.valueOf(inputNumber);
		String output = "";

		if (inputNumber % 3 == 0) {
			output += "Gbsu";
		}
		if (inputNumber % 5 == 0) {
			output += "Ftb";
		}

		output += input.replaceAll("3", "Gbsu").replaceAll("5", "Ftb").replaceAll("7", "Lai").replaceAll("\\d", "");

		if (!output.isEmpty()) {
			return output;
		}
		return input;
	}

}