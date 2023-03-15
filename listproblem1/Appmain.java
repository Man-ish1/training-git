package listproblem1;

import java.util.ArrayList;
import java.util.List;

public class Appmain {
    public static void main(String[] args) {
        List<Dish> dishList=new ArrayList<>();

        Restaurants restaurants=new Restaurants(dishList);


        addDish(restaurants);

        restaurants.printMenu();
    }

    static void addDish(Restaurants restaurants){
      List<Dish> dishList=restaurants.getDishList();

        Dish dish1 = new Dish();
        dish1.setDishName("poha");
        dish1.setPrice(50);
        Dish dish2=new Dish();
        dish2.setDishName("samosa");
        dish2.setPrice(20);
        dishList.add(dish1);
        dishList.add(dish2);


    }

}
