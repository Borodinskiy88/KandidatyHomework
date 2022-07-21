public class Candidate implements Comparable<Candidate> {
    protected String name;
    protected String gender;
    protected String age;
    protected int relevance;
    protected int rating;

    public Candidate(String name, String gender, String age, int relevance, int rating) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + ", пол " + gender + ", возраст " + age
                + ", оценка резюме " + relevance + ", рейтинг собеседования " + rating;
    }

    @Override
    public int compareTo(Candidate o) {
        if (relevance > o.relevance) {
            return -1;
        } else if (relevance < o.relevance) {
            return 1;
        } else if (rating > o.rating) {
            return -1;
        } else if (rating < o.rating) {
            return 1;
        } else {
            return name.compareTo(o.name);
        }

    }
}

