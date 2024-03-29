package enums;

public enum DiseaseDescription {
    TUBERCULOSIS(0),
    PNEUMONIA(1),
    COVID19(2),
    FRACTURE(3),
    CARDIO(4);

    private final int value;

    DiseaseDescription(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

