package com.anthropic.claude.app;

import java.util.List;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.IncomingShareEvents$IncomingShareDefaultToNewChatApplied;
import java.util.function.UnaryOperator;

public final class d3 implements jja
{
    public final u88 A;
    public final ax3 v;
    public final j7c w;
    public final ep0 x;
    public final gwj y;
    public final st4 z;
    
    public d3(final ax3 v, final j7c w, final ep0 x, final gwj y, final st4 z, final u88 a) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
    }
    
    public final Object l(final Object o, final f07 f07) {
        final yog yog = (yog)o;
        final gwj y = this.y;
        final lqo a = lqo.a;
        final j7c w = this.w;
        final boolean booleanValue = (boolean)yog.v;
        final ClaudeAppOverlay claudeAppOverlay = (ClaudeAppOverlay)yog.w;
        final boolean b = booleanValue && this.v.a.h("claudeai_share_target_chooser");
        if (booleanValue && !b) {
            synchronized (w) {
                ((List)w.a).replaceAll((UnaryOperator)new g7c());
                return a;
            }
        }
        final boolean k = this.x.k();
        int n;
        if (b && claudeAppOverlay.equals(ClaudeAppOverlay.None.INSTANCE)) {
            if (k) {
                n = 2;
            }
            else {
                n = 1;
            }
        }
        else if (!b && claudeAppOverlay.equals(ClaudeAppOverlay.ShareTargetChooser.INSTANCE)) {
            n = 3;
        }
        else {
            n = 4;
        }
        final int d = ge9.D(n);
        if (d == 0) {
            y.b((lta)new u52((Object)ClaudeAppOverlay.ShareTargetChooser.INSTANCE, (byte)25), (zta)new hyh((byte)18));
            return a;
        }
        if (d == 1) {
            final st4 z = this.z;
            final IncomingShareEvents$IncomingShareDefaultToNewChatApplied incomingShareEvents$IncomingShareDefaultToNewChatApplied = new IncomingShareEvents$IncomingShareDefaultToNewChatApplied();
            final KSerializer serializer = IncomingShareEvents$IncomingShareDefaultToNewChatApplied.Companion.serializer();
            vt4.b0(serializer);
            z.b((v10)incomingShareEvents$IncomingShareDefaultToNewChatApplied, (KSerializer)serializer);
            w.f(new iql(this.A.a().a()));
            return a;
        }
        if (d == 2) {
            y.b((lta)ndl.A, (zta)new hyh((byte)17));
            return a;
        }
        if (d == 3) {
            return a;
        }
        en9.r();
        return null;
    }
}
