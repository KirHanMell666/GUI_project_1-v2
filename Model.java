import java.util.ArrayList;
import java.util.List;

class Model {
    ChildController childCtrl;
    Controller ctrl;
    private List<Log> data;

    Model(//Controller logController, ChildController logChildController
           ) {
        this.data = new ArrayList<>();
    }


    void addData(String s)
    {
        this.data.add(new Log(s));
    }

    void dumpData() {

        for(int i = 0 ; i < 40 ; i++)
        this.data.add(new Log("Cos tam"));
    }

    List<Log> getData() {
        return data;
    }

}