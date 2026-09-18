public class Movies {
    static void main(){

        int gräns = 120;
        // film1 som skapas här under är som en vägskylt som pekar på en plats i minnet där ett objekt av typen Film skapas samtidigt.
        // Till höger om likhetstecknet skapas själva Film-objektet.
        // För att hämta saker från objektet anger man namnet på vägskylten och vilken sak man vill ha.
        // Vill man ha titeln på filmen i film1 skriver man film1.title().
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
    //record bestämmer vad som kan finnas i en behållare av typen Film.
    record Film(String title, String director, int time){

    }
}
