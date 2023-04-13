package j_oop.java_CowsBulls;

public interface Game {
    void start(Integer sizeWord, Integer attempts);
    void inputValue(String value);
    GameStatus getGameStatus();
}