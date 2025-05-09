package day04;

public class EmojiOrnegi {
    public static void main(String[] args) {
        // Doğrudan emoji kullanımı
        System.out.println("🎮 Oyun başladı!");
        System.out.println("⭐ Yıldız kazandınız!");
        System.out.println("❤️ Can");
        System.out.println("✅ Doğru");
        System.out.println("❌ Yanlış");

        // Yaygın kullanılan bazı emojiler:
        String[] emojiler = {
                "👍", // başparmak
                "🎲", // zar
                "🎯", // hedef
                "🏆", // kupa
                "💡", // ampul
                "⚡", // yıldırım
                "🔥", // ateş
                "✨"  // yıldız parıltısı
        };

        // Eğer emojiler konsolda düzgün görünmüyorsa, ASCII karakterleri kullanabilirsiniz
        String[] asciiEmojiler = {
                ":)",    // gülücük
                ":-)",   // gülücük
                ":D",    // kahkaha
                "<3",    // kalp
                "(*.*)", // şaşkın
                "(y)",   // başparmak
                "(*_*)", // yıldızlı gözler
                "^_^"    // mutlu
        };
    }
}
