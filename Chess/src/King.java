public class King extends Piece {
    private boolean castlingDone = false;

    private boolean moved = false;

    public King(boolean white)
    {
        super(white);
    }

    public boolean isCastlingDone()
    {
        return this.castlingDone;
    }

    public boolean hasMoved() {
        return moved;
    }

    public void setCastlingDone(boolean castlingDone)
    {
        this.castlingDone = castlingDone;
    }

    public void setMoved(boolean moved) {
        this.moved = moved;
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end)
    {
        // checks if the spot that we're moving to has a piece of the same color
        // if so, then we cannot move our piece there
        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        if (x + y == 1) {
            // **create a new if statement here**
            //
            // check to be sure this move will not result in the king being attacked
            // If so, return true
            return true;
        }

        return this.isValidCastling(board, start, end);
    }

    private boolean isValidCastling(Board board,
                                    Spot start, Spot end)
    {

        if (this.isCastlingDone()) {
            return false;
        }
        // Logic for returning true or false:
        // the spots between the King and Rook are not being attacked
        // the ending spot is also not being attacked

        // If  works, return true
        return true;
    }

    public boolean isCastlingMove(Spot start, Spot end)
    {
        // check if the starting and ending position are correct AND
        // neither the Rook NOR the King have moved during this game
    }
}

