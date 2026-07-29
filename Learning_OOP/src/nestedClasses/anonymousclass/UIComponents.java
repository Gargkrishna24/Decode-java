package nestedClasses.anonymousclass;

interface ButtonAction {
    void onClick();
}

public class UIComponents {
    public void setupButton() {

        // ---------------------------------------------------------
        // ANONYMOUS CLASS DECLARATION & INSTANTIATION
        // We use 'new ButtonAction()' even though it is an interface.
        // Behind the scenes, Java creates an unnamed class that implements
        // ButtonAction, and instantly creates the 'loginAction' object from it.
        // ---------------------------------------------------------
        ButtonAction loginAction = new ButtonAction() {

            // We write the class logic directly inside these brackets
            @Override
            public void onClick() {
                System.out.println("Login button was clicked! Authenticating...");
            }

        }; // <-- The mandatory semicolon marking the end of the assignment statement

        // Trigger the method on our anonymous object
        loginAction.onClick();
    }

    public static void main(String[] args) {
        UIComponents component = new UIComponents();
        component.setupButton();
    }
}
