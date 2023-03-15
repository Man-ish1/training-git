package listproblem1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Restaurants {
    List<Dish> dishList;

    public List<Dish> getDishList(){
        return  dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }
     public Restaurants(List<Dish> dishList){
        this.dishList=dishList;
     }
    public Restaurants(){
        this.dishList=new ArrayList<>();
    }
     public void printMenu(){
         ListIterator<Dish> listIterator= this.dishList.listIterator();
         while(listIterator.hasNext()){
             Dish d1=listIterator.next();
             System.out.println("DishName:"+d1.getDishName()+", price:"+d1.getPrice());
         }
     }
}
