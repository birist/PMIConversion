package com.company;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;

public class viewMain extends JPanel implements TreeSelectionListener {

    private JTree tree;
    private JPanel detailsView;
    private JSplitPane splitPane;

    private JButton btnClose;
    private JButton btnExport;
    private JButton btnExportAll;

    public viewMain() {
        super(new GridLayout(1,1));

        PMI pmi = new PMI();
        pmi.getControllers();

        tree = new JTree(pmi);

        //TODO: set icons for tree
        //tree.setCellRenderer(new DefaultTreeCellRenderer() {
        //    private Icon loadIcon = UIManager.getIcon("OptionPane.errorIcon");
        //    private Icon saveIcon = UIManager.getIcon("OptionPane.informationIcon");
        //    @Override
        //    public Component getTreeCellRendererComponent(JTree tree,
        //                                                  Object value, boolean selected, boolean expanded,
        //                                                  boolean isLeaf, int row, boolean focused) {
        //        Component c = super.getTreeCellRendererComponent(tree, value,
        //                selected, expanded, isLeaf, row, focused);
        //        if (selected)
        //            setIcon(loadIcon);
        //        else
        //            setIcon(saveIcon);
        //        return c;
        //    }
        //});

        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

        tree.addTreeSelectionListener(this);

        JScrollPane treeViewPane = new JScrollPane(tree);

        detailsView = new JPanel();
        detailsView.add(new JLabel("test"));
        JScrollPane detailsViewPane = new JScrollPane(detailsView);

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setLeftComponent(treeViewPane);
        splitPane.setRightComponent(detailsView);

        Dimension minimumSize = new Dimension(100,50);
        detailsViewPane.setMinimumSize(minimumSize);
        treeViewPane.setMinimumSize(minimumSize);
        splitPane.setDividerLocation(250);
        splitPane.setPreferredSize(new Dimension(800,600));

        add(splitPane);
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();

        if (node == null) return;

        Object nodeInfo = node.getUserObject();

        if (node.getClass().toString().equals("class com.company.PMI")) {
            PMI p = (PMI) node;
            splitPane.setRightComponent(p.getView());
            splitPane.setDividerLocation(splitPane.getDividerLocation());

        }
        if (node.getClass().toString().equals("class com.company.Supervisory")) {
            Supervisory s = (Supervisory) node;
            splitPane.setRightComponent(s.getView());
            splitPane.setDividerLocation(splitPane.getDividerLocation());
        }
        if (node.getClass().toString().equals("class com.company.Port"))
            System.out.println("Port");
        if (node.getClass().toString().equals("class com.company.Controller")) {
            Controller s = (Controller) node;
            s.getPoints();
            splitPane.setRightComponent(s.getView());
            splitPane.setDividerLocation(splitPane.getDividerLocation());
        }

        //if (node.isLeaf()) {
        //    Controller controller = (Controller) node;
        //    displayController(controller);
        //}

    }
}
