public class Movies {
    static void main(){

        int gräns = 120;

        Film film1 = new Film("Alien","Ridley Scott", 117);
        Film film2 = new Film ("Jaws", "Steven Spielberg", 124);

        IO.println(kontrollera(film1, gräns));
        IO.println(kontrollera(film2, gräns));
    }

    static String kontrollera(Film f, int gräns){
        if (f.time<gräns)
            return f.title + " är kortare än gränsen.";

        return  f.title + " är längre än gränsen.";

    }

    record Film(String title, String director, int time){

    }
}
