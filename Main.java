public class Main {
    public static void main(String[] args) {
        University university = new University();

        Author author1 = new Author("Author 1");
        Author author2 = new Author("Author 2");

        university.addAuthor(author1);
        university.addAuthor(author2);

        // Adding publications for Author 1
        author1.addPublication(new Journal("Journal 1", 2021, 2, "Journal A", 2.0));
        author1.addPublication(new Journal("Journal 2", 2022, 2, "Journal B", 1.5));
        author1.addPublication(new ConferenceProceeding("Conf Proc 1", 2020, 2, "Volume X", true));
        author1.addPublication(new ConferenceProceeding("Conf Proc 2", 2021, 2, "Volume Y", false));

        // Adding publications for Author 2
        author2.addPublication(new Journal("Journal 3", 2022, 2, "Journal C", 2.5));
        author2.addPublication(new Journal("Journal 4", 2023, 2, "Journal D", 1.8));
        author2.addPublication(new ConferenceProceeding("Conf Proc 3", 2022, 2, "Volume Z", true));
        author2.addPublication(new ConferenceProceeding("Conf Proc 4", 2023, 2, "Volume W", false));

        // Compute scores for authors and the university
        double author1Score = author1.computeScore();
        double author2Score = author2.computeScore();
        double universityScore = university.computeScore();

        System.out.println("Author 1 Score: " + author1Score);
        System.out.println("Author 2 Score: " + author2Score);
        System.out.println("University Score: " + universityScore);
    }
}