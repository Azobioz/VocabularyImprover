import StartTraining.*;


public class Programm {
    public static void main(String[] args) {
        FileVocabulary file = new FileVocabulary();
        file.setFilePath("C:\\Users\\PC\\OneDrive\\Рабочий стол\\Vocabulary.txt");
        file.training(false);

    }
}