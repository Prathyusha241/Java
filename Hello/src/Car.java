public class Car extends Vehicle{
int noofdoors;
void numberofdoors(int noofdoors){
    this.noofdoors=noofdoors;
    System.out.println("Number of doors:"+this.noofdoors);
}
public static void main(String[] args){
    Car mycar=new Car();
            mycar.numberofwheels(4);
            mycar.numberofdoors(4);
}
}
