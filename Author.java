import java.util.ArrayList;

class Author {
    private String name;
    private University university;
    private ArrayList<Publication> publications;

    public Author(String name) {
        this.name = name;
        publications = new ArrayList<>();
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    public double computeScore() {
        double totalScore = 0;
        for (Publication publication : publications) {
            totalScore += publication.computeScore();
        }
        return totalScore;
    }
}
