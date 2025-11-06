package complex_example;

public class LoginForm implements IDialogMediator {

    // The mediator knows about its specific components
    // to apply business logic
    private TextBox txtUsername;
    private TextBox txtPassword;
    private Checkbox chkRememberMe;
    private Button btnLogin;

    public LoginForm() {
        // In a real system, these components would register themselves
    }

    // Setter methods for the Client to register components
    public void setTxtUsername(TextBox txtUsername) { this.txtUsername = txtUsername; }
    public void setTxtPassword(TextBox txtPassword) { this.txtPassword = txtPassword; }
    public void setChkRememberMe(Checkbox chkRememberMe) { this.chkRememberMe = chkRememberMe; }
    public void setBtnLogin(Button btnLogin) { this.btnLogin = btnLogin; }


    // This is the core logic!
    // The mediator reacts to events from its components
    @Override
    public void notify(Component sender, String event) {

        // Rule: If a textbox changes, check the button's state
        if (sender == txtUsername || sender == txtPassword) {
            if (event.equals("textChanged")) {
                this.updateButtonState();
            }
        }

        // Rule: If the Checkbox changes, we don't care (for now)
        if (sender == chkRememberMe) {
            // The mediator is notified but chooses not to react
        }

        // Rule: If the login button is clicked
        if (sender == btnLogin && event.equals("click")) {
            this.attemptLogin();
        }
    }

    // Private mediator logic
    private void updateButtonState() {
        // Business Rule: Enable only if both fields have text
        if (!txtUsername.getText().isEmpty() && !txtPassword.getText().isEmpty()) {
            btnLogin.setEnabled(true);
        } else {
            btnLogin.setEnabled(false);
        }
    }

    private void attemptLogin() {
        System.out.println("\n--- LOGIN ATTEMPT ---");
        System.out.println("Mediator gathering data...");
        System.out.println("  Username: " + txtUsername.getText());
        System.out.println("  Password: " + txtPassword.getText());
        System.out.println("  Remember Me: " + chkRememberMe.isChecked());
        System.out.println("-----------------------\n");
    }
}
