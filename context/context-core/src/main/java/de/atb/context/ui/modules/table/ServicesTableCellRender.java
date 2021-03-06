package de.atb.context.ui.modules.table;

/*-
 * #%L
 * ATB Context Extraction Core Lib
 * %%
 * Copyright (C) 2020 ATB
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */


import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

/**
 *
 * @author Giovanni
 */
public class ServicesTableCellRender implements TableCellRenderer {

	@Override
	public final Component getTableCellRendererComponent(final JTable jtable, final Object o,
			final boolean isSelected, final boolean hasFocus, final int row, final int col) {

		// Component c = super.getTableCellRendererComponent(jtable, o,
		// hasFocus, hasFocus, row, col);
		JLabel c = new JLabel();
		c.setOpaque(true);
		c.setText((String) o);
		if (col == 5) {
			c.setForeground(Color.BLUE);
		}
		if (col == 6) {
			if (((String) o).equals("Busy")) {
				c.setForeground(Color.RED);
			} else if (((String) o).equals("Free")) {
				c.setForeground(Color.GREEN);
			} else {
				c.setForeground(Color.BLACK);
			}
		}
		return c;
	}

}
