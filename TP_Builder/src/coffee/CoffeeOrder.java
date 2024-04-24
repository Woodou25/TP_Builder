package coffee;

public class CoffeeOrder {
    private String coffeeType;
    private boolean lait;
    private boolean sucre;
    private String extras;

 // Constructeur pour créer une commande de café
    public CoffeeOrder(String coffeeType, boolean lait, boolean sucre, String extras) {
        this.coffeeType = coffeeType;
        this.lait = lait;
        this.sucre = sucre;
        this.extras = extras;
    }

 // Getter pour obtenir le type de café
    public String getCoffeeType() { return coffeeType; }
 // Getter pour vérifier si du lait est ajouté
    public boolean hasLait() { return lait; }
 // Getter pour vérifier si du sucre est ajouté
    public boolean hasSucre() { return sucre; }
 // Getter pour obtenir les extras
    public String getExtras() { return extras; }
}
