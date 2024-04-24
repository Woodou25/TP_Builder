package coffee;

public class CoffeeOrderBuilder {
    private String coffeeType;
    private boolean lait = false;
    private boolean sucre = false;
    private String extras;

    // Setter pour le type de café
    public CoffeeOrderBuilder setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
        return this;
    }

    // Setter pour l'option lait
    public CoffeeOrderBuilder setLait(boolean lait) {
        this.lait = lait;
        return this;
    }

    // Setter pour l'option sucre
    public CoffeeOrderBuilder setSucre(boolean sucre) {
        this.sucre = sucre;
        return this;
    }

    // Setter pour ajouter des extras
    public CoffeeOrderBuilder setExtras(String extras) {
        this.extras = extras;
        return this;
    }

    // Méthode pour construire et retourner une nouvelle commande CoffeeOrder
    public CoffeeOrder build() {
        return new CoffeeOrder(coffeeType, lait, sucre, extras);
    }
}