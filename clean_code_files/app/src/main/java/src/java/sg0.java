import android.text.Spanned;
import android.text.Spannable;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import java.util.ArrayList;
import android.text.Editable;
import org.xml.sax.ContentHandler;

public final class sg0 implements ContentHandler
{
    public final ContentHandler a;
    public final Editable b;
    public int c;
    public jo2 d;
    
    public sg0(final ContentHandler a, final Editable b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final jo2 d = this.d;
        if (d != null) {
            final int c = d.c();
            final Editable b = this.b;
            ((Spannable)b).setSpan((Object)d, c, ((CharSequence)b).length(), 33);
        }
        this.d = null;
    }
    
    public final void characters(final char[] array, final int n, final int n2) {
        this.a.characters(array, n, n2);
    }
    
    public final void endDocument() {
        this.a.endDocument();
    }
    
    public final void endElement(final String s, final String s2, final String s3) {
        if (s2 != null) {
            final int hashCode = s2.hashCode();
            if (hashCode != -1555043537) {
                if (hashCode != 3453) {
                    if (hashCode == 3735) {
                        if (s2.equals((Object)"ul")) {
                            this.a();
                            --this.c;
                            return;
                        }
                    }
                }
                else if (s2.equals((Object)"li")) {
                    this.a();
                    return;
                }
            }
            else if (s2.equals((Object)"annotation")) {
                final Editable b = this.b;
                final int length = ((CharSequence)b).length();
                final int n = 0;
                final Object[] spans = ((Spanned)b).getSpans(0, length, (Class)tg0.class);
                final ArrayList list = new ArrayList();
                for (final Object o : spans) {
                    if (((Spanned)b).getSpanFlags((Object)o) == 17) {
                        list.add(o);
                    }
                }
                for (int size = list.size(), j = n; j < size; ++j) {
                    final tg0 tg0 = (tg0)list.get(j);
                    final int spanStart = ((Spanned)b).getSpanStart((Object)tg0);
                    final int length3 = ((CharSequence)b).length();
                    ((Spannable)b).removeSpan((Object)tg0);
                    if (spanStart != length3) {
                        ((Spannable)b).setSpan((Object)tg0, spanStart, length3, 33);
                    }
                }
                return;
            }
        }
        this.a.endElement(s, s2, s3);
    }
    
    public final void endPrefixMapping(final String s) {
        this.a.endPrefixMapping(s);
    }
    
    public final void ignorableWhitespace(final char[] array, final int n, final int n2) {
        this.a.ignorableWhitespace(array, n, n2);
    }
    
    public final void processingInstruction(final String s, final String s2) {
        this.a.processingInstruction(s, s2);
    }
    
    public final void setDocumentLocator(final Locator documentLocator) {
        this.a.setDocumentLocator(documentLocator);
    }
    
    public final void skippedEntity(final String s) {
        this.a.skippedEntity(s);
    }
    
    public final void startDocument() {
        this.a.startDocument();
    }
    
    public final void startElement(String s, String s2, String s3, final Attributes attributes) {
        if (s2 != null) {
            final int hashCode = s2.hashCode();
            final Editable b = this.b;
            if (hashCode != -1555043537) {
                if (hashCode != 3453) {
                    if (hashCode == 3735) {
                        if (s2.equals((Object)"ul")) {
                            this.a();
                            ++this.c;
                            return;
                        }
                    }
                }
                else if (s2.equals((Object)"li")) {
                    this.a();
                    final ho2 e = ho2.e;
                    this.d = new jo2(o1r.f(), this.c, ((CharSequence)b).length());
                    return;
                }
            }
            else if (s2.equals((Object)"annotation")) {
                if (attributes != null) {
                    for (int length = attributes.getLength(), i = 0; i < length; ++i) {
                        s3 = attributes.getLocalName(i);
                        s2 = "";
                        if ((s = s3) == null) {
                            s = "";
                        }
                        s3 = attributes.getValue(i);
                        if (s3 != null) {
                            s2 = s3;
                        }
                        if (s.length() > 0 && s2.length() > 0) {
                            final int length2 = ((CharSequence)b).length();
                            ((Spannable)b).setSpan((Object)new tg0(s, s2), length2, length2, 17);
                        }
                    }
                }
                return;
            }
        }
        this.a.startElement(s, s2, s3, attributes);
    }
    
    public final void startPrefixMapping(final String s, final String s2) {
        this.a.startPrefixMapping(s, s2);
    }
}
