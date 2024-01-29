public class Teste {
    public static void main(String[] args) {
        System.out.println("Zoo");

        System.out.println("---------------------------------");

        Animal animal = new Animal();
        animal.setNome("Camelo");
        animal.setComprimento(150);
        animal.setPatas(4);
        animal.setCor("Amarelo");
        animal.setAmbiente("terra");
        animal.setVelocidade(2.0);

        System.out.println("Nome: " + animal.getNome());
        System.out.println("Comprimento: " + animal.getComprimento() + " cm");
        System.out.println("Patas: " + animal.getPatas());
        System.out.println("Cor: " + animal.getCor());
        System.out.println("Ambinete: " + animal.getAmbiente());
        System.out.println("Velocidade: " + animal.getVelocidade() + " m/s");

        System.out.println("---------------------------------");

        Mamifero mamifero = new Mamifero();
        mamifero.setNome("Leão");
        mamifero.setComprimento(2.6);
        mamifero.setPatas(4);
        mamifero.setCor("Amarela");
        mamifero.setAmbiente("Terra");
        mamifero.setVelocidade(58);
        mamifero.setAlimento("Zebras, búfalos e javalis");

        System.out.println("Nome: " + mamifero.getNome());
        System.out.println("Comprimento: " + mamifero.getComprimento() + " cm");
        System.out.println("Patas: " + mamifero.getPatas());
        System.out.println("Cor: " + mamifero.getCor());
        System.out.println("Ambinete: " + mamifero.getAmbiente());
        System.out.println("Velocidade: " + mamifero.getVelocidade() + " m/s");
        System.out.println("Alimento: " + mamifero.getAlimento());

        System.out.println("---------------------------------");

        Peixe peixes = new Peixe();
        peixes.setNome("Tubarão");
        peixes.setComprimento(300);
        peixes.setPatas(0);
        peixes.setCor("Cinzento");
        peixes.setAmbiente("Mar");
        peixes.setVelocidade(1.5);
        peixes.setCaracteristicas("Barbatanas e cauda");

        System.out.println("Nome: " + peixes.getNome());
        System.out.println("Comprimento: " + peixes.getComprimento() + " cm");
        System.out.println("Patas: " + peixes.getPatas());
        System.out.println("Cor: " + peixes.getCor());
        System.out.println("Ambinete: " + peixes.getAmbiente());
        System.out.println("Velocidade: " + peixes.getVelocidade() + " m/s");
        System.out.println("Caracteristicas: " + peixes.getCaracteristicas());

        System.out.println("---------------------------------");
    }
}
