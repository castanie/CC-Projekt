package cc.assignment_1;

public class Main {
    //public static String translatorAuthKey = "";
    //public static Translator translator = new Translator(translatorAuthKey, new TranslatorOptions());

    public static void main(String[] args) {
        UserInput userInput = UserInput.getUserInput();

        WebCrawler webCrawler = new WebCrawler(userInput.getUrl(), userInput.getDepth());
        webCrawler.crawl();


        // Check commamnd line arguments (valid url, depth is number, ...):


        // Main recursive function:

        // Get document contents (GET request):

        // Parse file to get <a> and <h*> tags:

        // Write summary of <h*> tags to StringBuilder:

        // Concatenate all <h*> tags:

        // Translate <h*> tags using DeepL:

        // Send API call to "api-free.deepl.com":

        // Read response:

        // For each <a> tag:

        // Send HEAD request to check for broken links:

        // Write broken link (<s>...</s>) and return:

        // If not broken:

        // Write link to StringBuilder:

        // Write output of recursive call to StringBuilder (include current indentation level):

    }
}