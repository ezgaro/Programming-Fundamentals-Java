import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String articleDate = scanner.nextLine();
        String title = articleDate.split(", ")[0];
        String content = articleDate.split(", ")[1];
        String author = articleDate.split(", ")[2];

        Article article = new Article(title , content , author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int commandCount = 1; commandCount <= n; commandCount++) {
            String command = scanner.nextLine();
            if(command.contains("Edit:")) {
                String newContent = command.split(":\\s+")[1];
                article.edit(newContent);
            } else if (command.contains("Rename:")) {
                String newName = command.split(":\\s+")[1];
                article.rename(newName);
            } else if (command.contains("ChangeAuthor:")) {
                String newAuthor = command.split(":\\s+")[1];
                article.changeAuthor(newAuthor);
            }
        }

        System.out.printf(article.toString());
    }
}