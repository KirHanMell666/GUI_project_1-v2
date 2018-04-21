import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        Model model = new Model();
        Controller mainController = new Controller(model);
        model.ctrl = mainController;

        //List<String> nazwa = new ArrayList<String>();
        mainController.start();
    }

}
