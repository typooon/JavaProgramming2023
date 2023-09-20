public interface Flyable {
    //void fly();
    default void fly(){
        System.out.println("날아갑니다.");
    }
}
