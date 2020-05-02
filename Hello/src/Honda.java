public class Honda extends Car {
    String brand="honda",model;
    void brand(String brand){
       this.brand=brand;
    }
    void model(String model){
        this.model=model;

    }
    void brandandmodel(){
        System.out.println("Brand is:"+brand);
        System.out.println("Model is:"+model);
    }
    public static void main(String[] args)
    {
        Honda myhonda=new Honda();

        myhonda.numberofwheels(4);
        myhonda.numberofdoors(2);
        System.out.println(myhonda.brand);
        myhonda.brand("Toyota");

        myhonda.model("Civic");
        myhonda.brandandmodel();

    }
}
