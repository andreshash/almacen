package almacen_test;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vivi
 */
import java.sql.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.event.*;

public class ResultSetTable implements javax.swing.table.TableModel
{

    private ArrayList<ArrayList<Object>> Datos; //Datos
    private String[] etiquetas; //Nombres de columna
    protected EventListenerList listenerList = new EventListenerList();

    public ResultSetTable(java.sql.ResultSet rs)
    {
        if (rs != null)
        {
            Datos = new ArrayList();
            try
            {
                ResultSetMetaData metaDatos = rs.getMetaData();
                int noColumnas = metaDatos.getColumnCount();
                etiquetas = new String[noColumnas];
             
                for (int i = 0; i < noColumnas; i++)
                {
                    etiquetas[i] = metaDatos.getColumnLabel(i + 1);
                }
               
             
             
              
                ArrayList<Object> temp;
                while (rs.next())
                {
                    temp = new ArrayList();
                    for (String etiqueta : etiquetas)
                    {
                        temp.add(rs.getObject(etiqueta));
                    }
                    Datos.add(temp);
                }
            }
            catch (SQLException ex)
            {
                Datos = null;
                etiquetas = null;
                System.out.println("Error: " + ex.getErrorCode());
                System.out.println("Mensaje: " + ex.getMessage());
            }
        }
    }

    @Override
    public int getRowCount()
    {
        return Datos == null ? 0 : Datos.size();
    }

    @Override
    public int getColumnCount()
    {
        return Datos == null ? 0 : Datos.get(0).size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        return Datos == null ? null : Datos.get(rowIndex).get(columnIndex);
    }

    @Override
    public String getColumnName(int columnIndex)
    {
        return etiquetas == null ? null : etiquetas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return Object.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
        Datos.get(rowIndex).set(columnIndex, aValue);
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
		listenerList.add(TableModelListener.class, l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
		listenerList.remove(TableModelListener.class, l);
    }
}
