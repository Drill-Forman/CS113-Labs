public class WomenInStem {
    private static final String DEFAULT_NAME = "Unknown";
    private static final String DEFAULT_FIELD = "General STEM";
    private static final int DEFAULT_YEAR = 1900;
    private static final String DEFAULT_CONTRIBUTION = "N/A";
    private static final String DEFAULT_RECOGNIZED_FOR = "N/A";

    private String name;
    private String field;
    private int yearOfContribution;
    private String contribution;
    private String recognizedFor;

    public WomenInStem() {
        setAll(DEFAULT_NAME, DEFAULT_FIELD, DEFAULT_YEAR, DEFAULT_CONTRIBUTION, DEFAULT_RECOGNIZED_FOR);
    }

    public WomenInStem(String name, String field, int yearOfContribution, String contribution, String recognizedFor) {
        setAll(name, field, yearOfContribution, contribution, recognizedFor);
    }

    public WomenInStem(WomenInStem other) {
        if (other != null) {
            setAll(other.name, other.field, other.yearOfContribution, other.contribution, other.recognizedFor);
        } else {
            setAll(DEFAULT_NAME, DEFAULT_FIELD, DEFAULT_YEAR, DEFAULT_CONTRIBUTION, DEFAULT_RECOGNIZED_FOR);
        }
    }

    public boolean setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
            return true;
        }
        return false;
    }

    public boolean setField(String field) {
        if (field != null && !field.trim().isEmpty()) {
            this.field = field;
            return true;
        }
        return false;
    }

    public boolean setYearOfContribution(int yearOfContribution) {
        if (yearOfContribution >= 1900 && yearOfContribution <= 2026) {
            this.yearOfContribution = yearOfContribution;
            return true;
        }
        return false;
    }

    public boolean setContribution(String contribution) {
        if (contribution != null && !contribution.trim().isEmpty()) {
            this.contribution = contribution;
            return true;
        }
        return false;
    }

    public boolean setRecognizedFor(String recognizedFor) {
        if (recognizedFor != null && !recognizedFor.trim().isEmpty()) {
            this.recognizedFor = recognizedFor;
            return true;
        }
        return false;
    }

    public boolean setAll(String name, String field, int yearOfContribution, String contribution, String recognizedFor) {
        boolean nameValid = setName(name);
        boolean fieldValid = setField(field);
        boolean yearValid = setYearOfContribution(yearOfContribution);
        boolean contribValid = setContribution(contribution);
        boolean recValid = setRecognizedFor(recognizedFor);

        return nameValid && fieldValid && yearValid && contribValid && recValid;
    }

    public String getName() { return name; }
    public String getField() { return field; }
    public int getYearOfContribution() { return yearOfContribution; }
    public String getContribution() { return contribution; }
    public String getRecognizedFor() { return recognizedFor; }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Field: " + field + "\n" +
               "Year of Contribution: " + yearOfContribution + "\n" +
               "Contribution: " + contribution + "\n" +
               "Recognized For: " + recognizedFor;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof WomenInStem)) {
            return false;
        }
        WomenInStem o = (WomenInStem) other;
        return this.name.equals(o.name) &&
               this.field.equals(o.field) &&
               this.yearOfContribution == o.yearOfContribution &&
               this.contribution.equals(o.contribution) &&
               this.recognizedFor.equals(o.recognizedFor);
    }
}
