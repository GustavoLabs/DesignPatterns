package singleton;

public class School {

    private String name;
    private String adress;

    private static final School INSTANCE = new School();

    private School() {
        this.name = "Code Academy";
        this.adress = "999 Lumien, Zanaga, NO 13460-000, BR";
    }

    public static School getInstance(){
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

}
