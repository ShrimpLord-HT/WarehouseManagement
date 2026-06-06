import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class WarehouseManagement extends JFrame {
    private ProductList mainList;
    private SearchGUI searchPanel;
    private ListGUI listPanel;
    public static void main(String[] args){
        new WarehouseManagement();
    }

    public void initGUI(){
        mainList = new ProductList();
        searchPanel = new SearchGUI();
        listPanel = new ListGUI();

        mainList.addObserver(searchPanel);
        mainList.addObserver(listPanel);

        this.setTitle("Warehouse Management");
        this.setSize(new Dimension(800, 600));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(searchPanel, BorderLayout.NORTH);
        this.add(listPanel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void importFile(String filePath){}
    public void exportFile(String filePath){}
}