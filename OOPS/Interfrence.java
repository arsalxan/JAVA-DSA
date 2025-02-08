public class Interfrence {
    public static void main(String[] args) {
        Queen q=new Queen();
        King k= new King();
        q.moves();k.moves();
    }
}
interface ChessPlayer{
void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("UP,Down,Right,LEft,diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("UP,Down,Right,LEft");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("UP,Down,Right,LEft,diagonal(by one step)");
    }
}
