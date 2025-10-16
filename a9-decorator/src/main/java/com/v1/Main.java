package src.main.java.com.v1;

import java.util.Scanner;

public class Main {

    static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int option;

        do{
                System.out.println("--- TEXT RENDERER ---");
                System.out.println("/OPTIONS/");
                System.out.println("1. Plain text");
                System.out.println("2. Bold");
                System.out.println("3. Italic");
                System.out.println("4. Color");
                System.out.println("5. Custom");
                System.out.println("0. Exit");
                option = sc.nextInt();

                switch (option){
                    case 1:
                        System.out.println("--- PLAIN TEXT ---");
                        System.out.print("Introduce text: ");
                        sc.nextLine(); //clean buffer
                        String text = sc.nextLine();
                        TextRender renderer = new PlainText();
                        renderer.renderText(text);
                        break;
                    case 2:
                        System.out.println("--- BOLD TEXT ---");
                        System.out.print("Introduce text: ");
                        sc.nextLine();
                        String textBold = sc.nextLine();
                        TextRender rendererBold = new ConcreteBold(new PlainText());
                        rendererBold.renderText(textBold);
                        break;
                    case 3:
                        System.out.println("--- ITALIC TEXT ---");
                        System.out.print("Introduce text: ");
                        sc.nextLine();
                        String textItalic = sc.nextLine();
                        TextRender rendererItalic = new ConcreteItalic(new PlainText());
                        rendererItalic.renderText(textItalic);
                        break;
                    case 4:
                        System.out.println("--- COLOR TEXT ---");
                        System.out.print("Introduce text: ");
                        sc.nextLine();
                        String textColor = sc.nextLine();
                        TextRender rendererColor = new ConcreteColor(new PlainText());
                        rendererColor.renderText(textColor);
                        break;
                    case 5:
                            System.out.println("--- CUSTOM COMBO ---");
                            sc.nextLine();
                            System.out.print("Introduce text: ");
                            String textCustom = sc.nextLine();

                            TextRender customRender = new PlainText(); //Base renderer

                            //How do they sum up? == Each decorator wraps the previous one


                            System.out.println("Bold? (s/n): ");
                            String bold = sc.nextLine();
                            if(bold.equalsIgnoreCase("s")){
                                customRender = new ConcreteBold(customRender);
                            }

                            System.out.println("Italic? (s/n): ");
                            String italic = sc.nextLine();
                            if(italic.equalsIgnoreCase("s")){
                                customRender = new ConcreteItalic(customRender);
                            }


                            System.out.println("Color? (s/n): ");
                            String color = sc.nextLine();
                            if(color.equalsIgnoreCase("s")){
                                customRender = new ConcreteColor(customRender);
                            }

                            customRender.renderText(textCustom);
                            break;
                    case 0:
                        System.out.println("--- CLOSING... ---");
                }
        }while (option !=0);

    }
}
