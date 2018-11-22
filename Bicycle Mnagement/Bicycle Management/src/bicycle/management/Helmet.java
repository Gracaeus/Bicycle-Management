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
public class Helmet extends AdditionalExtras{
    
    public Helmet(Bicycle extras)
    {
        super(extras);
    }
    @Override
    public String getType()
    {
        return extras.getType() + ",Helmet";
    }
    @Override
    public double cost()
    {
        return extras.cost()+1.5;
    }
    
}
