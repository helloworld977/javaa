import java.util.*;
public class face {
    public static void main(String[] args) {
        String[] eyes = {
            "😎", "👀", "🤓", "👁", "🧐", "👁️‍🗨️", "😏", "🙄", "🤩", "😳",
            "😇", "🥺", "🤠", "😈", "😭", "🫣", "🤯", "😵", "🫥", "😶‍🌫️"
        };

        String[] mouths = {
            "😁", "😐", "😜", "💋", "😮", "😆", "🤤", "😝", "🤪", "🥴",
            "🤬", "🥶", "🤧", "🥲", "😷", "🫠", "😬", "🤥", "🤑", "🤫"
        };

        String[] extras = {
            "🎩", "👑", "🕶", "🐱", "🦄", "🎭", "👻", "🌟", "🍕", "🐲",
            "🍔", "🥷", "🐵", "🦋", "🐼", "🛸", "🪐", "⚡", "💎", "🔥"
        };

        Random rand = new Random();

        String randomEyes = eyes[rand.nextInt(eyes.length)];
        String randomMouth = mouths[rand.nextInt(mouths.length)];
        String randomExtra = extras[rand.nextInt(extras.length)];

        System.out.println("🎲 Your random face today: " + randomEyes + randomMouth + randomExtra);
    }
}