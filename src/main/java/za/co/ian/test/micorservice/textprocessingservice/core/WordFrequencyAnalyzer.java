package za.co.ian.test.micorservice.textprocessingservice.core;

import za.co.ian.test.micorservice.textprocessingservice.model.WordFrequency;
import za.co.ian.test.micorservice.textprocessingservice.model.WordFrequencyFix;

import java.util.List;

public interface WordFrequencyAnalyzer {
    int calculateHighestFrequency(String text);
    int calculateFrequencyForWord (String text, String word);
    List<WordFrequency> calculateMostFrequentNWords (String text, int n);
    //List<WordFrequencyFix> calculateMostFrequentNWords (String text, int n);
}
