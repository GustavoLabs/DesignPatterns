package builder.churrosBuilders;

public class Churros {

    private String coating;
    private String sauce;


    public String getCoating() {
        return coating;
    }

    public void setCoating(String coating) {
        this.coating = coating;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String toString(){
        return String.format("-- New Churros -- \n Sauce: %s Coating:%s\n", sauce, coating);
    }
}
