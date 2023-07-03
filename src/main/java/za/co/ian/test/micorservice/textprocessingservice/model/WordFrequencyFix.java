package za.co.ian.test.micorservice.textprocessingservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/*
 * I added this class to leverage Lombok that way this doesn't need to be an interface
 * can be tested by using commented out code in the other classes and tests
 */
@AllArgsConstructor
@Builder
@Data
public class WordFrequencyFix implements WordFrequency{
    private String word;
    private int frequency;

}
