import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // human write code to communicate with the computer
        // there is a thing called pseudocode(or fake code)
        // human(we) can write the fake code, to understand
        // our thoughts {
        //
        // }
        // then convert it to code

        // tell the user what this porgram does
        // this program can add two numbers together
        // and print the equation

        // ask the user for the first number

        // store the number in a variable

        // ask the user for the second number

        // store the number in a variable

        // do the math, store the result

        // print the equation

        System.out.println("give me two numbers and I will plus them");
        System.out.println("num1 ");
        var in = new Scanner(System.in);
        int num1 = in.nextInt();

        System.out.println("num2");
        int num2 = in.nextInt();
        // int sum = num1 + num2;
        System.out.println("the sum of " + num1 + " and " + num2 + " is " + (num1 + num2));

    }

    // もし google みたいな大手会社で働くすると
    // https://google.github.io/styleguide/javaguide.html#s4-formatting
    // Horizontal whitespace
    // On both sides of any binary or ternary operator.
    // 上のリンクみたいな coding style guideline があります
    // 従わないなら、首になっちゃう
    // 了解です

    // 例えば今の状態のコードが、実行は全然大丈夫ですけど
    // プログラマーの SNS とかグループに発送すると
    // 「こんなこともコードですか」と叱られる
    // indent はとても重要
    // はいわかりました

    // 今書いたプログラムはぎりぎり合格
    // 満点 100 点なら 75 点
    // 美しくない

    // プログラマー、あるいはハッカーたちが、コードの美しさには
    // とっても厳しいです
    // 了解です

    // 自分で nextInt を発見した、これは立派です
    //
    // 仕事するとき、このような場合がたくさんあります

    // これは足すだけ打 はいから好きじゃない
}
