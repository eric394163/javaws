package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramImplement implements MainProgram {

    private final int EXIT = 4;
    private Scanner sc = new Scanner(System.in);
    private Vocabulary myVocabulary = new Vocabulary();

    // 메인
    // ================================================================================================================
    @Override
    public void run() {
        int inputMainMenu = 0;
        // 반복
        do {
            // 메뉴 출력
            printMainMenu();
            try {
                // 메뉴 선택
                inputMainMenu = sc.nextInt();
                // 메뉼 실행
                runMainMenu(inputMainMenu);
            } catch (InputMismatchException e) {
                System.out.println("잘못된 메뉴입니다.");
                sc.nextLine();
            }
        } while (inputMainMenu != EXIT);
    }

    private void runMainMenu(int inputMainMenu) {
        switch (inputMainMenu) {
            case 1:
                // 단어 추가/수정/삭제
                VocaAddUpdateDelete();

                break;
            case 2:
                // 단어장
                break;
            case 3:
                // 미니 게임
                break;
            case 4:
                System.out.println("프로그램 종료.");
                break;
            default:
                throw new InputMismatchException();
        }
    }

    private void printMainMenu() {
        System.out.println("============= 단어장 =============");
        System.out.println("1. 단어 추가/수정/삭제 ");
        System.out.println("2. 단어장 ");
        System.out.println("3. 미니 게임 ");
        System.out.println("4. 프로그램 종료 ");
        System.out.println("==================================");
        System.out.print("메뉴 선택  :");
    }

    // 메인
    // ================================================================================================================

    // 단어 추가 수정 삭제
    // ================================================================================================================

    private void VocaAddUpdateDelete() {

        int inputMenu = 0;

        do {
            printVocaAddUpdateDelete();
            try {
                inputMenu = sc.nextInt();
                sc.nextLine();
                runVocaAddUpdateDelete(inputMenu);
            } catch (InputMismatchException e) {
                System.out.println("잘못된 메뉴입니다.");
                sc.nextLine();
            }
        } while (inputMenu != EXIT);
    }

    private void printVocaAddUpdateDelete() {
        System.out.println("======= 단어 추가/수정/삭제 =======");
        System.out.println("1. 단어 추가 ");
        System.out.println("2. 단어 수정 ");
        System.out.println("3. 단어 삭제 ");
        System.out.println("4. 이전으로 ");
        System.out.println("==================================");
        System.out.print("메뉴 선택  :");
    }

    private void runVocaAddUpdateDelete(int inputMenu) {

        switch (inputMenu) {
            case 1:
                // 단어 추가
                System.out.print("추가할 단어 : ");
                String inputVoca = sc.next();
                sc.nextLine();
                myVocabulary.addWord(inputVoca);
                break;
            case 2:
                // 단어 수정

                break;
            case 3:
                // 단어 삭제

                break;
            case 4:
                //
                break;
            default:
                throw new InputMismatchException();
        }

    }

}
