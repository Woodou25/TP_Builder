package coffee;

public class Main {
    public static void main(String[] args) {
        // Création du premier café : un Espresso avec du lait
        CoffeeOrder order1 = new CoffeeOrderBuilder()
                                .setCoffeeType("Espresso")  // Définit le type de café comme "Espresso"
                                .setLait(true)  // Ajoute du lait à la commande
                                .build();  // Construit l'objet CoffeeOrder en utilisant le Builder

        // Création du deuxième café : un Latte avec du sucre et des extras (Chocolat)
        CoffeeOrder order2 = new CoffeeOrderBuilder()
                                .setCoffeeType("Latte")  // Définit le type de café comme "Latte"
                                .setSucre(true)  // Ajoute du sucre à la commande
                                .setExtras("Chocolat")  // Ajoute du chocolat comme extra
                                .build();  // Construit l'objet CoffeeOrder en utilisant le Builder

        // Affichage des détails de la première commande de café
        System.out.println("Order 1: " + order1.getCoffeeType() + (order1.hasLait() ? ", avec du lait" : ""));
        
        // Affichage des détails de la deuxième commande de café, y compris les extras
        System.out.println("Order 2: " + order2.getCoffeeType() + (order2.hasSucre() ? ", avec du sucre" : "") + ", Extras: " + order2.getExtras());
    }
}