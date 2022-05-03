package one.digitalinovation.basecamp;

class MessageDia {

    public static void obterMessagensDia(int hours) {
        if(hours <= 11) {
            bomDia();
        } else if(hours <= 16) {
            boaTarde();
        } else if(hours <= 24) {
            boaNoite();
        }
    }

    private static void bomDia() {
        System.out.println("Bom dia!!");
    }
    private static void boaTarde() {
        System.out.println("Boa tarde!!");
    }
    private static void boaNoite() {
        System.out.println("Boa noite!!");
    }
}
