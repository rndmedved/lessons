package lessons.test;

import java.util.Stack;

public class Main3 {

    public static void main(String[] args) {

        //  создаем колоду и добавляем в нее карты
        Stack<Card> deck = new Stack<>();
        deck.push(new Card("Рагнарос"));
        deck.push(new Card("Пират Глазастик"));
        deck.push(new Card("Сильвана Ветрокрылая"));
        deck.push(new Card("Миллхаус Манашторм"));
        deck.push(new Card("Эдвин ван Клифф"));

        //  создаем сброс
        Stack<Card> graveyard = new Stack<>();

        //  начинаем игру
        SimpleCardGame game = new SimpleCardGame();
        game.setDeck(deck);
        game.setGraveyard(graveyard);

        //  первый игрок берет 3 карты из колоды
        Card card1 = game.getCardFromDeck();
        Card card2 = game.getCardFromDeck();
        Card card3 = game.getCardFromDeck();

        System.out.println("Какие карты достались первому игроку?");
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        //  первый игрок отправляет в сброс 3 своих карты
        game.discard(card1);
        game.discard(card2);
        game.discard(card3);

        System.out.println("Какие карты находятся в сбросе?");
        System.out.println(game.getGraveyard().pop());
        System.out.println(game.getGraveyard().pop());
        System.out.println(game.getGraveyard().pop());
    }
}
