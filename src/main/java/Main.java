import zemberek.morphology.TurkishMorphology;
import zemberek.morphology.analysis.SingleAnalysis;

public class Main {
    public static void main(String[] args) throws Exception {
        TurkishMorphology morphology = TurkishMorphology.createWithDefaults();
        var results = morphology.analyzeSentence("Merhaba dünya. Bugün hava çok güzel.");

        for (var result : results) {
            for (SingleAnalysis analysis : result) {
                System.out.println(analysis.formatLong());
            }
        }
    }
}
