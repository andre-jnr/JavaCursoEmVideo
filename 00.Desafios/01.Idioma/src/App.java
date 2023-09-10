import java.util.Locale;

public class App {
    public static void main(String[] args) {
        // Obtém o idioma padrão do dispositivo
        Locale defaultLocale = Locale.getDefault();

        // Obtém o código do idioma (ex: "en" para inglês, "pt" para português)
        String languageCode = defaultLocale.getLanguage();

        // Exibe o código do idioma
        System.out.println("Código do idioma: " + languageCode);

        // Exibe o nome do idioma no próprio idioma
        System.out.println("Idioma: " + defaultLocale.getDisplayLanguage());

        // Exibe o nome do idioma em inglês
        System.out.println("Idioma em inglês: " + defaultLocale.getDisplayLanguage(Locale.ENGLISH));
    }
}
