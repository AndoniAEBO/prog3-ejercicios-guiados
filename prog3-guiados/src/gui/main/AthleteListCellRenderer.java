package gui.main;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

import gui.Athlete;

public class AthleteListCellRenderer extends DefaultListCellRenderer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		// TODO Auto-generated method stub
		JLabel jlabel = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		Athlete a = (Athlete) value;
		jlabel.setText(a.getName());
		return jlabel;
	}
	
}
