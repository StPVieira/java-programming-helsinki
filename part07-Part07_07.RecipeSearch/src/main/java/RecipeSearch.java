
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner.nextLine();

        ArrayList<Recipe> recipes = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String name = fileReader.nextLine();
                if (name.isEmpty()) {
                    continue;
                }
                int cookingTime = Integer.parseInt(fileReader.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        while (true) {
            System.out.println("");
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");

            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }else if(command.equals("find name")){
                System.out.println("Searched word: ");
                String searchedWord = scanner.nextLine();
                for(Recipe recipe : recipes){
                    if(recipe.getName().contains(searchedWord)){
                        System.out.println(recipe);
                    }
                }
            }else if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                for(Recipe recipe : recipes){
                    if(recipe.getCookingTime() <= maxCookingTime){
                        System.out.println(recipe);
                    }
                }
            }else if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                for(Recipe recipe : recipes){
                    for(String element : recipe.getIngredients()){
                        if(element.equals(ingredient)){
                            System.out.println(recipe);
                        }   
                    }
                }
                
            }else if (command.equals("stop")) {
                break;
            }   
            
        }
    }
}
