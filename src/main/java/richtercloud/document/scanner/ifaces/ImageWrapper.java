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

import java.awt.image.BufferedImage;
import java.io.IOException;
import javafx.scene.image.WritableImage;

/**
 * Wraps different previews of a {@link BufferedImage} and a reference to the
 * image data on disk as well as translation between JavaFX and Swing.
 *
 * Manages desired rotation internally because rotation is a per-image property
 * which can't be retrieved from settings after a dialog which allows rotation
 * has been closed.
 *
 * @author richter
 */
/*
internal implementation notes:
- Desired width for zoom adjustment can't be managed
internally because it might be necessary to retrieve different previews (e.g.
for displaying zoomed, for OCR, etc.).
- Managing rotation internally allows to get rotation out of ScanResultDialog
very easily.
*/
public interface ImageWrapper {

    BufferedImage getOriginalImage() throws IOException;

    BufferedImage getImagePreview(int width) throws IOException;

    WritableImage getImagePreviewFX(int width) throws IOException;

    int getImageHeightScaled(int width);

    int getInitialWidth();

    int getInitialHeight();

    double getRotationDegrees();

    void setRotationDegrees(double rotationDegrees);
}
