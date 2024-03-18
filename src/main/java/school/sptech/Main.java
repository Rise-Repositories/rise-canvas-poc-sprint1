package school.sptech;

public class Main {
    public static void main(String[] args) {
        Ong[] ongs = {
                new Ong("cachorrinhos e amor", "cachorrinho@gmail.com", "123", "123456789"),
                new Ong("ong passaro", "passaros@ong.com","123", "123456789"),
                new Ong("ong gato", "contato.gatinhos@gmail.com", "123", "123456789"),
                new Ong("ong do amor", "maisAmor@outlook.com", "123", "123456789")
        };


        Sort.byName(ongs);
        System.out.println("Ordenado por Nome-----------------");
        for (Ong ong : ongs) {
            System.out.println(ong);
        }

        System.out.println("\nOrdenado por Email-----------------");
        Sort.byEmail(ongs);
        for (Ong ong : ongs) {
            System.out.println(ong);
        }


    }
}
