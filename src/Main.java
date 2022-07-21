import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Candidate> set = new TreeSet<>();
        set.add(new Candidate
                ("Лермонтов Михаил Юрьевич", "мужской", "26", 2, 4));
        set.add(new Candidate
                ("Толстой Лев Николаевич", "мужской", "82", 5, 5));
        set.add(new Candidate
                ("Чехов Антон Павлович", "мужской", "44", 4, 3));
        set.add(new Candidate
                ("Гоголь Николай Васильевич", "мужской", "42", 3, 2));
        set.add(new Candidate
                ("Бунин Иван Алексеевич", "мужской", "83", 2, 2));
        set.add(new Candidate
                ("Достоевский Федор Михайлович", "мужской", "59", 5, 5));
        set.add(new Candidate
                ("Булгаков Михаил Афанасьевич", "мужской", "48", 3, 2));
        set.add(new Candidate
                ("Барто Агния Львовна", "женский", "80", 2, 1));
        set.add(new Candidate
                ("Ахматова Анна Андреевна", "женский", "76", 2, 3));
        set.add(new Candidate
                ("Солженицын Александр Исаевич", "мужской", "89", 4, 4));
        set.add(new Candidate
                ("Маяковский Владимир Владимирович", "мужской", "36", 3, 2));

        System.out.println();

        for (Candidate c : set) {
            System.out.println(c);
        }

    }
}
