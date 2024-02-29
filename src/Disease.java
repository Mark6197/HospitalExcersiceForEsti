import enums.DiseaseDescription;
import util.RandomUtil;

import java.util.Arrays;

public class Disease {

    private DiseaseDescription diseaseDescription;
    private int timeToRecover;

    public Disease() {
        this.diseaseDescription = RandomUtil.generateRandomDiseaseDescription();
        this.timeToRecover = RandomUtil.getRandomDay(3,22);
    }

    @Override
    public String toString() {
        return "Disease " +
                "diseaseDescription:" + diseaseDescription +
                ", timeToRecover:" + timeToRecover;
    }
}
