import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.api.account.DocumentAcceptance;
import java.util.Map;
import java.util.ArrayList;
import com.anthropic.claude.ui.components.snackbar.a;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.account.AcceptLegalDocsRequest;
import java.util.List;

public final class yq8
{
    public final t7d a;
    public final f6 b;
    
    public yq8(final t7d a, final f6 b) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final List list, mn2 v, final h07 h07) {
        Object o = null;
        Label_0054: {
            if (h07 instanceof xq8) {
                final xq8 xq8 = (xq8)h07;
                final int y = xq8.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    xq8.y = y + Integer.MIN_VALUE;
                    o = xq8;
                    break Label_0054;
                }
            }
            o = new xq8(this, h07);
        }
        final Object w = ((xq8)o).w;
        final int y2 = ((xq8)o).y;
        Object o2;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ((xq8)o).v;
            vt4.g0(w);
            o2 = w;
        }
        else {
            vt4.g0(w);
            final AcceptLegalDocsRequest acceptLegalDocsRequest = new AcceptLegalDocsRequest(list);
            ((xq8)o).v = v;
            ((xq8)o).y = 1;
            final Object i = this.b.i(acceptLegalDocsRequest, (f07)o);
            final pc7 v2 = pc7.v;
            if ((o2 = i) == v2) {
                return v2;
            }
        }
        final ApiResult apiResult = (ApiResult)o2;
        com.anthropic.claude.ui.components.snackbar.a.a(apiResult, (xd3)v);
        return apiResult;
    }
    
    public final ArrayList b(final boolean b, final boolean b2, final boolean b3) {
        final Map map = (Map)this.a.d.getValue();
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        if (b) {
            final s7d z = s7d.z;
            final String s = (String)map.get((Object)z);
            if (s == null) {
                list2.add((Object)z);
            }
            if (s != null) {
                list.add((Object)new DocumentAcceptance(Boolean.TRUE, s));
            }
            final s7d x = s7d.x;
            final String s2 = (String)map.get((Object)x);
            if (s2 == null) {
                list2.add((Object)x);
            }
            if (s2 != null) {
                list.add((Object)new DocumentAcceptance(Boolean.TRUE, s2));
            }
        }
        if (b2 || b3) {
            final s7d y = s7d.y;
            final String s3 = (String)map.get((Object)y);
            if (s3 == null) {
                list2.add((Object)y);
            }
            if (s3 != null) {
                list.add((Object)new DocumentAcceptance(Boolean.valueOf(b2), s3));
            }
        }
        if (!list2.isEmpty()) {
            final StringBuilder sb = new StringBuilder("Legal document acceptance skipped: no loaded id for ");
            sb.append((Object)list2);
            SilentException.a(new SilentException(sb.toString()), lpl.w, (List)null, 6);
        }
        return list;
    }
}
