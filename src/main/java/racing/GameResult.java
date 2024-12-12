package racing;

public class GameResult {
    private String status;
    private final String EMOJI ="\uD83C\uDFCE\uFE0F";
    private final String load ="-";


    public GameResult(String status) {
        this.status = status;
    }

    public GameResult() {
    }
    public void gameStart(Car name){

    }


    public String getStatus() {
        return status;
    }

    public String getEMOJI() {
        return EMOJI;
    }

    public String getLoad() {
        return load;
    }
}
