package ro.fasttrackit.mvnbase.Person;

import java.util.Scanner;

public class MainMenu {

    private final PersonService service;
    public MainMenu(PersonService service){
        this.service=service;
    }
    public void run(){
        int input;
        do{
            printMainMenu();
            input=getInput();
            executeInput(input);
        }while (input!=0);
    }


    private void printMainMenu() {
        System.out.println("===============================");
        System.out.println("[1]List all Persons");
        System.out.println("[2]Add Person ");
        System.out.println("[3]Get Person older then ");
        System.out.println("[4]Get all person names");
        System.out.println("[5]Get Person By id");
        System.out.println("[0]Exit");
        System.out.println("===============================");
    }

    public int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your option");
        return scanner.nextInt();
    }

    public void executeInput(int input)  {
        switch (input) {

            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                //  handelEndPlanning();
                break;
            case 0:
                break;
            default:
                System.out.println("Wrong Input");

        }
    }






}
