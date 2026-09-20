class ProductFilter{

    public void filterProducts(String category){
        System.out.println("Filtering by Category: " + category);
    }

    public void filterProducts(double minPrice, double maxPrice){
        System.out.println("Filtering by Price Range: $" + minPrice + "-$" + maxPrice);
    }

    public void filterProducts(String brand, boolean isBrandSearch){
        if(isBrandSearch){
            System.out.println("Filtering by Brand: " + brand);
        }
        else{
            filterProducts(brand);
        }
    }

    public void filterProducts(String category, double minPrice, double maxPrice){
        System.out.println("Filtering by Category: " + category + " | Price: $" +minPrice + "-$" + maxPrice);
    }

    public void filterProducts(String category, double minPrice, double maxPrice, String brand){
        System.out.println("Filtering by Category: " + category + " | Price: $" + minPrice + "-$" + maxPrice + " | Brand: " + brand);
    }
}

public class P_4_2 {
    public static void main(String[] args) {
        ProductFilter f = new ProductFilter();

        f.filterProducts("Electronics");
        f.filterProducts(100.0, 500.0);
        f.filterProducts("Apple", true);
        f.filterProducts("Fashion", 50.0, 200.0);
        f.filterProducts("Electronics", 200.0, 1000.0, "Sony");
    }
}
