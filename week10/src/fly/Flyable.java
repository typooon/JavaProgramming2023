package fly;

public interface Flyable {
//    public fly.Flyable();
    default void fly(){
        System.out.println("날아 갑니다!");;
    }
}
