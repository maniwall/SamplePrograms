package com.training.misc;

public class SampleBWCalculation {

	public static void main(String[] args) {
		
		String bandwidthString = "400 Mbps";
		String bandwidthStringWithoutGaps = bandwidthString.replaceAll("\\s+",""); 
		System.out.println("bandwidthStringWithoutGaps :: " + bandwidthStringWithoutGaps);
        
		String bandwidthStringNumbers = bandwidthStringWithoutGaps.substring(bandwidthStringWithoutGaps.length() - 4);
        System.out.println("bandwidthStringNumbers :: " + bandwidthStringNumbers);
        
        String bandwidthStringLetter = bandwidthStringWithoutGaps.replaceAll(bandwidthStringNumbers, "").trim();
        System.out.println("bandwidthStringLetter :: " + bandwidthStringLetter);
        
        // String[] values = {bandwidthStringLetter, bandwidthStringNumbers};

	}

}
