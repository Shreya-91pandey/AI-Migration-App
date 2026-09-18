import org.xml.sax.ContentHandler;
import org.xml.sax.XMLReader;
import android.text.Editable;
import android.text.Html$TagHandler;

public final class ynb implements Html$TagHandler
{
    public final void handleTag(final boolean b, final String s, final Editable editable, final XMLReader xmlReader) {
        if (xmlReader != null) {
            if (editable != null) {
                if (b && mlc.q((Object)s, (Object)"ContentHandlerReplacementTag")) {
                    xmlReader.setContentHandler((ContentHandler)new sg0(xmlReader.getContentHandler(), editable));
                }
            }
        }
    }
}
