import android.graphics.Canvas$EdgeType;
import android.graphics.DrawFilter;
import android.graphics.Canvas$VertexMode;
import android.graphics.text.MeasuredText;
import android.graphics.RenderNode;
import android.graphics.Picture;
import android.graphics.NinePatch;
import android.graphics.fonts.Font;
import android.graphics.PorterDuff$Mode;
import android.graphics.BlendMode;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.graphics.Region$Op;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Path;
import android.graphics.Canvas;

public final class mfn extends Canvas
{
    public Canvas a;
    
    public final Canvas a() {
        final Canvas a = this.a;
        if (a != null) {
            return a;
        }
        hac.d("Text drawing wrapper is missing a Canvas!");
        ebq.a();
        return null;
    }
    
    public final boolean clipOutPath(final Path path) {
        return q3r.o(this.a(), path);
    }
    
    public final boolean clipOutRect(final float n, final float n2, final float n3, final float n4) {
        return q3r.p(this.a(), n, n2, n3, n4);
    }
    
    public final boolean clipOutRect(final int n, final int n2, final int n3, final int n4) {
        return q3r.q(this.a(), n, n2, n3, n4);
    }
    
    public final boolean clipOutRect(final Rect rect) {
        return q3r.r(this.a(), rect);
    }
    
    public final boolean clipOutRect(final RectF rectF) {
        return q3r.s(this.a(), rectF);
    }
    
    public final boolean clipPath(final Path path) {
        return this.a().clipPath(path);
    }
    
    public final boolean clipPath(final Path path, final Region$Op region$Op) {
        return this.a().clipPath(path, region$Op);
    }
    
    public final boolean clipRect(final float n, final float n2, final float n3, final float n4) {
        return this.a().clipRect(n, n2, n3, n4);
    }
    
    public final boolean clipRect(final float n, final float n2, final float n3, final float n4, final Region$Op region$Op) {
        return this.a().clipRect(n, n2, n3, n4, region$Op);
    }
    
    public final boolean clipRect(final int n, final int n2, final int n3, final int n4) {
        return this.a().clipRect(n, n2, n3, n4);
    }
    
    public final boolean clipRect(final Rect rect) {
        return this.a().clipRect(rect);
    }
    
    public final boolean clipRect(final Rect rect, final Region$Op region$Op) {
        return this.a().clipRect(rect, region$Op);
    }
    
    public final boolean clipRect(final RectF rectF) {
        return this.a().clipRect(rectF);
    }
    
    public final boolean clipRect(final RectF rectF, final Region$Op region$Op) {
        return this.a().clipRect(rectF, region$Op);
    }
    
    public final void concat(final Matrix matrix) {
        this.a().concat(matrix);
    }
    
    public final void disableZ() {
        r3r.h(this.a());
    }
    
    public final void drawARGB(final int n, final int n2, final int n3, final int n4) {
        this.a().drawARGB(n, n2, n3, n4);
    }
    
    public final void drawArc(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final boolean b, final Paint paint) {
        this.a().drawArc(n, n2, n3, n4, n5, n6, b, paint);
    }
    
    public final void drawArc(final RectF rectF, final float n, final float n2, final boolean b, final Paint paint) {
        this.a().drawArc(rectF, n, n2, b, paint);
    }
    
    public final void drawBitmap(final Bitmap bitmap, final float n, final float n2, final Paint paint) {
        this.a().drawBitmap(bitmap, n, n2, paint);
    }
    
    public final void drawBitmap(final Bitmap bitmap, final Matrix matrix, final Paint paint) {
        this.a().drawBitmap(bitmap, matrix, paint);
    }
    
    public final void drawBitmap(final Bitmap bitmap, final Rect rect, final Rect rect2, final Paint paint) {
        this.a().drawBitmap(bitmap, rect, rect2, paint);
    }
    
    public final void drawBitmap(final Bitmap bitmap, final Rect rect, final RectF rectF, final Paint paint) {
        this.a().drawBitmap(bitmap, rect, rectF, paint);
    }
    
