class ConferenceProceeding extends Publication {
    private String volumeName;
    private boolean indexed;

    public ConferenceProceeding(String name, int apparitionDate, int numberOfAuthors, String volumeName, boolean indexed) {
        super(name, apparitionDate, numberOfAuthors);
        this.volumeName = volumeName;
        this.indexed = indexed;
    }

    @Override
    public double computeScore() {
        if (indexed) {
            return 0.25 / getNumberOfAuthors();
        } else {
            return 0.2 / getNumberOfAuthors();
        }
    }

    private double getNumberOfAuthors() {
        return 0;
    }
}