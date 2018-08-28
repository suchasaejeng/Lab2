public class OX {
    String table[][] = {
            {" ","0","1","2"},
            {"0","-","-","-"},
            {"1","-","-","-"},
            {"2","-","-","-"},
    };
    private String currentplayer;

    public OX(){
        currentplayer = "X";
    }

    public String getTableString() {
        String result = "";
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                result = result + table[i][j];
            }
            result = result + "\n";
        }
        return result;
    }

    public String getCurrnetPlayer() {
        return currentplayer;
    }

    public void switchPlayer() {
        if( currentplayer.equals("X") ){
            currentplayer = "O";
        }else {
            currentplayer = "X";
        }
    }


    public boolean put(int col, int row) {
        try {
            if (!table[row + 1][col + 1].equals("-")) {
                return false;
            }
            table[row + 1][col + 1] = currentplayer;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
        return true;

    }

    public String get(int col, int row) {
        if(col > 2 || col < 0 || row > 2 || row < 0) {
            return null;
        }
        return table[row+1][col+1];
    }
}
