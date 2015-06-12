package com.walletcoach.walletcoach.models;

import com.walletcoach.walletcoach.controllers.ItemController;
import com.walletcoach.walletcoach.entities.Item;
import com.walletcoach.walletcoach.tools.ItemsQueryBuilder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.SwingWorker;
import javax.swing.table.AbstractTableModel;

public class ItemTableModel extends AbstractTableModel {    
    private final ItemController controller;
    protected List<Item> items = new ArrayList<>();

    public ItemTableModel(ItemController controller) {
        this.controller = controller;
        loadData();
    }

    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Item item = items.get(rowIndex);
        switch (columnIndex) {
            case 0:
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                Date date = item.getDatetime().getTime();
                return format.format(date);
            case 1:
                return item.getPrice();
            case 2:
                return item.getDescription();
            case 3:
                return item.getCategory().getName();
            case 4:
                return item.getSubject();
            default:
                throw new IllegalArgumentException("columnIndex");
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Date";
            case 1:
                return "Price";
            case 2:
                return "Description";
            case 3:
                return "Category";
            case 4:
                return "Subject";
            default:
                throw new IllegalArgumentException("columnIndex");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void loadData() {
        final ItemsQueryBuilder query = new ItemsQueryBuilder();
        query.filterPeriod(2, 2015);
        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                items = controller.getFiltered(query);
                return null;
            }

            @Override
            protected void done() {
                fireTableDataChanged();
            }
        }.execute();
    }
}