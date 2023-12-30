package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Vocabulary {
    private ArrayList<String> words;
    private HashMap<Integer, ArrayList<String>> meanings;

    public Vocabulary() {
        words = new ArrayList<>();
        meanings = new HashMap<>();
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public HashMap<Integer, ArrayList<String>> getMeanings() {
        return meanings;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((words == null) ? 0 : words.hashCode());
        result = prime * result + ((meanings == null) ? 0 : meanings.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vocabulary other = (Vocabulary) obj;
        if (words == null) {
            if (other.words != null)
                return false;
        } else if (!words.equals(other.words))
            return false;
        if (meanings == null) {
            if (other.meanings != null)
                return false;
        } else if (!meanings.equals(other.meanings))
            return false;
        return true;
    }

    public void addWord(String word) {
        Scanner sc = new Scanner(System.in);

        while (words.contains(word)) {
            System.out.print("다른 단어 입력하세요:");
            sc.nextLine();
            word = sc.nextLine();
        }

        System.out.println(word + "'의 뜻을 입력. (입력이 끝나면 'exit' 입력)");

        ArrayList<String> meaningsList = new ArrayList<>();
        String meaning;
        while (true) {
            meaning = sc.nextLine();
            if (meaning.equals("exit")) {
                break;
            }
            meaningsList.add(meaning);
        }

        words.add(word);
        meanings.put(words.size() - 1, meaningsList);
        System.out.println("단어가 성공적으로 추가되었습니다.");

    }

    public void deleteWord(String word){

        do{
            for (int i = 0; i < words.size(); i++) {
                String compareWord = words.get(i);
                if(word.equals(compareWord)){
                    
                }
                
            }

        }
    }
}
