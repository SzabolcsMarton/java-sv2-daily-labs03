package day04;

public class Prison {
    private boolean[] cells = new boolean[100];
    //tombnel feltolti 100 false ertekkel
    public  void openFreeCells(){
        for(int i = 0; i < cells.length; i++){
            for(int j = i; j < cells.length; j +=(i+1)){
                    cells[j] = !cells[j];
            }
        }
    }

    public boolean[] getCells() {
        return cells;
    }
}
