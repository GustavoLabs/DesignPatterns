package factoryMethod.Human;

public class FactoryHuman {

    private int age;


    public Human createNewPersonByAge(int age){
        if (age >= 0 && age <= 2){
            return new Baby();
        } else if (age >= 3 && age <= 15){
            return new LittleKid();
        } else if(age >= 16 && age <= 22){
            return new Teenager();
        }else if(age >= 23 && age <= 50){
            return new Adult();
        } else if(age >= 51){
            return new Aged();
        }else{
            System.out.println("Put a valid age");
            return null;
        }
    }
}
