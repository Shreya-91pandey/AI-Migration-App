import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import android.content.SharedPreferences;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.api.account.Organization;
import java.util.List;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.ArrayList;
import android.widget.Toast;
import java.util.Map;
import com.anthropic.claude.types.strings.AccountId;
import android.content.Context;

public final class u9
{
    public static final pgf g;
    public final Context a;
    public final s3p b;
    public final ep0 c;
    public final r6 d;
    public final j6 e;
    public final pgg f;
    
    static {
        final f3 f3 = new f3((byte)6);
        final int a = gj0.a;
        g = new pgf((lta)f3);
    }
    
    public u9(final Context a, final s3p b, final ep0 c, final r6 d, final j6 e, final pgg f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final boolean a(final String s, String string, final int n, final jta jta) {
        final s3p b = this.b;
        final Context a = this.a;
        if (s != null && !s.equals(b.c)) {
            if (!this.c.j().contains((Object)new AccountId(s))) {
                jta.a();
                final List a2 = adn.a;
                adn.e(6, t.s(n).concat(": switch requested to an account that is no longer signed in; ignoring"), (String)null, (Map)null);
                Toast.makeText(a, 2131757788, 0).show();
            }
            else {
                final SharedPreferences m = smk.m("account_prefs", s, a.getApplicationContext(), 0);
                Object o;
                if ((o = m.getAll()) == null) {
                    o = s89.v;
                }
                final Iterable iterable = (Iterable)((Map)o).keySet();
                final ArrayList list = new ArrayList();
                for (final Object next : iterable) {
                    final String s2 = (String)next;
                    if (!mlc.q((Object)s2, (Object)"conway_saved_client_id")) {
                        s2.getClass();
                        if (!rym.E0(s2, "conway_composer_draft_", false) && !rym.E0(s2, "conway_viewing_fork_", false) && !rym.E0(s2, "conway_send_outbox_", false)) {
                            continue;
                        }
                    }
                    list.add(next);
                }
                if (!list.isEmpty()) {
                    final SharedPreferences$Editor edit = m.edit();
                    edit.getClass();
                    final Iterator iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        edit.remove((String)iterator2.next());
                    }
                    edit.apply();
                }
                string = m.getString("selected_org_id", (String)null);
                if (string == null) {
                    string = null;
                }
                Object o2;
                if (string != null) {
                    o2 = new OrganizationId(string);
                }
                else {
                    o2 = null;
                }
                o50.Q(o2);
                if ((string = (String)o50.Q((Object)m.getString("display_email", (String)null)).getValue()) == null) {
                    string = s;
                }
                Toast.makeText(a, (CharSequence)a.getString(2131757307, new Object[] { string }), 0).show();
                this.d.c(n, s);
            }
        }
        else {
            if (string != null && !string.equals(b.d)) {
                while (true) {
                    for (final Object next2 : (List)this.e.c.getValue()) {
                        if (mlc.q((Object)((Organization)next2).a, (Object)string)) {
                            final Organization organization = (Organization)next2;
                            if (organization == null) {
                                jta.a();
                                SilentException.a(new SilentException(t.s(n).concat(": switch requested to an organization the account is not a member of")), lpl.w, (List)null, 6);
                                Toast.makeText(a, 2131757789, 0).show();
                                return true;
                            }
                            Toast.makeText(a, (CharSequence)a.getString(2131757308, new Object[] { organization.b }), 0).show();
                            this.f.a(string);
                            return true;
                        }
                    }
                    Object next2 = null;
                    continue;
                }
            }
            return false;
        }
        return true;
    }
}
