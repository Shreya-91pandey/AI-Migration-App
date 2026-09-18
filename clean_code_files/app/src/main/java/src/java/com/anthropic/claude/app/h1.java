package com.anthropic.claude.app;

import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.types.strings.ProjectId;

public final class h1 implements lta
{
    public final frg v;
    
    public h1(final frg v) {
        this.v = v;
    }
    
    public final Object b(final Object o) {
        final ClaudeAppDestination.List.ProjectDetails projectDetails = new ClaudeAppDestination.List.ProjectDetails(new ProjectDetailsScreenParams(((ProjectId)o).a, 0));
        final fo3 n = fo3.N;
        final frg v = this.v;
        v.b((lta)new tu4(projectDetails, v, (byte)2), (zta)n);
        return lqo.a;
    }
}
