public class uas {
    import java.util.Arrays;

    class Film {
        private int id;
        private String title;
        private int year;
        private double rating;

        public Film(int id, String title, int year, double rating) {
            this.id = id;
            this.title = title;
            this.year = year;
            this.rating = rating;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }

        public double getRating() {
            return rating;
        }

        @Override
        public String toString() {
            return "Film [ID: " + id + ", Title: " + title + ", Year: " + year + ", Rating: " + rating + "]";
        }
    }

    public class FilmTerlarisApp {
        public static void main(String[] args) {
            // Membuat array film
            Film[] films = {
                    new Film(1, "Film A", 2020, 8.5),
                    new Film(2, "Film B", 2019, 7.9),
                    new Film(3, "Film C", 2021, 9.2),
                    new Film(4, "Film D", 2018, 8.1),
                    new Film(5, "Film E", 2022, 9.5)
            };

            // Menampilkan semua film terlaris
            System.out.println("Daftar Film Terlaris:");
            for (Film film : films) {
                System.out.println(film);
            }

            // Mengurutkan film berdasarkan rating menggunakan Selection Sort
            selectionSort(films);

            // Menampilkan film setelah diurutkan
            System.out.println("\nDaftar Film Terurut berdasarkan Rating:");
            for (Film film : films) {
                System.out.println(film);
            }
        }

        public static void selectionSort(Film[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j].getRating() < arr[minIdx].getRating()) {
                        minIdx = j;
                    }
                }

                // Swap elemen terkecil dengan elemen pada indeks i
                Film temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
