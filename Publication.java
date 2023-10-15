abstract class Publication {
    private String name;
    private int apparitionDate;
    private int numberOfAuthors;

    public Publication(String name, int apparitionDate, int numberOfAuthors) {
        this.name = name;
        this.apparitionDate = apparitionDate;
        this.numberOfAuthors = numberOfAuthors;
    }

    public abstract double computeScore();
}