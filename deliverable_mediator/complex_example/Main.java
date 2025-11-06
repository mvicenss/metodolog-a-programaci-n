package complex_example;

public class Main {
    public static void main(String[] args) {

        // 1. Create the Mediator
        LoginForm mediator = new LoginForm();

        // 2. Create the Colleagues (Components), passing in the mediator
        TextBox txtUsername = new TextBox(mediator, "Username");
        TextBox txtPassword = new TextBox(mediator, "Password");
        Checkbox chkRememberMe = new Checkbox(mediator, "RememberMe");
        Button btnLogin = new Button(mediator, "Login");

        // 3. Register the colleagues with the mediator
        mediator.setTxtUsername(txtUsername);
        mediator.setTxtPassword(txtPassword);
        mediator.setChkRememberMe(chkRememberMe);
        mediator.setBtnLogin(btnLogin);

        // --- SIMULATE USER INTERACTION ---

        System.out.println("--- Initial State ---");
        // The button is disabled by default
        btnLogin.click();

        System.out.println("\n--- User fills the first field ---");
        txtUsername.setText("my_username");
        // The mediator is notified, runs the rule, and the button stays disabled

        System.out.println("\n--- User fills the second field ---");
        txtPassword.setText("123456");
        // The mediator is notified, runs the rule, and NOW enables the button

        System.out.println("\n--- User checks the box ---");
        chkRememberMe.setChecked(true);
        // The mediator is notified, but its logic decides to do nothing

        System.out.println("\n--- User clicks the button ---");
        btnLogin.click();
        // The mediator is notified and runs the login logic
    }
}
