package src.main.java.com.v2;

import src.main.java.com.v1.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do{
            System.out.println("--- TEXT RENDERER ---");
            System.out.println("/OPTIONS/");
            System.out.println("1. Plain text");
            System.out.println("2. Bold");
            System.out.println("3. Italic");
            System.out.println("4. Color");
            System.out.println("5. Align center");
            System.out.println("6. Align right");
            System.out.println("7. Align left");
            System.out.println("8. Custom");
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
                    System.out.println("--- ALIGN CENTER ---");
                    System.out.print("Introduce text: ");
                    sc.nextLine();
                    String textAlignCenter = sc.nextLine();
                    TextRender rendererAlignCenter = new ConcreteCenter(new PlainText());
                    rendererAlignCenter.renderText(textAlignCenter);
                    break;
                case 6:
                    System.out.println("--- ALIGN RIGHT TEXT ---");
                    System.out.print("Introduce text: ");
                    sc.nextLine();
                    String textAlignRight = sc.nextLine();
                    TextRender rendererAlignRight = new ConcreteRight(new PlainText());
                    rendererAlignRight.renderText(textAlignRight);
                    break;
                case 7:
                    System.out.println("--- ALIGN LEFT TEXT ---");
                    System.out.print("Introduce text: ");
                    sc.nextLine();
                    String textAlignLeft = sc.nextLine();
                    TextRender rendererAlignLeft = new ConcreteLeft(new PlainText());
                    rendererAlignLeft.renderText(textAlignLeft);
                    break;
                case 8:
                    System.out.println("--- CUSTOM ---");
                    sc.nextLine();
                    System.out.print("Introduce text: ");
                    String textCustom = sc.nextLine();

                    TextRender customRender2 = new PlainText();

                    System.out.println("Bold? (s/n): ");
                    String bold = sc.nextLine();
                    if(bold.equalsIgnoreCase("s")){
                        customRender2 = new ConcreteBold(customRender2);
                    }

                    System.out.println("Italic? (s/n): ");
                    String italic = sc.nextLine();
                    if(italic.equalsIgnoreCase("s")){
                        customRender2 = new ConcreteItalic(customRender2);
                    }


                    System.out.println("Color? (s/n): ");
                    String color = sc.nextLine();
                    if(color.equalsIgnoreCase("s")){
                        customRender2 = new ConcreteColor(customRender2);
                    }

                    System.out.println("Where do you want it (center, right, left)?");
                    String loc = sc.nextLine();
                    if(loc.equalsIgnoreCase("center")){
                        customRender2 = new ConcreteCenter(customRender2);
                    }else if(loc.equalsIgnoreCase("right")){
                        customRender2 = new ConcreteRight(customRender2);
                    }else if(loc.equalsIgnoreCase("left")){
                        customRender2 = new ConcreteLeft(customRender2);
                    }else{
                        System.out.println("Invalid location");
                    }
                    customRender2.renderText(textCustom);
                    break;
                case 0:
                    System.out.println("--- CLOSING... ---");


            }
        }while(option != 0);
    }
}


