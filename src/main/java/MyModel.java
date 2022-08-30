
import javax.swing.table.AbstractTableModel;

// create a table model to display the contacts images in jtable
public class MyModel extends AbstractTableModel {

    private String[] columns;
    private Object[][] rows;
    
    public MyModel(){}
    
    public MyModel(Object [][] data, String[] colomnsName){
        this.columns = colomnsName;
        this.rows = data;
    }
    
   
    
    @Override
    public int getRowCount() {
      
       return this.rows.length; 
        
    }

    @Override
    public int getColumnCount() {
       
        return this.columns.length;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
        return this.rows[rowIndex][columnIndex];
        
    }

    @Override
    public String getColumnName(int col){
        
        return this.columns[col];
        
    }
    
}
