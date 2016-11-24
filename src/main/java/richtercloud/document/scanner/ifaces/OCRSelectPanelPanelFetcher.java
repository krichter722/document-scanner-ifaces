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

/**
 *
 * @author richter
 */
public interface OCRSelectPanelPanelFetcher {

    String fetch();

    void cancelFetch();

    void addProgressListener(OCRSelectPanelPanelFetcherProgressListener progressListener);

    void removeProgressListener(OCRSelectPanelPanelFetcherProgressListener progressListener);
}
