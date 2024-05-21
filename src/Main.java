public class Main {
    public static void main(String[] args) {
    Media media = new Media();

    media.setNota1(9);
    media.setNota2(8);
    media.setNota3(7);
    media.setNota4(6);

    media.media();
    media.imprimeMedia();

    Media media2 = new Media();

    media2.setNota1(8.5F);
    media2.setNota2(8);
    media2.setNota3(5.5F);
    media2.setNota4(10);

    media2.media();
    media2.imprimeMedia();
    }
}