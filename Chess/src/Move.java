public class Move {
    private Player player;
    private Spot start;
    private Spot end;
    private Piece pieceMoved;
    private Piece pieceKilled;
    private boolean castlingMove = false;

    public Move(Player player, Spot start, Spot end)
    {
        this.player = player;
        this.start = start;
        this.end = end;
        this.pieceMoved = start.getPiece();
    }

    public boolean isCastlingMove()
    {
        return this.castlingMove;
    }

    public void setCastlingMove(boolean castlingMove)
    {
        this.castlingMove = castlingMove;
    }


    // Getters
    public Player getPlayer() {
        return player;
    }

    public Spot getStart(){
        return start;
    }

    public Spot getEnd(){
        return end;
    }

    public Piece getPieceMoved(){
        return pieceMoved;
    }

    public Piece getPieceKilled(){
        return pieceKilled;
    }

    // Setters

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setStart(Spot start) {
        this.start = start;
    }

    public void setEnd(Spot end) {
        this.end = end;
    }

    public void setPieceMoved (Piece pieceMoved) {
        this.pieceMoved = pieceMoved;
    }

    public void setPieceKilled (Piece pieceKilled) {
        this.pieceKilled = pieceKilled;
    }

}
public enum GameStatus {
    ACTIVE,
    BLACK_WIN,
    WHITE_WIN,
    FORFEIT,
    STALEMATE,
    RESIGNATION
}
