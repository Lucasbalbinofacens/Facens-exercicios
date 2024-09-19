public class AlgoIdade {
    public static void main(String[] args) {
        
        int valor = 61;

        if(valor >= 1 && valor <= 12) {
            System.out.println("Criança");
        }
        if(valor > 12 && valor <= 18) {
            System.out.println("Adolescente");
        }
        if(valor > 18 && valor <= 60) {
            System.out.println("Adulto");
        }
        if(valor > 60 && valor <= 99) {
            System.out.println("Idoso");
        }
    }
}