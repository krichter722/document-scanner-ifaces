/**
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package richtercloud.document.scanner.ifaces;

import java.awt.Point;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author richter
 */
public abstract class OCRSelectPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    public abstract Point getDragStart();

    public abstract Point getDragEnd();

    public abstract BufferedImage getImage();

    public abstract void addSelectionListener(OCRSelectPanelSelectionListener listener);

    public abstract int dragSelectionX();

    public abstract int dragSelectionY();

    public abstract int dragSelectionWidth();

    public abstract int dragSeletionHeight();

    public abstract void setZoomLevel(float zoomLevel);

    public abstract void unselect();
}
