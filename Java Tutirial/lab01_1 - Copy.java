public class lab01_1 {
    public static void main(String[] args) {
        int birth_people = (60 * 60 * 24 * 365) / 7;

        int death_people = (60 * 60 * 24 * 365) / 13;

        int new_immigrant_people = (60 * 60 * 24 * 365) / 45;

        int people = 312032486;

        int total_people;

        int population_years;

        System.out.println("The program show the amount of population in 5 years in each year");
        
        System.out.println("");

        for (int i = 1; i <= 5; i++) {
            total_people = people + birth_people + new_immigrant_people - death_people;

            population_years = total_people;

            System.out.println(i + "year.The amount of population is " + population_years);

            System.out.println("");

            people = population_years;

            total_people = 0;
        }

    }
}
