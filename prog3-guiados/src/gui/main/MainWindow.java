package gui.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ListModel;

import domain.Athlete;
import domain.Athlete.Genre;

public class MainWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainWindow() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("JJ.OO. París 2024");
		setSize(640, 480);
		setLocationRelativeTo(null);
		
		List<Athlete> atletas = List.of(
				new Athlete(1, "Atleta 1", Genre.MALE, "España", LocalDate.of(2000, 2, 1)),
				new Athlete(2, "Atleta 2", Genre.FEMALE, "España", LocalDate.of(2000, 2, 2)),
				new Athlete(3, "Atleta 3", Genre.MALE, "España", LocalDate.of(2000, 2, 3)),
				new Athlete(4, "Atleta 4", Genre.FEMALE, "España", LocalDate.of(2000, 2, 4)),
				new Athlete(5, "Atleta 5", Genre.MALE, "España", LocalDate.of(2000, 2, 5)),
				new Athlete(6, "Atleta 6", Genre.FEMALE, "España", LocalDate.of(2000, 2, 6)),
				new Athlete(7, "Atleta 7", Genre.MALE, "España", LocalDate.of(2000, 2, 7)),
				new Athlete(8, "Atleta 8", Genre.FEMALE, "España", LocalDate.of(2000, 2, 8)),
				new Athlete(9, "Atleta 9", Genre.MALE, "España", LocalDate.of(2000, 2, 9)),
				new Athlete(10, "Atleta 10", Genre.FEMALE, "España", LocalDate.of(2000, 2, 10)),
				new Athlete(11, "Atleta 11", Genre.MALE, "España", LocalDate.of(2000, 2, 11)),
				new Athlete(12, "Atleta 12", Genre.FEMALE, "España", LocalDate.of(2000, 2, 12)),
				new Athlete(13, "Atleta 13", Genre.MALE, "España", LocalDate.of(2000, 2, 13)),
				new Athlete(14, "Atleta 14", Genre.FEMALE, "España", LocalDate.of(2000, 2, 14)),
				new Athlete(15, "Atleta 15", Genre.MALE, "España", LocalDate.of(2000, 2, 15)),
				new Athlete(16, "Atleta 16", Genre.FEMALE, "España", LocalDate.of(2000, 2, 16)),
				new Athlete(17, "Atleta 17", Genre.MALE, "España", LocalDate.of(2000, 2, 17)),
				new Athlete(18, "Atleta 18", Genre.FEMALE, "España", LocalDate.of(2000, 2, 18)),
				new Athlete(19, "Atleta 19", Genre.MALE, "España", LocalDate.of(2000, 2, 19)),
				new Athlete(20, "Atleta 20", Genre.FEMALE, "España", LocalDate.of(2000, 2, 20)),
				new Athlete(21, "Atleta 21", Genre.MALE, "España", LocalDate.of(2000, 2, 21)),
				new Athlete(22, "Atleta 22", Genre.FEMALE, "España", LocalDate.of(2000, 2, 22)),
				new Athlete(23, "Atleta 23", Genre.MALE, "España", LocalDate.of(2000, 2, 23)),
				new Athlete(24, "Atleta 24", Genre.FEMALE, "España", LocalDate.of(2000, 2, 24)),
				new Athlete(25, "Atleta 25", Genre.MALE, "España", LocalDate.of(1900, 2, 26))
		);
		DefaultListModel<Athlete> listmodel = new DefaultListModel<Athlete>();
		listmodel.addAll(atletas);
		JList<Athlete> lista = new JList<Athlete>(listmodel);
		lista.setFixedCellWidth(200);
		lista.setCellRenderer(new AthleteListCellRenderer());
		JScrollPane scroll = new JScrollPane(lista);
		add(scroll, BorderLayout.WEST);
		JTabbedPane tabbed = new JTabbedPane();
		tabbed.add("Datos", null);
		tabbed.add("Medallas", null);
		add(tabbed);
		JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("Fichero");
        menuBar.add(fileMenu);
        fileMenu.setMnemonic(KeyEvent.VK_F);
        JMenuItem openMenuItem = new JMenuItem("Nuevo atleta...");
        fileMenu.add(openMenuItem);
        openMenuItem.setMnemonic(KeyEvent.VK_N);
        fileMenu.addSeparator();
        JMenuItem importMenuItem = new JMenuItem("Importar...");
        fileMenu.add(importMenuItem);
        importMenuItem.setMnemonic(KeyEvent.VK_I);
        JMenuItem exportMenuItem = new JMenuItem("Exportar...");
        fileMenu.add(exportMenuItem);
        exportMenuItem.setMnemonic(KeyEvent.VK_E);
        fileMenu.addSeparator();
        JMenuItem exitMenuItem = new JMenuItem("Salir");
        fileMenu.add(exitMenuItem);
        exitMenuItem.setMnemonic(KeyEvent.VK_S);
        exitMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				confirmarSalida();
			}
        });
        addWindowListener(new WindowAdapter() {
        	@Override
        	public void windowClosing(WindowEvent e) {
        		confirmarSalida();
        	}
        });
        setVisible(true);
	}
	private void confirmarSalida() {
        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Seguro que desea salir?",
                "Salir",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
	
	
}