    public final void drawBitmap(final int[] array, final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final boolean b, final Paint paint) {
        this.a().drawBitmap(array, n, n2, n3, n4, n5, n6, b, paint);
    }
    
    public final void drawBitmap(final int[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b, final Paint paint) {
        this.a().drawBitmap(array, n, n2, n3, n4, n5, n6, b, paint);
    }
    
    public final void drawBitmapMesh(final Bitmap bitmap, final int n, final int n2, final float[] array, final int n3, final int[] array2, final int n4, final Paint paint) {
        this.a().drawBitmapMesh(bitmap, n, n2, array, n3, array2, n4, paint);
    }
    
    public final void drawCircle(final float n, final float n2, final float n3, final Paint paint) {
        this.a().drawCircle(n, n2, n3, paint);
    }
    
    public final void drawColor(final int n) {
        this.a().drawColor(n);
    }
    
    public final void drawColor(final int n, final BlendMode blendMode) {
        r3r.i(this.a(), n, blendMode);
    }
    
    public final void drawColor(final int n, final PorterDuff$Mode porterDuff$Mode) {
        this.a().drawColor(n, porterDuff$Mode);
    }
    
    public final void drawColor(final long n) {
        r3r.j(this.a(), n);
    }
    
    public final void drawColor(final long n, final BlendMode blendMode) {
        r3r.k(this.a(), n, blendMode);
    }
    
    public final void drawDoubleRoundRect(final RectF rectF, final float n, final float n2, final RectF rectF2, final float n3, final float n4, final Paint paint) {
        r3r.l(this.a(), rectF, n, n2, rectF2, n3, n4, paint);
    }
    
    public final void drawDoubleRoundRect(final RectF rectF, final float[] array, final RectF rectF2, final float[] array2, final Paint paint) {
        r3r.m(this.a(), rectF, array, rectF2, array2, paint);
    }
    
    public final void drawGlyphs(final int[] array, final int n, final float[] array2, final int n2, final int n3, final Font font, final Paint paint) {
        u3r.f(this.a(), array, n, array2, n2, n3, font, paint);
    }
    
    public final void drawLine(final float n, final float n2, final float n3, final float n4, final Paint paint) {
        this.a().drawLine(n, n2, n3, n4, paint);
    }
    
    public final void drawLines(final float[] array, final int n, final int n2, final Paint paint) {
        this.a().drawLines(array, n, n2, paint);
    }
    
    public final void drawLines(final float[] array, final Paint paint) {
        this.a().drawLines(array, paint);
    }
    
    public final void drawOval(final float n, final float n2, final float n3, final float n4, final Paint paint) {
        this.a().drawOval(n, n2, n3, n4, paint);
    }
    
    public final void drawOval(final RectF rectF, final Paint paint) {
        this.a().drawOval(rectF, paint);
    }
    
    public final void drawPaint(final Paint paint) {
        this.a().drawPaint(paint);
    }
    
    public final void drawPatch(final NinePatch ninePatch, final Rect rect, final Paint paint) {
        u3r.g(this.a(), ninePatch, rect, paint);
    }
    
    public final void drawPatch(final NinePatch ninePatch, final RectF rectF, final Paint paint) {
        u3r.h(this.a(), ninePatch, rectF, paint);
    }
    
    public final void drawPath(final Path path, final Paint paint) {
        this.a().drawPath(path, paint);
    }
    
    public final void drawPicture(final Picture picture) {
        this.a().drawPicture(picture);
    }
    
    public final void drawPicture(final Picture picture, final Rect rect) {
        this.a().drawPicture(picture, rect);
    }
    
    public final void drawPicture(final Picture picture, final RectF rectF) {
        this.a().drawPicture(picture, rectF);
    }
    
    public final void drawPoint(final float n, final float n2, final Paint paint) {
        this.a().drawPoint(n, n2, paint);
    }
    
    public final void drawPoints(final float[] array, final int n, final int n2, final Paint paint) {
        this.a().drawPoints(array, n, n2, paint);
    }
    
    public final void drawPoints(final float[] array, final Paint paint) {
        this.a().drawPoints(array, paint);
    }
    
    public final void drawPosText(final String s, final float[] array, final Paint paint) {
        this.a().drawPosText(s, array, paint);
    }
    
    public final void drawPosText(final char[] array, final int n, final int n2, final float[] array2, final Paint paint) {
        this.a().drawPosText(array, n, n2, array2, paint);
    }
    
    public final void drawRGB(final int n, final int n2, final int n3) {
        this.a().drawRGB(n, n2, n3);
    }
    
    public final void drawRect(final float n, final float n2, final float n3, final float n4, final Paint paint) {
        this.a().drawRect(n, n2, n3, n4, paint);
    }
    
    public final void drawRect(final Rect rect, final Paint paint) {
        this.a().drawRect(rect, paint);
    }
    
    public final void drawRect(final RectF rectF, final Paint paint) {
        this.a().drawRect(rectF, paint);
    }
    
    public final void drawRenderNode(final RenderNode renderNode) {
        r3r.n(this.a(), renderNode);
    }
    
    public final void drawRoundRect(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final Paint paint) {
        this.a().drawRoundRect(n, n2, n3, n4, n5, n6, paint);
    }
    
    public final void drawRoundRect(final RectF rectF, final float n, final float n2, final Paint paint) {
        this.a().drawRoundRect(rectF, n, n2, paint);
    }
    
    public final void drawText(final CharSequence charSequence, final int n, final int n2, final float n3, final float n4, final Paint paint) {
        this.a().drawText(charSequence, n, n2, n3, n4, paint);
    }
    
    public final void drawText(final String s, final float n, final float n2, final Paint paint) {
        this.a().drawText(s, n, n2, paint);
    }
    
    public final void drawText(final String s, final int n, final int n2, final float n3, final float n4, final Paint paint) {
        this.a().drawText(s, n, n2, n3, n4, paint);
    }
    
    public final void drawText(final char[] array, final int n, final int n2, final float n3, final float n4, final Paint paint) {
        this.a().drawText(array, n, n2, n3, n4, paint);
    }
    
    public final void drawTextOnPath(final String s, final Path path, final float n, final float n2, final Paint paint) {
        this.a().drawTextOnPath(s, path, n, n2, paint);
    }
    
    public final void drawTextOnPath(final char[] array, final int n, final int n2, final Path path, final float n3, final float n4, final Paint paint) {
        this.a().drawTextOnPath(array, n, n2, path, n3, n4, paint);
    }
    
    public final void drawTextRun(final MeasuredText measuredText, final int n, final int n2, final int n3, final int n4, final float n5, final float n6, final boolean b, final Paint paint) {
        r3r.o(this.a(), measuredText, n, n2, n3, n4, n5, n6, b, paint);
    }
    
    public final void drawTextRun(final CharSequence charSequence, final int n, final int n2, final int n3, final int n4, final float n5, final float n6, final boolean b, final Paint paint) {
        this.a().drawTextRun(charSequence, n, n2, n3, n4, n5, n6, b, paint);
    }
    
    public final void drawTextRun(final char[] array, final int n, final int n2, final int n3, final int n4, final float n5, final float n6, final boolean b, final Paint paint) {
        this.a().drawTextRun(array, n, n2, n3, n4, n5, n6, b, paint);
    }
    
    public final void drawVertices(final Canvas$VertexMode canvas$VertexMode, final int n, final float[] array, final int n2, final float[] array2, final int n3, final int[] array3, final int n4, final short[] array4, final int n5, final int n6, final Paint paint) {
        this.a().drawVertices(canvas$VertexMode, n, array, n2, array2, n3, array3, n4, array4, n5, n6, paint);
    }
    
    public final void enableZ() {
        r3r.p(this.a());
    }
    
    public final boolean getClipBounds(final Rect rect) {
        final boolean clipBounds = this.a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }
    
    public final int getDensity() {
        return this.a().getDensity();
    }
    
    public final DrawFilter getDrawFilter() {
        return this.a().getDrawFilter();
    }
    
    public final int getHeight() {
        return this.a().getHeight();
    }
    
    public final void getMatrix(final Matrix matrix) {
        this.a().getMatrix(matrix);
    }
    
    public final int getMaximumBitmapHeight() {
        return this.a().getMaximumBitmapHeight();
    }
    
    public final int getMaximumBitmapWidth() {
        return this.a().getMaximumBitmapWidth();
    }
    
    public final int getSaveCount() {
        return this.a().getSaveCount();
    }
    
    public final int getWidth() {
        return this.a().getWidth();
    }
    
    public final boolean isOpaque() {
        return this.a().isOpaque();
    }
    
    public final boolean quickReject(final float n, final float n2, final float n3, final float n4) {
        return t3r.l(this.a(), n, n2, n3, n4);
    }
    
    public final boolean quickReject(final float n, final float n2, final float n3, final float n4, final Canvas$EdgeType canvas$EdgeType) {
        return this.a().quickReject(n, n2, n3, n4, canvas$EdgeType);
    }
    
    public final boolean quickReject(final Path path) {
        return t3r.m(this.a(), path);
    }
    
    public final boolean quickReject(final Path path, final Canvas$EdgeType canvas$EdgeType) {
        return this.a().quickReject(path, canvas$EdgeType);
    }
    
    public final boolean quickReject(final RectF rectF) {
        return t3r.n(this.a(), rectF);
    }
    
    public final boolean quickReject(final RectF rectF, final Canvas$EdgeType canvas$EdgeType) {
        return this.a().quickReject(rectF, canvas$EdgeType);
    }
    
    public final void restore() {
        this.a().restore();
    }
    
    public final void restoreToCount(final int n) {
        this.a().restoreToCount(n);
    }
    
    public final void rotate(final float n) {
        this.a().rotate(n);
    }
    
    public final int save() {
        return this.a().save();
    }
    
    public final int saveLayer(final float n, final float n2, final float n3, final float n4, final Paint paint) {
        return this.a().saveLayer(n, n2, n3, n4, paint);
    }
    
    public final int saveLayer(final float n, final float n2, final float n3, final float n4, final Paint paint, final int n5) {
        return this.a().saveLayer(n, n2, n3, n4, paint, n5);
    }
    
    public final int saveLayer(final RectF rectF, final Paint paint) {
        return this.a().saveLayer(rectF, paint);
    }
    
    public final int saveLayer(final RectF rectF, final Paint paint, final int n) {
        return this.a().saveLayer(rectF, paint, n);
    }
    
    public final int saveLayerAlpha(final float n, final float n2, final float n3, final float n4, final int n5) {
        return this.a().saveLayerAlpha(n, n2, n3, n4, n5);
    }
    
    public final int saveLayerAlpha(final float n, final float n2, final float n3, final float n4, final int n5, final int n6) {
        return this.a().saveLayerAlpha(n, n2, n3, n4, n5, n6);
    }
    
    public final int saveLayerAlpha(final RectF rectF, final int n) {
        return this.a().saveLayerAlpha(rectF, n);
    }
    
    public final int saveLayerAlpha(final RectF rectF, final int n, final int n2) {
        return this.a().saveLayerAlpha(rectF, n, n2);
    }
    
    public final void scale(final float n, final float n2) {
        this.a().scale(n, n2);
    }
    
    public final void setBitmap(final Bitmap bitmap) {
        this.a().setBitmap(bitmap);
    }
    
    public final void setDensity(final int density) {
        this.a().setDensity(density);
    }
    
    public final void setDrawFilter(final DrawFilter drawFilter) {
        this.a().setDrawFilter(drawFilter);
    }
    
    public final void setMatrix(final Matrix matrix) {
        this.a().setMatrix(matrix);
    }
    
    public final void skew(final float n, final float n2) {
        this.a().skew(n, n2);
    }
    
    public final void translate(final float n, final float n2) {
        this.a().translate(n, n2);
    }
}
