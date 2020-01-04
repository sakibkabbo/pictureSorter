/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picturesorter; //remove this package declaration when conducting external testing.

import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import javax.swing.JButton;

/**
 * This class functions as a custom drop listener which obtains a folder button
 * and decides the action that button takes when a drop is detected.
 *
 * @author Muhtasim
 */
public class dropListener extends DropTargetAdapter {

    JButton button;
    DropTarget dropTarg;

    dropListener(JButton b) {
        button = b;
        dropTarg = new DropTarget(b, DnDConstants.ACTION_COPY, this, true, null);
    }

    /*
     *Conducts the drop action of the folder button. 
     */
    @Override
    public void drop(DropTargetDropEvent dtde) {
        dtde.acceptDrop(DnDConstants.ACTION_COPY);
        this.button.doClick();
        dtde.dropComplete(true);
    }

}
