package com.example.tictactoe;

public class TicTacToeField {



    private Figure[][] winnerMatrix = new Figure[3][3];

    private int circleCountWin = 0;
    private int crossCountWin = 0;

    private boolean winFlag;

    public boolean isWinFlag() {
        return winFlag;
    }

    public void setWinFlag(boolean winFlag) {
        this.winFlag = winFlag;
    }

    public void resetWinnerMatrix() {
        this.winnerMatrix = new Figure[3][3];
    }

    public int getCircleCountWin() {
        return circleCountWin;
    }

    public int getCrossCountWin() {
        return crossCountWin;
    }


    public void setFigureInMatrix(Figure figure, int row, int col) {
        winnerMatrix[row][col] = figure;
        checkTheColoumns();
        checkTheRows();
        checkTheDiagonal();

    }

    public void checkTheRows () {
        if (winnerMatrix[0][0] == Figure.CIRCLE && winnerMatrix[0][1] == Figure.CIRCLE && winnerMatrix[0][2] == Figure.CIRCLE) {
            circleCountWin++;
            winFlag = true;
        }

       else if (winnerMatrix[1][0] == Figure.CIRCLE && winnerMatrix[1][1] == Figure.CIRCLE && winnerMatrix[1][2] == Figure.CIRCLE) {
            circleCountWin++;
            winFlag = true;
                    }

       else if (winnerMatrix[2][0] == Figure.CIRCLE && winnerMatrix[2][1] == Figure.CIRCLE && winnerMatrix[2][2] == Figure.CIRCLE) {
            circleCountWin++;
            winFlag = true;
                   }



        if (winnerMatrix[0][0] == Figure.CROSS && winnerMatrix[0][1] == Figure.CROSS && winnerMatrix[0][2] == Figure.CROSS) {
            crossCountWin++;
            winFlag = true;
                   }

        else if (winnerMatrix[1][0] == Figure.CROSS && winnerMatrix[1][1] == Figure.CROSS && winnerMatrix[1][2] == Figure.CROSS) {
            crossCountWin++;
            winFlag = true;
                    }

        else if (winnerMatrix[2][0] == Figure.CROSS && winnerMatrix[2][1] == Figure.CROSS && winnerMatrix[2][2] == Figure.CROSS) {
            crossCountWin++;
            winFlag = true;
                    }

    }


    public void checkTheColoumns () {
        if (winnerMatrix[0][0] == Figure.CIRCLE && winnerMatrix[1][0] == Figure.CIRCLE && winnerMatrix[2][0] == Figure.CIRCLE) {
            circleCountWin++;
            winFlag = true;
                  }

        else if (winnerMatrix[0][1] == Figure.CIRCLE && winnerMatrix[1][1] == Figure.CIRCLE && winnerMatrix[2][1] == Figure.CIRCLE) {
            circleCountWin++;
            winFlag = true;
        }

        else if (winnerMatrix[0][2] == Figure.CIRCLE && winnerMatrix[1][2] == Figure.CIRCLE && winnerMatrix[2][2] == Figure.CIRCLE) {
            circleCountWin++;
            winFlag = true;
        }



        if (winnerMatrix[0][0] == Figure.CROSS && winnerMatrix[1][0] == Figure.CROSS && winnerMatrix[2][0] == Figure.CROSS) {
            crossCountWin++;
            winFlag = true;
        }

        else if (winnerMatrix[0][1] == Figure.CROSS && winnerMatrix[1][1] == Figure.CROSS && winnerMatrix[2][1] == Figure.CROSS) {
            crossCountWin++;
            winFlag = true;
        }

        else if (winnerMatrix[0][2] == Figure.CROSS && winnerMatrix[1][2] == Figure.CROSS && winnerMatrix[2][2] == Figure.CROSS) {
            crossCountWin++;
            winFlag = true;
        }
    }


    public void checkTheDiagonal () {
        if (winnerMatrix[0][0] == Figure.CIRCLE && winnerMatrix[1][1] == Figure.CIRCLE && winnerMatrix[2][2] == Figure.CIRCLE) {
            circleCountWin++;
            winFlag = true;
        }

        if (winnerMatrix[0][0] == Figure.CROSS && winnerMatrix[1][1] == Figure.CROSS && winnerMatrix[2][2] == Figure.CROSS) {
            crossCountWin++;
            winFlag = true;
        }



        if (winnerMatrix[0][2] == Figure.CIRCLE && winnerMatrix[1][1] == Figure.CIRCLE && winnerMatrix[2][0] == Figure.CIRCLE) {
            circleCountWin++;
            winFlag = true;
        }

        if (winnerMatrix[0][2] == Figure.CROSS && winnerMatrix[1][1] == Figure.CROSS && winnerMatrix[2][0] == Figure.CROSS) {
            crossCountWin++;
            winFlag = true;
        }

    }



    enum Figure {
        CIRCLE,
        CROSS
    }
}
