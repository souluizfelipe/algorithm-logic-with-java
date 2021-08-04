public class ShoppingCart {
    public static void main(String[] args) {

        Double[] shoppingCart = new Double[] {150.0, 10.0, 220.98, 492.50};
        Double total = 0.0;

        for(int i = 0; i  < shoppingCart.length; i++){
            total += shoppingCart[i];
        }

        System.out.println("O total da compra é de R$ " + total);
    }
}
