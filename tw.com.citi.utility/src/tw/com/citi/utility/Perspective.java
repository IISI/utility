package tw.com.citi.utility;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import tw.com.citi.utility.views.MenuView;

/**
 * @author Chih-Liang Chang
 */
public class Perspective implements IPerspectiveFactory {

    @Override
    public void createInitialLayout(IPageLayout layout) {
        String editorArea = layout.getEditorArea();
        layout.setEditorAreaVisible(true);

        layout.addStandaloneView(MenuView.ID, true, IPageLayout.LEFT, 0.3f,
                editorArea);
        // layout.addView(MenuView.ID, IPageLayout.LEFT, 0.25f, editorArea);
        layout.getViewLayout(MenuView.ID).setCloseable(false);
    }

}
