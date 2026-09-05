public class SuporteVida {
    public static void main(String[] args) {
        monitorarAmbiente();
    }

    public static void monitorarAmbiente() {
        int oxigenio = 98;
        double pressao = 1.0;
        System.out.println("--- MÓDULO DE SUPORTE DE VIDA ---");
        System.out.println("Nível de Oxigênio: " + oxigenio + "%");
        System.out.println("Pressão Interna: " + pressao + " atm");
        System.out.println("Status: Sistema Operacional e Estável.");
    }
}