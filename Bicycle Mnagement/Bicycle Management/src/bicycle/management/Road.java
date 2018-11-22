/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle.management;

/**
 *
 * @author nkhonculada
 */
public class Road extends Bicycle{
    int amountAvailable;
    public Road ()
    {
        this.typeOfBike = "Road Bike";
        amountAvailable=10;
    }
    @Override
    public double cost()
    {
        return 10.00;
    }
    
    public void Take()
    {
        amountAvailable-=1;
    }
    public void Return()
    {
        amountAvailable+=1;
    }
    
}
