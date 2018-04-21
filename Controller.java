import java.util.ArrayList;
import java.util.List;

class Controller {

    private Model logModel;
    private View logView;
    int licznik = 0;

    Controller(Model m) {
        logModel = m;
        logView = new View(this);
    }

    void start() {
        logView.showLogs(logModel.getData());
        logView.start();
    }

    void useButton()
    {
        List<ChildView> childViews = new ArrayList<ChildView>();
        ChildController childController = new ChildController(logModel);
        childController.logChildView = childViews;
        logModel.childCtrl = childController;
        childController.licznikChild = licznik;
        childController.logChildView.add(new ChildView(childController));
        childController.logChildView.get(licznik).showLogs(logModel.getData());
        childController.logChildView.get(licznik).start();

    }

}