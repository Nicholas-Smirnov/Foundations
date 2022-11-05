package Society;

public class City {
    
    private Estate[][] City;

    public City() {
        City = new Estate[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                City[i][j] = new Estate();
            }
        }
    }

}
