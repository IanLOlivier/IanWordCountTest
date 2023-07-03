import za.co.ian.test.micorservice.textprocessingservice.core.WordFrequencyAnalyzer;
import za.co.ian.test.micorservice.textprocessingservice.core.impl.WordFrequencyAnalyzerImpl;
import za.co.ian.test.micorservice.textprocessingservice.model.WordFrequency;
import za.co.ian.test.micorservice.textprocessingservice.model.WordFrequencyFix;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        /*
         * Note Normally this will only contain code for entry point to main application such as
         * SpringApplication springApplication = new SpringApplication(Application.class);
         * springApplication.run(args)
         *
         * However for quick access for the coding test this was replaced with just calling the methods since these will
         * normally be helper methods to be used by other functions in a application
         */
        WordFrequencyAnalyzer test = new WordFrequencyAnalyzerImpl();
        String text = "the,The sun sun suN rises over the lake";
        String word = ("rises").toLowerCase();
        int number =  3;
        List<WordFrequency> testList = test.calculateMostFrequentNWords(text, number);
        //List<WordFrequencyFix> testList = test.calculateMostFrequentNWords(text, number);

        System.out.print(test.calculateHighestFrequency(text) + "\n");
        System.out.print(test.calculateFrequencyForWord(text, word)+ "\n");
        for  (WordFrequency wordfrequency : testList) {
            System.out.print(wordfrequency.getWord());
            System.out.print(wordfrequency.getFrequency() + "\n");
        }
    }
}
