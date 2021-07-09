package builder.burguerBuilders;

public class Hamburger {

    private String bread;
    private String sauce;
    private String meat;

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String toString(){
        return "New Burguer -- \n Bread:" + bread + " Sauce:" + sauce + " Meat:"+ meat + "\n";
    }
}
