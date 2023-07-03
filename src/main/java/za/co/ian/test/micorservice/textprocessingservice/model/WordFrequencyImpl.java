package za.co.ian.test.micorservice.textprocessingservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class WordFrequencyImpl implements WordFrequency{
    private String word;
    private int frequency;

    @Override
    public String getWord() {
        return word;
    }

    @Override
    public int getFrequency() {
        return frequency;
    }
}
