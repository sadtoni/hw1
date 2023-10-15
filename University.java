import java.util.ArrayList;

class University {
    private ArrayList<Author> authors;

    public University() {
        authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
        author.setUniversity(this);
    }

    public double computeScore() {
        double totalScore = 0;
        for (Author author : authors) {
            totalScore += author.computeScore();
        }
        return totalScore;
    }
}