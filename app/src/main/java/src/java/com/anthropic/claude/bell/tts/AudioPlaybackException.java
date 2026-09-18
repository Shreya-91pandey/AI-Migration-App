package com.anthropic.claude.bell.tts;

final class AudioPlaybackException extends Exception
{
    public final boolean v;
    
    public AudioPlaybackException(final Exception ex, final boolean v) {
        super((Throwable)ex);
        this.v = v;
    }
    
    public final boolean a() {
        return this.v;
    }
}
