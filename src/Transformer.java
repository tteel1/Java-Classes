public class Transformer {

    private String name;
    private String type;
    private Boolean goodGuy;


    public Transformer(){
        this.name = "Optimus";
        this.type = "Vehicle";
        this.goodGuy = true;

    }

    public Transformer (String name, String type){
        this.name = name;
        this.type = type;
    }

    public  Transformer (String name, String type, Boolean goodGuy){
        this.name = name;
        this.type= type;
        this.goodGuy= goodGuy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getGoodGuy() {
        return goodGuy;
    }

    public void setGoodGuy(Boolean goodGuy) {
        this.goodGuy = goodGuy;
    }

    public String rollOut(){
        if (this.goodGuy)
            return "AUTOBOTS ROLL OUT!";
        else{
            return "Decepticons, ATTACK";
        }


    }
}
