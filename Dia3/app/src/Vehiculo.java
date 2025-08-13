public abstract class Vehiculo {
    private String Brand;
    private String Model;
    private int Year;
    private double Price;
    public Vehiculo(String valBrand, String valModel, int valYear, double valPrice){
        this.Brand = valBrand;
        this.Model = valModel;
        this.Year = valYear;
        this.Price = valPrice;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    public double getPrice() {
        return Price;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public void setYear(int year) {
        this.Year = year;
    }

    public void setPrice(double price) {
        this.Price = price;
    }
    public abstract double calculateDiscount();
    public void ShowInformation(){
        System.out.println("Marca: " + this.Brand + " " + this.Model + " " + this.Year + this.Price );
    }
}
