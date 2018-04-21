import java.util.List;

class ChildController {

    private Model logModel;
    List <ChildView> logChildView;
    int licznikChild = 0;

    ChildController(Model m) {
        logModel = m;

    }

    void start(int i) {
        //logModel.dumpData();
        logChildView.get(i).childCtrl.logModel.getData();
        logChildView.get(i).start();
    }

    void useButtonTextField(int i)
    {
            logModel.addData(logChildView.get(i).tf.getText());
            logChildView.get(i).create(logChildView.get(i).tf.getText());
            logChildView.get(i).tf.setText("");
            logChildView.get(i).validate();

        for(int j = 0 ; j < logChildView.size() ; j++)
        {
            //logChildView.get(j).getContentPane().removeAll();
            //logChildView.get(j).getContentPane().setVisible(true);
            //logChildView.get(j).showLogs(logModel.getData());
            logChildView.get(j).repaint();
            logChildView.get(j).pack();
            logChildView.get(j).validate();
        }
    }

}